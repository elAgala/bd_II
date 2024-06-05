/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import org.bson.Document;

/**
 *
 * @author hp
 */
public class Producto {
    private String id;
    private String titulo;
    private String descripcion;
    private int precio;

    public Producto(String id_producto, String titulo, String descripcion, int precio) {
        this.id = id_producto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public static Producto fromDocument(Document document) {
        String id = document.getObjectId("_id").toString();
        String titulo = document.getString("titulo");
        String descripcion = document.getString("descripcion");
        int precio = document.getInteger("precio");
        return new Producto(id, titulo, descripcion, precio);
    }

    public String getId_producto() {
        return id;
    }

    public void setId_producto(String id_producto) {
        this.id = id_producto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
