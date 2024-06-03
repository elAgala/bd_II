/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package IGU.Menu;

import IGU.Pago.PaginaPago;
import Logica.Controladora;
import Logica.Producto;
import Logica.Usuario;
import java.awt.BorderLayout;

/**
 *
 * @author hp
 */
public class PaginaCarrito extends javax.swing.JPanel {

    /**
     * Creates new form PaginaCarrito
     */

    public PaginaCarrito(){
        initComponents();
        Controladora control = new Controladora();
        
        this.usuario = control.getUsuario();
        indice = 0;
        total = 0;
        if (!usuario.getCarrito().isEmpty()){
            InicializarItem(indice);
            for (Producto p:usuario.getCarrito()){
                total += p.getCantidad()*p.getPrecio();
            }
        }
        this.texto_total.setText(Integer.toString(total));
        this.BotonAnterior.setEnabled(false);
        if (usuario.getCarrito().size() <= 1)
            this.BotonSiguiente.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        DescripcionCarrito = new javax.swing.JLabel();
        TituloCarrito = new javax.swing.JLabel();
        BotonAnterior = new javax.swing.JButton();
        BotonSiguiente = new javax.swing.JButton();
        CantidadCarrito = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        BotonPagar = new javax.swing.JButton();
        texto_total = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mi carrito");

        DescripcionCarrito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DescripcionCarrito.setText("         ");

        TituloCarrito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TituloCarrito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloCarrito.setText("       ");

        BotonAnterior.setText("Anterior");
        BotonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnteriorActionPerformed(evt);
            }
        });

        BotonSiguiente.setText("Siguiente");
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });

        CantidadCarrito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CantidadCarrito.setText("     ");

        jLabel2.setText("Cantidad:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Total: ");

        jLabel4.setText("Precio:");

        precio.setText("      ");

        BotonPagar.setText("Ir a pagar");
        BotonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPagarActionPerformed(evt);
            }
        });

        texto_total.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        texto_total.setText("total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(BotonAnterior)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(DescripcionCarrito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TituloCarrito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(33, 33, 33)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CantidadCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(BotonSiguiente)
                .addGap(108, 108, 108)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(texto_total)
                .addGap(0, 239, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(347, 347, 347))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BotonSiguiente)
                                .addComponent(jLabel3)
                                .addComponent(texto_total))
                            .addComponent(BotonAnterior))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TituloCarrito)
                        .addGap(18, 18, 18)
                        .addComponent(DescripcionCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantidadCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(precio))
                .addGap(18, 18, 18)
                .addComponent(BotonPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPagarActionPerformed
        PaginaPago pp = new PaginaPago();
        pp.setSize(800,409);
        pp.setLocation(0, 0);
        
        this.removeAll();
        this.add(pp,BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_BotonPagarActionPerformed

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
        if (indice < usuario.getCarrito().size()){
            indice++;
            InicializarItem(indice);
            this.BotonAnterior.setEnabled(true);
        }
        else{
        }
        
        if (indice >= usuario.getCarrito().size()-1){
            this.BotonSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    private void BotonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnteriorActionPerformed
        if (indice != 0){
            indice--;
            InicializarItem(indice);
            this.BotonSiguiente.setEnabled(true);
        }
        else{}
        
        if (indice == 0)
            this.BotonAnterior.setEnabled(false);
    }//GEN-LAST:event_BotonAnteriorActionPerformed

    private void InicializarItem(int i){
        Producto p = usuario.getCarrito().get(i);
        this.TituloCarrito.setText(p.getTitulo());
        this.DescripcionCarrito.setText(p.getDescripcion());
        this.CantidadCarrito.setText(Integer.toString(p.getCantidad()));
        this.precio.setText(Integer.toString(p.getCantidad()*p.getPrecio()));
    }

    private int indice;
    private Usuario usuario;
    private int total;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JButton BotonPagar;
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JTextField CantidadCarrito;
    private javax.swing.JLabel DescripcionCarrito;
    private javax.swing.JLabel TituloCarrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel texto_total;
    // End of variables declaration//GEN-END:variables
}
