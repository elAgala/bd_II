package Persistencia.Repositorio;

import Logica.CarritoItem;
import Logica.Factura;
import Logica.Producto;
import Logica.Usuario;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Field;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FacturaRepo {
    private final MongoCollection<Document> facturas;

    public FacturaRepo(MongoDatabase db) {
        this.facturas = db.getCollection("facturas");
    }

    public void guardarFactura(Factura factura) {
        Document doc = new Document();
        doc.append("pago", factura.getPago());
        doc.append("total", factura.getTotal());
        doc.append("userId", new ObjectId(factura.getUsuario().getId()));

        ArrayList<Document> carritoDocuments = new ArrayList<>();
        for(CarritoItem item : factura.getCarrito()) {
            carritoDocuments.add(item.toDocument());
        }
        doc.append("carrito", carritoDocuments);

        this.facturas.insertOne(doc);
    }

    public Factura[] getAllFacturas() {
        List<Factura> facturas = new ArrayList<>();

        List<Bson> pipeline = Arrays.asList(
                new Document("$lookup", new Document("from", "users")
                        .append("localField", "userId")
                        .append("foreignField", "_id")
                        .append("as", "usuario")),
                new Document("$unwind", "$usuario"),
                new Document("$lookup", new Document("from", "productos")
                        .append("localField", "carrito.productoId")
                        .append("foreignField", "_id")
                        .append("as", "productos")),
                new Document("$addFields", new Document("carrito", new Document("$map", new Document("input", "$carrito")
                        .append("as", "c")
                        .append("in", new Document("cantidad", "$$c.cantidad")
                                .append("producto", new Document("$arrayElemAt", Arrays.asList(new Document("$filter", new Document("input", "$productos")
                                        .append("as", "p")
                                        .append("cond", new Document("$eq", Arrays.asList("$$p._id", "$$c.productoId")))), 0)))))))
        );

        // Execute aggregation
        this.facturas.aggregate(pipeline).forEach((Document facturaDoc) -> {
            Factura factura = Factura.fromDocument(facturaDoc);
            facturas.add(factura);
        });

        return facturas.toArray(new Factura[0]);
    }

    public void seedearCollection(Usuario[] usuarios, Producto[] productos) {
        this.facturas.drop();
        for(int i = 0; i < 4; i++) {
            String pago = i % 2 == 0 ? "Tarjeta" : "Efectivo";
            ArrayList<CarritoItem> carrito = new ArrayList<>();
            int total = 0;
            Producto primerProducto = productos[i * 2];
            Producto segundoProducto = productos[(i * 2) + 1];
            total += primerProducto.getPrecio();
            total += segundoProducto.getPrecio();
            carrito.add(new CarritoItem(primerProducto, i + 1));
            carrito.add(new CarritoItem(segundoProducto, i + 2));

            guardarFactura(new Factura(null, pago, carrito, total, usuarios[i]));
        }
        System.out.println("Facturas :: Seeded");
    }
}
