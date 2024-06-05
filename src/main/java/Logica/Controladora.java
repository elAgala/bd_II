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
public class Controladora {
    Usuario usuario;
    public ArrayList<Producto> stock;
    
    public Controladora(){
        this.stock = new ArrayList<>();
        this.usuario = new Usuario(null, "admin","admin","Administrador Sistema",12345678,"Av. Idependencia 1234");
        Producto p1 = new Producto("1","Bicicleta","Es una bicicleta para hacer ejercicio",1000);
        Producto p2 = new Producto("2","Pelota de futbol","Es una pelota para jugar al futbol",300);
        Producto p3 = new Producto("3","Zapatillas","Son zapatillas especiales para correr",500);
        Producto p4 = new Producto("4","Pelota de basquet","Es una pelota para jugar al basquet",300);
        Producto p5 = new Producto("5","Creatina","Es un suplemento deportivo",200);
        stock.add(p1);
        stock.add(p2);
        stock.add(p3);
        stock.add(p4);
        stock.add(p5);
        this.usuario.AgregarCarrito(p5);
       // this.usuario.BuscarCarrito(p5.getId_producto()).setCantidad(4);
        this.usuario.AgregarCarrito(p4);
        //this.usuario.BuscarCarrito(p4.getId_producto()).setCantidad(4);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
