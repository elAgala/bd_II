package Logica;

import org.bson.Document;
import org.bson.types.ObjectId;

public class CarritoItem {
    Producto producto;
    int cantidad;

    public CarritoItem(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public static CarritoItem fromDocument(Document documento){
        Producto producto = Producto.fromDocument(documento.get("producto", Document.class));
        int cantidad = documento.getInteger("cantidad");
        return new CarritoItem(producto, cantidad);
    }

    public Document toDocument() {
        Document doc = new Document();
        doc.append("productoId", new ObjectId(producto.getId_producto()));
        doc.append("cantidad", cantidad);
        return doc;
    }

    public Producto getProducto() { return producto; }

    public void setProducto(Producto producto) { this.producto = producto; }

    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}
