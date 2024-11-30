/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectointegrador;

import static com.mycompany.proyectointegrador.ProyectoIntegrador.carrito;
import java.util.Arrays;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mil_g
 */
public class Pagar extends javax.swing.JFrame {

    /**
     * Creates new form Pagar
     */
    public Pagar() {
        initComponents();
        iniciarTablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        correoField = new javax.swing.JTextField();
        contrasenaField = new javax.swing.JPasswordField();
        pagar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        pagar2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        pagar3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cvvField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tarjetaField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mesSpinner = new javax.swing.JSpinner();
        yearSpinner = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        pagoCarrito = new javax.swing.JTable();
        salirPago = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 241));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jTabbedPane1.setBackground(new java.awt.Color(254, 238, 184));
        jTabbedPane1.setForeground(new java.awt.Color(134, 116, 22));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(254, 238, 184));

        jLabel6.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(134, 116, 22));
        jLabel6.setText("Correo Electrónico");

        jLabel7.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(134, 116, 22));
        jLabel7.setText("Contraseña");

        correoField.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        correoField.setForeground(new java.awt.Color(134, 116, 22));

        contrasenaField.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        contrasenaField.setForeground(new java.awt.Color(134, 116, 22));

        pagar1.setBackground(new java.awt.Color(255, 255, 241));
        pagar1.setFont(new java.awt.Font("SimSun", 3, 14)); // NOI18N
        pagar1.setForeground(new java.awt.Color(134, 116, 22));
        pagar1.setText("Realizar Pago");
        pagar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contrasenaField)
                    .addComponent(correoField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pagar1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(correoField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(contrasenaField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(pagar1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("PayPal", jPanel2);

        jPanel3.setBackground(new java.awt.Color(254, 238, 184));

        pagar2.setBackground(new java.awt.Color(255, 255, 241));
        pagar2.setFont(new java.awt.Font("SimSun", 3, 14)); // NOI18N
        pagar2.setForeground(new java.awt.Color(134, 116, 22));
        pagar2.setText("Realizar Orden de Pago");
        pagar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagar2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(134, 116, 22));
        jLabel11.setText("Referencia de pago");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(134, 116, 22));
        jRadioButton1.setText("BBVA");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(134, 116, 22));
        jRadioButton2.setText("Santander");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(134, 116, 22));
        jRadioButton3.setText("Banorte");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(134, 116, 22));
        jRadioButton4.setText("Banco Azteca");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(134, 116, 22));
        jRadioButton5.setText("HSBC");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(134, 116, 22));
        jRadioButton6.setText("NU");

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(134, 116, 22));
        jRadioButton7.setText("Klar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 63, Short.MAX_VALUE)
                        .addComponent(pagar2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton7))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(pagar2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Trasferencia", jPanel3);

        jPanel4.setBackground(new java.awt.Color(254, 238, 184));

        pagar3.setBackground(new java.awt.Color(255, 255, 241));
        pagar3.setFont(new java.awt.Font("SimSun", 3, 14)); // NOI18N
        pagar3.setForeground(new java.awt.Color(134, 116, 22));
        pagar3.setText("Realizar Pago");
        pagar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagar3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(134, 116, 22));
        jLabel8.setText("CVV");

        cvvField.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        cvvField.setForeground(new java.awt.Color(134, 116, 22));
        cvvField.setPreferredSize(new java.awt.Dimension(70, 20));
        cvvField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvvFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(134, 116, 22));
        jLabel9.setText("Número de Tarjeta");

        tarjetaField.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        tarjetaField.setForeground(new java.awt.Color(134, 116, 22));

        jLabel10.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(134, 116, 22));
        jLabel10.setText("Fecha de Vencimiento");

        jLabel12.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(134, 116, 22));
        jLabel12.setText("M M / Y Y ");

        mesSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        yearSpinner.setModel(new javax.swing.SpinnerNumberModel(25, 25, 99, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 114, Short.MAX_VALUE)
                        .addComponent(pagar3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tarjetaField)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(mesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yearSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cvvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(tarjetaField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(cvvField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(pagar3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pago con Tarjeta", jPanel4);

        pagoCarrito.setBackground(new java.awt.Color(254, 238, 184));
        pagoCarrito.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        pagoCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pelicula", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pagoCarrito.setPreferredSize(new java.awt.Dimension(150, 600));
        jScrollPane1.setViewportView(pagoCarrito);

        salirPago.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        salirPago.setForeground(new java.awt.Color(134, 116, 22));
        salirPago.setText("SALIR");
        salirPago.setPreferredSize(new java.awt.Dimension(73, 23));
        salirPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirPagoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(134, 116, 22));
        jLabel1.setText("Total acomulado: $");

        total.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        total.setForeground(new java.awt.Color(134, 116, 22));
        total.setText("--------");

        jLabel3.setFont(new java.awt.Font("SimSun", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(134, 116, 22));
        jLabel3.setText("Carrito");

        jLabel4.setFont(new java.awt.Font("SimSun", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(134, 116, 22));
        jLabel4.setText("Método de Pago");

        jLabel5.setFont(new java.awt.Font("Goudy Old Style", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(134, 116, 22));
        jLabel5.setText("Confirmación de Compra");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(salirPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(376, 376, 376))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(salirPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirPagoActionPerformed
        // TODO add your handling code here:
        new comprador().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_salirPagoActionPerformed

    private void pagar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagar2ActionPerformed
        // TODO add your handling code here:
        PagoTransferencia pago = new PagoTransferencia(Double.parseDouble(total.getText()));
    
    // Obtener el boton seleccionado
    JRadioButton selectedButton = null;
    for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements(); ) {
        JRadioButton button = (JRadioButton) buttons.nextElement();
        if (button.isSelected()) {
            selectedButton = button;
            break;
        }
    }
    
    //Obtener el texto del boton
    if (selectedButton != null) {
        System.out.println(selectedButton.getText());  // Print the text of the selected radio button
        pago.realizarPago(selectedButton.getText());  // Pass the text of the selected button to the 'realizarPago' method
    } else {
        // Handle case where no radio button is selected (if needed)
        JOptionPane.showMessageDialog(null, "Seleccione un banco");
    }
    
    int answer = JOptionPane.showConfirmDialog(null, pago, "Pago Transferencia", JOptionPane.YES_NO_OPTION);
    if (answer == JOptionPane.YES_OPTION) {
        JOptionPane.showMessageDialog(null, "Realice el pago para confirmar su compra dentro de las próximas 24hrs");
        JOptionPane.showMessageDialog(null, "Pago realizado con éxito");
        carrito.clear();
        salirPagoActionPerformed(evt);
    }
    }//GEN-LAST:event_pagar2ActionPerformed

    private void cvvFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvvFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvvFieldActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void pagar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagar1ActionPerformed
        // TODO add your handling code here:
        boolean mail=false,pass=false;
        int answer=JOptionPane.NO_OPTION;
        if(correoField.getText().contains("@gmail.com")){
            mail=true;
        }
        char[] passField=new char[]{};
        if(!Arrays.equals(contrasenaField.getPassword(), passField)){
            pass=true;
        }
        if(mail && pass){
            answer=JOptionPane.showConfirmDialog(null, "Confirmar Compra", "Confirmación", JOptionPane.YES_NO_OPTION, 1);
        } else {
            JOptionPane.showMessageDialog(null, "Correo o Contraseña inválidos");
        }
        if(answer == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Pago realizado con éxito");
            correoField.setText("");
            contrasenaField.setText("");
            carrito.clear();
            salirPagoActionPerformed(evt);
        }
    }//GEN-LAST:event_pagar1ActionPerformed

    private void pagar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagar3ActionPerformed
        // TODO add your handling code here:
        boolean flagNum,flagCvv;
        flagNum=validarEntrada("Número de Tarjeta",16,tarjetaField.getText());
        flagCvv=validarEntrada("CVV",3,cvvField.getText());
        PagoTarjeta pago=new PagoTarjeta(Double.parseDouble(total.getText()));
        if(flagNum && flagCvv){
            pago.setNumeroCuenta(tarjetaField.getText());
            pago.setCVV(cvvField.getText());
            pago.setAnio(String.valueOf(yearSpinner.getValue()));
            pago.setMes(String.valueOf(mesSpinner.getValue()));
            int respuesta = JOptionPane.showConfirmDialog(null, "Se realizará el pago a la siguiente cuenta\n"+pago, "Confirmación pago", JOptionPane.YES_NO_OPTION);
            if(respuesta==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Pago realizado correctamente por el monto de $"+total.getText());
                carrito.clear();
                salirPagoActionPerformed(evt);
            }
        }
    }//GEN-LAST:event_pagar3ActionPerformed

    public final void iniciarTablas(){
        DefaultTableModel n=(DefaultTableModel)pagoCarrito.getModel();
        Producto objeto;
        double importe=0;
        for(int i=0;i<carrito.size();i++){
            objeto=carrito.get(i);
            n.addRow(new Object[]{objeto.getNombre(),objeto.getPrecio()});
            importe=importe+objeto.getPrecio();
        }
        
        total.setText(String.valueOf(importe));
    }
    
    public static boolean validarEntrada(String dato,int tamano,String info){
        if(info.matches("\\d{"+tamano+"}")){
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Ingrese numero de "+tamano+" digitos en el campo: "+dato);
            return false;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField contrasenaField;
    private javax.swing.JTextField correoField;
    private javax.swing.JTextField cvvField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JSpinner mesSpinner;
    private javax.swing.JButton pagar1;
    private javax.swing.JButton pagar2;
    private javax.swing.JButton pagar3;
    private javax.swing.JTable pagoCarrito;
    private javax.swing.JButton salirPago;
    private javax.swing.JTextField tarjetaField;
    private javax.swing.JLabel total;
    private javax.swing.JSpinner yearSpinner;
    // End of variables declaration//GEN-END:variables
}
