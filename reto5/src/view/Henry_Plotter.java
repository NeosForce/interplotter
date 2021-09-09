package view;

import controllers.IngredienteControlador;

public class Henry_Plotter extends javax.swing.JFrame {

    public Henry_Plotter() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        input_id_Ingrediente = new javax.swing.JTextField();
        Input_Nombre_Ingrediente = new javax.swing.JTextField();
        Input_Peso_Promedio = new javax.swing.JTextField();
        Input_Nivel_Reaccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Input_Stock = new javax.swing.JCheckBox();
        BotonCrearIngrediente = new javax.swing.JButton();
        Scrollpanel = new javax.swing.JScrollPane();
        tablaIngredientes = new javax.swing.JTable();
        Busqueda = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Actualizacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        input_id_Ingrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_id_IngredienteActionPerformed(evt);
            }
        });

        Input_Nombre_Ingrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_Nombre_IngredienteActionPerformed(evt);
            }
        });

        Input_Peso_Promedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_Peso_PromedioActionPerformed(evt);
            }
        });

        Input_Nivel_Reaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_Nivel_ReaccionActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel3.setText("Nombre");

        jLabel4.setText("Peso Promedio");

        jLabel5.setText("Nivel de reacción");

        Input_Stock.setText("En  bodega");
        Input_Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_StockActionPerformed(evt);
            }
        });

        BotonCrearIngrediente.setText("GUARDAR");
        BotonCrearIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearIngredienteActionPerformed(evt);
            }
        });

        tablaIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PESO PROMEDIO", "NIVEL DE REACCIÓN", "STOCK"
            }
        ));
        Scrollpanel.setViewportView(tablaIngredientes);
        if (tablaIngredientes.getColumnModel().getColumnCount() > 0) {
            tablaIngredientes.getColumnModel().getColumn(0).setHeaderValue("ID");
            tablaIngredientes.getColumnModel().getColumn(1).setHeaderValue("NOMBRE");
            tablaIngredientes.getColumnModel().getColumn(2).setHeaderValue("PESO PROMEDIO");
            tablaIngredientes.getColumnModel().getColumn(3).setHeaderValue("NIVEL DE REACCIÓN");
            tablaIngredientes.getColumnModel().getColumn(4).setHeaderValue("STOCK");
        }

        Busqueda.setText("CONSULTAR");
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });

        Eliminar.setText("ELIMINAR");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Actualizacion.setText("ACTUALIZAR");
        Actualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizacionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("BASE DE DATOS DE HENRY PLOTTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Scrollpanel)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonCrearIngrediente)
                                .addGap(76, 76, 76)
                                .addComponent(Busqueda))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(74, 74, 74))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(input_id_Ingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Input_Nombre_Ingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(Input_Peso_Promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Input_Nivel_Reaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Input_Stock)))
                                .addGap(107, 154, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(Actualizacion)
                                .addGap(68, 68, 68)
                                .addComponent(Eliminar)
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Scrollpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_id_Ingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input_Nombre_Ingrediente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input_Peso_Promedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input_Nivel_Reaccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input_Stock))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Busqueda)
                    .addComponent(BotonCrearIngrediente)
                    .addComponent(Eliminar)
                    .addComponent(Actualizacion))
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("INGREDIENTES", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_id_IngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_id_IngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_id_IngredienteActionPerformed

    private void BotonCrearIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearIngredienteActionPerformed
        // TODO add your handling code here
       
        String Nombre = Input_Nombre_Ingrediente.getText();
        double Peso_Promedio = Double.parseDouble(Input_Peso_Promedio.getText());
        double Nivel_Reaccion = Double.parseDouble(Input_Nivel_Reaccion.getText());
        boolean en_bodega = Input_Stock.isSelected();
        if (!"".equals(input_id_Ingrediente.getText())){
            int id_Ingrediente = Integer.parseInt(input_id_Ingrediente.getText());
            IngredienteControlador.crear_ingrediente(id_Ingrediente, Nombre, Peso_Promedio, Nivel_Reaccion, en_bodega);
        }else{
            IngredienteControlador.crear_ingrediente(Nombre, Peso_Promedio, Nivel_Reaccion, en_bodega);
        }
        
        
    }//GEN-LAST:event_BotonCrearIngredienteActionPerformed

    private void Input_Nombre_IngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_Nombre_IngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_Nombre_IngredienteActionPerformed

    private void Input_Peso_PromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_Peso_PromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_Peso_PromedioActionPerformed

    private void Input_Nivel_ReaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_Nivel_ReaccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_Nivel_ReaccionActionPerformed

    private void Input_StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_StockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_StockActionPerformed

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarActionPerformed

    private void ActualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizacionActionPerformed
        // TODO add your handling code here:
        String Nombre = Input_Nombre_Ingrediente.getText();
        double Peso_Promedio = Double.parseDouble(Input_Peso_Promedio.getText());
        double Nivel_Reaccion = Double.parseDouble(Input_Nivel_Reaccion.getText());
        boolean en_bodega = Input_Stock.isSelected();
        if (!"".equals(input_id_Ingrediente.getText())){
            int id_Ingrediente = Integer.parseInt(input_id_Ingrediente.getText());
            IngredienteControlador.actualizarIngrediente(Nombre, Peso_Promedio, Nivel_Reaccion, en_bodega, id_Ingrediente);
        }
        
    }//GEN-LAST:event_ActualizacionActionPerformed

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
            java.util.logging.Logger.getLogger(Henry_Plotter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Henry_Plotter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Henry_Plotter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Henry_Plotter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Henry_Plotter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Actualizacion;
    public javax.swing.JButton BotonCrearIngrediente;
    public javax.swing.JButton Busqueda;
    public javax.swing.JButton Eliminar;
    public javax.swing.JTextField Input_Nivel_Reaccion;
    public javax.swing.JTextField Input_Nombre_Ingrediente;
    public javax.swing.JTextField Input_Peso_Promedio;
    private javax.swing.JCheckBox Input_Stock;
    private javax.swing.JScrollPane Scrollpanel;
    public javax.swing.JTextField input_id_Ingrediente;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaIngredientes;
    // End of variables declaration//GEN-END:variables
}
