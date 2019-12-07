
package edu.itsj.sistema_abcc;

import controlador.AlumnoDAO;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import modelo.Alumno;
import edu.itsj.sistema_abcc.ResultSetTableModel;


public class VentanaAltas extends javax.swing.JInternalFrame {

    AlumnoDAO adao = new AlumnoDAO();
    
    public VentanaAltas() {
        initComponents();
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cajaNumeroControl = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cajaPrimerAp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cajaSegundoAp = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        spinnerEdad = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        comboBoxSemestre = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        comboBoxCarrera = new javax.swing.JComboBox<>();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGREGAR ALUMNOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Número de Control: ");

        cajaNumeroControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNumeroControlActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Primer Apellido:");

        cajaPrimerAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaPrimerApActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Segundo Apellido:");

        cajaSegundoAp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaSegundoApActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Edad:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Semestre:");

        comboBoxSemestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opcion", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Carrera:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        comboBoxCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opcion", "Licenciatura en Administración", "Contador Público", "Ingeniería en Industrias Alimentarias", "Ingeniería Mecatrónica", "Ingeniería en Sistemas Computacionales" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(cajaNumeroControl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cajaSegundoAp)
                                    .addComponent(spinnerEdad)
                                    .addComponent(comboBoxSemestre, 0, 170, Short.MAX_VALUE)
                                    .addComponent(comboBoxCarrera, javax.swing.GroupLayout.Alignment.TRAILING, 0, 170, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(cajaPrimerAp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cajaNumeroControl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cajaPrimerAp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cajaSegundoAp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(spinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboBoxSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboBoxCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNumeroControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNumeroControlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNumeroControlActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void cajaPrimerApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaPrimerApActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaPrimerApActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(estaVacio(cajaNumeroControl, cajaNombre, cajaPrimerAp, cajaSegundoAp, comboBoxCarrera, comboBoxSemestre, spinnerEdad) == false){
            
            Alumno alumno = new Alumno(cajaNumeroControl.getText(), cajaNombre.getText(), cajaPrimerAp.getText(), cajaSegundoAp.getText(), (byte)(int)spinnerEdad.getValue(), Byte.parseByte(comboBoxSemestre.getSelectedItem().toString()), comboBoxCarrera.getSelectedItem().toString());
            
            Alumno al = adao.buscarAlumno(cajaNumeroControl.getText(), "NumControl");
            if (al == null){
                if (adao.agregarAlumno(alumno) == true) {
                    JOptionPane.showMessageDialog(rootPane, "Alumno agregado.");
                    restablecerCompontes(cajaNumeroControl, cajaNombre, cajaPrimerAp, cajaSegundoAp, comboBoxCarrera, comboBoxSemestre, spinnerEdad);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error al agregar el alumno.");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "El numero de control ingresado ya existe.");
            }   
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Aún hay campos vacíos.");
        }
            
        actualizarTablas(tabla);
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cajaSegundoApActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaSegundoApActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaSegundoApActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField cajaNombre;
    public javax.swing.JTextField cajaNumeroControl;
    public javax.swing.JTextField cajaPrimerAp;
    public javax.swing.JTextField cajaSegundoAp;
    public javax.swing.JComboBox<String> comboBoxCarrera;
    public javax.swing.JComboBox<String> comboBoxSemestre;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JSpinner spinnerEdad;
    public javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    // Metodos varios
    
    public void actualizarTablas(JTable tabla) {

        String controlador = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/BD_Escuela?useTimezone=true&serverTimezone=UTC";
        String consulta = "SELECT * FROM Alumnos";
        ResultSetTableModel modeloDatos = null;

        try {
            modeloDatos = new ResultSetTableModel(controlador, url, consulta);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        tabla.setModel(modeloDatos);
    }
    
    public void restablecerCompontes(JComponent... componentes) {
        for (JComponent c : componentes) {
            if(c instanceof JTextField) {
                ((JTextField) c).setText("");
            }

            if(c instanceof JComboBox) {
                ((JComboBox) c).setSelectedIndex(0);
            }
            
            if(c instanceof JSpinner) {
                ((JSpinner) c).setValue(0);
            }
            
        }
    }

    public boolean estaVacio(JComponent... componentes){
        boolean b = false;
        for (JComponent c : componentes) {
            if(c instanceof JTextField) {
                if( ((JTextField) c).getText().equals("")){
                    b = true;
                    break;
                }
            }
            if(c instanceof JComboBox) {
                if( ((JComboBox) c).getSelectedIndex() == 0 ) {
                    b = true;
                    break;
                }
            }
            if(c instanceof JSpinner) {
                if( (int)((JSpinner) c).getValue() == 0 ) {
                    b = true;
                    break;
                }
            }
        }
        return b;
    }

}
