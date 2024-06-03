/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package IGU.Menu;

import IGU.Logueo.InicioSesion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class MenuPrincipal extends javax.swing.JPanel {

    public MenuPrincipal() {
        initComponents();
        PaginaInicio pi = new PaginaInicio();
        MostrarPanel(pi,this.VisualizarPanel,800,409);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        BotonInicio = new javax.swing.JButton();
        BotonCarrito = new javax.swing.JButton();
        BotonFacturas = new javax.swing.JButton();
        BotonCuenta = new javax.swing.JButton();
        BotonCerrarSesion = new javax.swing.JButton();
        VisualizarPanel = new javax.swing.JPanel();

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        BotonInicio.setBackground(new java.awt.Color(102, 102, 102));
        BotonInicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonInicio.setForeground(new java.awt.Color(255, 255, 255));
        BotonInicio.setText("Inicio");
        BotonInicio.setBorder(null);
        BotonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonInicioMouseExited(evt);
            }
        });
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });

        BotonCarrito.setBackground(new java.awt.Color(102, 102, 102));
        BotonCarrito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonCarrito.setForeground(new java.awt.Color(255, 255, 255));
        BotonCarrito.setText("Mi Carrito");
        BotonCarrito.setBorder(null);
        BotonCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonCarritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonCarritoMouseExited(evt);
            }
        });
        BotonCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCarritoActionPerformed(evt);
            }
        });

        BotonFacturas.setBackground(new java.awt.Color(102, 102, 102));
        BotonFacturas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonFacturas.setForeground(new java.awt.Color(255, 255, 255));
        BotonFacturas.setText("Mis Facturas");
        BotonFacturas.setBorder(null);
        BotonFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonFacturasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonFacturasMouseExited(evt);
            }
        });
        BotonFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFacturasActionPerformed(evt);
            }
        });

        BotonCuenta.setBackground(new java.awt.Color(102, 102, 102));
        BotonCuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonCuenta.setForeground(new java.awt.Color(255, 255, 255));
        BotonCuenta.setText("Mi Cuenta");
        BotonCuenta.setBorder(null);
        BotonCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonCuentaMouseExited(evt);
            }
        });
        BotonCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCuentaActionPerformed(evt);
            }
        });

        BotonCerrarSesion.setBackground(new java.awt.Color(102, 102, 102));
        BotonCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrarSesion.setText("Cerrar Sesion");
        BotonCerrarSesion.setBorder(null);
        BotonCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonCerrarSesionMouseExited(evt);
            }
        });
        BotonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(BotonInicio)
                .addGap(18, 18, 18)
                .addComponent(BotonCarrito)
                .addGap(18, 18, 18)
                .addComponent(BotonFacturas)
                .addGap(18, 18, 18)
                .addComponent(BotonCuenta)
                .addGap(18, 18, 18)
                .addComponent(BotonCerrarSesion)
                .addGap(158, 158, 158))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonInicio)
                    .addComponent(BotonCarrito)
                    .addComponent(BotonFacturas)
                    .addComponent(BotonCuenta)
                    .addComponent(BotonCerrarSesion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        VisualizarPanel.setPreferredSize(new java.awt.Dimension(800, 409));

        javax.swing.GroupLayout VisualizarPanelLayout = new javax.swing.GroupLayout(VisualizarPanel);
        VisualizarPanel.setLayout(VisualizarPanelLayout);
        VisualizarPanelLayout.setHorizontalGroup(
            VisualizarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        VisualizarPanelLayout.setVerticalGroup(
            VisualizarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(VisualizarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VisualizarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCarritoActionPerformed
        PaginaCarrito pc = new PaginaCarrito();
        MostrarPanel(pc,this.VisualizarPanel,800,409);
    }//GEN-LAST:event_BotonCarritoActionPerformed

    private void BotonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarSesionActionPerformed
        InicioSesion is = new InicioSesion();
        MostrarPanel(is,this,800,500);
    }//GEN-LAST:event_BotonCerrarSesionActionPerformed

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        PaginaInicio pi = new PaginaInicio();
        MostrarPanel(pi,this.VisualizarPanel,800,409);
    }//GEN-LAST:event_BotonInicioActionPerformed

    private void BotonFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFacturasActionPerformed
        PaginaFacturas pf = new PaginaFacturas();
        MostrarPanel(pf,this.VisualizarPanel,800,409);
    }//GEN-LAST:event_BotonFacturasActionPerformed

    private void BotonCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCuentaActionPerformed
        PaginaCuenta pc = new PaginaCuenta();
        MostrarPanel(pc,this.VisualizarPanel,800,409);
    }//GEN-LAST:event_BotonCuentaActionPerformed

    private void BotonInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseEntered
        Subrayado(BotonInicio, BotonInicio.getText());
    }//GEN-LAST:event_BotonInicioMouseEntered

    private void BotonInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioMouseExited
        SacarSubrayado(BotonInicio, "Inicio");
    }//GEN-LAST:event_BotonInicioMouseExited

    private void BotonCarritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCarritoMouseEntered
        Subrayado(BotonCarrito, BotonCarrito.getText());
    }//GEN-LAST:event_BotonCarritoMouseEntered

    private void BotonCarritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCarritoMouseExited
        SacarSubrayado(BotonCarrito, "Mi Carrito");
    }//GEN-LAST:event_BotonCarritoMouseExited

    private void BotonFacturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonFacturasMouseEntered
        Subrayado(BotonFacturas, BotonFacturas.getText());
    }//GEN-LAST:event_BotonFacturasMouseEntered

    private void BotonFacturasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonFacturasMouseExited
        SacarSubrayado(BotonFacturas, "Mis Facturas");
    }//GEN-LAST:event_BotonFacturasMouseExited

    private void BotonCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCuentaMouseEntered
        Subrayado(BotonCuenta, BotonCuenta.getText());
    }//GEN-LAST:event_BotonCuentaMouseEntered

    private void BotonCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCuentaMouseExited
        SacarSubrayado(BotonCuenta, "Mi Cuenta");
    }//GEN-LAST:event_BotonCuentaMouseExited

    private void BotonCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarSesionMouseEntered
        Subrayado(BotonCerrarSesion, BotonCerrarSesion.getText());
    }//GEN-LAST:event_BotonCerrarSesionMouseEntered

    private void BotonCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarSesionMouseExited
        SacarSubrayado(BotonCerrarSesion, "Cerrar Sesion");
    }//GEN-LAST:event_BotonCerrarSesionMouseExited

    private void MostrarPanel(JPanel p, JPanel r, int base, int altura){
        p.setSize(base, altura);
        p.setLocation(0, 0);
        
        r.removeAll();
        r.add(p, BorderLayout.CENTER);
        r.revalidate();
        r.repaint();
    }
    
    private void Subrayado(JButton b, String texto){
        b.setText("<html><u>" + texto + "</u></html>");
    }

    private void SacarSubrayado(JButton b, String texto){
        b.setText("<html>" + texto + "</html>");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCarrito;
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JButton BotonCuenta;
    private javax.swing.JButton BotonFacturas;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JPanel VisualizarPanel;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
