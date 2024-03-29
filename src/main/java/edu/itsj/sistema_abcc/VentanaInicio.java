/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.itsj.sistema_abcc;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JTable;
import edu.itsj.sistema_abcc.ResultSetTableModel;

/**
 *
 * @author Benja
 */
public class VentanaInicio extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInicio
     */
    public VentanaInicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Acciones = new javax.swing.JMenu();
        menuAltas = new javax.swing.JMenuItem();
        menuBajas = new javax.swing.JMenuItem();
        menuCambios = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 837, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );

        Acciones.setText("Acciones");

        menuAltas.setText("Altas");
        menuAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAltasActionPerformed(evt);
            }
        });
        Acciones.add(menuAltas);

        menuBajas.setText("Bajas");
        menuBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBajasActionPerformed(evt);
            }
        });
        Acciones.add(menuBajas);

        menuCambios.setText("Cambios");
        menuCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCambiosActionPerformed(evt);
            }
        });
        Acciones.add(menuCambios);

        menuConsultas.setText("Consultas");
        menuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultasActionPerformed(evt);
            }
        });
        Acciones.add(menuConsultas);

        jMenuBar1.add(Acciones);

        jMenu2.setText("Tablas");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Acerca");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    VentanaAltas vA = new VentanaAltas();
    VentanaBajas vB = new VentanaBajas();
    VentanaCambios vM = new VentanaCambios();
    VentanaConsultas vC = new VentanaConsultas();
    
    public void actualizarTablas(JTable tabla) {

        String controlador = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/BD_Escuela?useTimezone=true&serverTimezone=UTC";
        String consulta = "SELECT * FROM Alumnos";
        ResultSetTableModel modeloDatos = null;

        try {
            modeloDatos = new ResultSetTableModel(controlador, url, consulta);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaInicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaInicio.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        tabla.setModel(modeloDatos);
    }
    
    
    private void menuAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAltasActionPerformed
        jDesktopPane1.add(vA);
        vA.setVisible(true);
        vB.setVisible(false);
        vM.setVisible(false);
        vC.setVisible(false);
        actualizarTablas(vA.tabla);
    }//GEN-LAST:event_menuAltasActionPerformed

    private void menuBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBajasActionPerformed
        jDesktopPane1.add(vB);
        vA.setVisible(false);
        vB.setVisible(true);
        vM.setVisible(false);
        vC.setVisible(false);
        actualizarTablas(vB.tabla2);
    }//GEN-LAST:event_menuBajasActionPerformed

    private void menuCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCambiosActionPerformed
        jDesktopPane1.add(vM);
        vA.setVisible(false);
        vB.setVisible(false);
        vM.setVisible(true);
        vC.setVisible(false);
        actualizarTablas(vM.tabla3);
    }//GEN-LAST:event_menuCambiosActionPerformed

    private void menuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultasActionPerformed
        jDesktopPane1.add(vC);
        vA.setVisible(false);
        vB.setVisible(false);
        vM.setVisible(false);
        vC.setVisible(true);
        actualizarTablas(vC.tabla4);
    }//GEN-LAST:event_menuConsultasActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Acciones;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAltas;
    private javax.swing.JMenuItem menuBajas;
    private javax.swing.JMenuItem menuCambios;
    private javax.swing.JMenuItem menuConsultas;
    // End of variables declaration//GEN-END:variables
}
