/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class Factura {
    private String id_factura;
    private String pago;
    private ArrayList<CarritoItem> carrito;
    private Usuario usuario;
    private int total;

    public Factura(String id_factura, String pago, ArrayList<CarritoItem> carrito, int total, Usuario usuario) {
        this.id_factura = id_factura;
        this.pago = pago;
        this.carrito = carrito;
        this.total = total;
        this.usuario = usuario;
    }

    public static Factura fromDocument(Document document) {
        ArrayList<CarritoItem> carrito = new ArrayList<>();
        List<Document> carritoDocument = document.getList("carrito", Document.class);
        for(Document carritoDoc : carritoDocument) {
            carrito.add(CarritoItem.fromDocument(carritoDoc));
        }
        String pago = document.getString("pago");
        int total = document.getInteger("total");
        String id_factura = document.getObjectId("_id").toString();
        Document usuario = document.get("usuario", Document.class);
        return new Factura(id_factura, pago, carrito, total, Usuario.fromDocument(usuario));
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public ArrayList<CarritoItem> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<CarritoItem> carrito) {
        this.carrito = carrito;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getId_factura() {
        return id_factura;
    }

    public void setId_factura(String id_factura) {
        this.id_factura = id_factura;
    }

    public Usuario getUsuario() {return usuario;}

    public void setUsuario(Usuario usuario) {this.usuario = usuario;}
    
}
