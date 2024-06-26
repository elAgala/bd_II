/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package IGU.Producto;

import javax.swing.BorderFactory;
import javax.swing.text.StyledDocument;

/**
 *
 * @author hp
 */
public class PaginaProducto extends javax.swing.JPanel {

    /**
     * Creates new form PaginaProducto
     */
    public PaginaProducto() {
        initComponents();
    }

    public PaginaProducto(String nombre, String desc, int id){
        initComponents();
        this.jScrollPane1.setBorder(null);
        Descripcion.setEditable(false); 
        Descripcion.setCursor(null); 
        Descripcion.setOpaque(false); 
        Descripcion.setFocusable(false); 
        Descripcion.setWrapStyleWord(true); 
        Descripcion.setLineWrap(true); 

        this.Titulo.setText(nombre);
        this.Descripcion.setText(desc);
        this.id = id;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        BotonAñadirCarrito = new javax.swing.JButton();

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Titulo");

        Descripcion.setColumns(20);
        Descripcion.setRows(5);
        Descripcion.setBorder(null);
        jScrollPane1.setViewportView(Descripcion);

        BotonAñadirCarrito.setText("Añadir");
        BotonAñadirCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAñadirCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BotonAñadirCarrito)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Titulo)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonAñadirCarrito)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAñadirCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAñadirCarritoActionPerformed
        
    }//GEN-LAST:event_BotonAñadirCarritoActionPerformed

    public int getId(){
        return id;
    }

    private int id;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAñadirCarrito;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JLabel Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
