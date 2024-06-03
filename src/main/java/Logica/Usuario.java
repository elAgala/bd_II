/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Usuario {
    private String correo;
    private String contraseña;
    private String nombre;
    private int dni;
    private String direccion;
    private ArrayList<Producto> carrito;
    private ArrayList<Factura> facturas;

    public Usuario(String correo, String contraseña, String nombre, int dni, String direccion) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.carrito = new ArrayList<>();
        this.facturas = new ArrayList<>();
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Producto> carrito) {
        this.carrito = carrito;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }
    
    public void AgregarCarrito(Producto p){
        carrito.add(p);
    }
    
    public void EliminarCarrito(Producto p){
        carrito.remove(p);
    }
    
    public void AgregarFactura(Factura f){
        facturas.add(f);
    }
    
    public boolean ExisteEnCarrito(Producto p){
        return carrito.contains(p);
    }
    
    public Producto BuscarCarrito(int id){
        Producto prod = null;
        for (Producto p:carrito){
            if (p.getId_producto() == id)
                prod = p;
        }
        return prod;
    }
}
