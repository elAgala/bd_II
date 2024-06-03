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
public class Factura {
    private int id_factura;
    private String pago;
    private ArrayList<Producto> pedido;
    private int total;

    public Factura(int id_factura, String pago, ArrayList<Producto> pedido, int total) {
        this.id_factura = id_factura;
        this.pago = pago;
        this.pedido = pedido;
        this.total = total;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public ArrayList<Producto> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Producto> pedido) {
        this.pedido = pedido;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }
    
    
}
