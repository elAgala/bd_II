package Persistencia.Repositorio;

import Logica.Producto;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class ProductoRepo {
    private final MongoCollection<Document> productos;

    public ProductoRepo(MongoDatabase db) {
        this.productos = db.getCollection("productos");
    }

    public Producto getProductById(String id) {
        Document result = this.productos.find(Filters.eq("_id", new ObjectId(id))).first();
        if(result == null || result.isEmpty()) throw new Error("Producto inexistente");
        return Producto.fromDocument(result);
    }

    public Producto[] getAllProducts() {
        System.out.println(this.productos.find());
        List<Document> result = this.productos.find().into(new ArrayList<>());
        return result.stream().map(Producto::fromDocument).toArray(Producto[]::new);
    }

    public String guardarProducto(Producto producto) {
        Document doc = new Document("titulo", producto.getTitulo())
                .append("descripcion", producto.getDescripcion())
                .append("precio", producto.getPrecio());
        this.productos.insertOne(doc);
        return doc.getObjectId("_id").toString();
    }

    public void seedearCollection() {
        this.productos.drop();
        guardarProducto(new Producto(null, "Producto 1", "Descripción del Producto 1", 50));
        guardarProducto(new Producto(null, "Producto 2", "Descripción del Producto 2", 100));
        guardarProducto(new Producto(null, "Producto 3", "Descripción del Producto 3", 75));
        guardarProducto(new Producto(null, "Producto 4", "Descripción del Producto 4", 120));
        guardarProducto(new Producto(null, "Producto 5", "Descripción del Producto 5", 80));
        guardarProducto(new Producto(null, "Producto 6", "Descripción del Producto 6", 90));
        guardarProducto(new Producto(null, "Producto 7", "Descripción del Producto 7", 110));
        guardarProducto(new Producto(null, "Producto 8", "Descripción del Producto 8", 70));
        System.out.println("Productos :: Seeded");
    }
}
