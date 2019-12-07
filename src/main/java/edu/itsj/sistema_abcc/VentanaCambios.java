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

public class VentanaCambios extends javax.swing.JInternalFrame {

    AlumnoDAO adao = new AlumnoDAO();
    
    public VentanaCambios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        numeroControl = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        mNombre = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        mApellidoP = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        mApellidoM = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla3 = new javax.swing.JTable();
        edad = new javax.swing.JTextField();
        semestre = new javax.swing.JTextField();
        carrera = new javax.swing.JTextField();

        setClosable(true);

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("CAMBIOS ALUMNOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel18.setText("Buscar ID:");

        numeroControl.setPreferredSize(new java.awt.Dimension(1, 20));
        numeroControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroControlActionPerformed(evt);
            }
        });

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(numeroControl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(numeroControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Nombre:");

        mNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNombreActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setText("Apellido Paterno:");

        mApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mApellidoPActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("Apellido Materno:");

        mApellidoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mApellidoMActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setText("Edad:");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel23.setText("Semestre:");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel24.setText("Carrera:");

        jButton7.setText("Modificar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Cancelar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        tabla3.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabla3MouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tabla3);

        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });

        semestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semestreActionPerformed(evt);
            }
        });

        carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addGap(18, 18, 18)
                                    .addComponent(mApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(18, 18, 18)
                                    .addComponent(mNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(mApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(mNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(mApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(mApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numeroControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroControlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroControlActionPerformed

    private void mNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mNombreActionPerformed

    private void mApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mApellidoPActionPerformed

    private void mApellidoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mApellidoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mApellidoMActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tabla3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla3MouseReleased
        mNombre.setText((String) tabla3.getValueAt(tabla3.getSelectedRow(), 1));
    }//GEN-LAST:event_tabla3MouseReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!numeroControl.getText().equals("")){
            Alumno al = adao.buscarAlumno(numeroControl.getText(), "NumControl");
            if(al != null){
                mNombre.setText(al.getNombre());
                mApellidoP.setText(al.getPrimerAp());
                mApellidoM.setText(al.getSegundoAp());
                edad.setText(al.getEdad()+"");
                semestre.setText(al.getSemestre()+"");
                carrera.setText(al.getCarrera());
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se encotraron resultados.");
            }
                
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingresa un numero de control a buscar.");
        }
            
    }//GEN-LAST:event_jButton6ActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void semestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semestreActionPerformed

    private void carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carreraActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(estaVacio(numeroControl, mNombre, mApellidoP, mApellidoM, edad, semestre, carrera) == false){
            Alumno alumno = new Alumno(numeroControl.getText(), mNombre.getText(), mApellidoP.getText(), mApellidoM.getText(), Byte.parseByte(edad.getText()), Byte.parseByte(semestre.getText()), carrera.getText());

            if(adao.modificarAlumno(alumno)){
                JOptionPane.showMessageDialog(rootPane, "Cambios guardados correctamente.");
                restablecerCompontes(numeroControl, mNombre, mApellidoP, mApellidoM, edad, semestre, carrera);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al modificar el registro.");
            }   
        } else {
            JOptionPane.showMessageDialog(rootPane, "Aún hay campos vacíos.");
        }   
        actualizarTablas(tabla3);
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField carrera;
    public javax.swing.JTextField edad;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel20;
    public javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTextField mApellidoM;
    public javax.swing.JTextField mApellidoP;
    public javax.swing.JTextField mNombre;
    public javax.swing.JTextField numeroControl;
    public javax.swing.JTextField semestre;
    public javax.swing.JTable tabla3;
    // End of variables declaration//GEN-END:variables
    
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
