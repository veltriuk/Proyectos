/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ade7880_gui1;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANDRES ARCINIEGAS
 */
public class TabContainer extends javax.swing.JFrame {

    /**
     * Creates new form TabContainer
     */
    
    Controller controller;
    public TabContainer() {
        initComponents();
        controller = new Controller();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        AutoTab = new javax.swing.JPanel();
        tf_registro = new javax.swing.JTextField();
        cbx_registroManual = new javax.swing.JCheckBox();
        tf_medidasPromedio = new javax.swing.JTextField();
        btn_start = new javax.swing.JButton();
        btn_stop = new javax.swing.JButton();
        scrolltable = new javax.swing.JScrollPane();
        table_values = new javax.swing.JTable();
        cb_entrada = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb_sistemaNum = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tf_periodo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_console = new javax.swing.JTextArea();
        ManualTab = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cb_registro = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_consoleSpeedTest = new javax.swing.JTextArea();
        btn_go = new javax.swing.JButton();
        tf_time = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSpeed = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tf_registro.setText("0");

        cbx_registroManual.setText("Registro");

        tf_medidasPromedio.setText("20");

        btn_start.setText("Start");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });

        btn_stop.setText("Stop");
        btn_stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stopActionPerformed(evt);
            }
        });

        table_values.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A", "B", "C", "Otro"
            }
        ));
        scrolltable.setViewportView(table_values);

        cb_entrada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VRMS", "IRMS" }));

        jLabel1.setText("Entrada");

        jLabel2.setText("Número de medidas (promedio)");

        jLabel3.setText("Periodo (s)");

        cb_sistemaNum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dec", "hex", "bin" }));

        jLabel4.setText("Visualización");

        tf_periodo.setText("1");

        ta_console.setColumns(20);
        ta_console.setRows(5);
        jScrollPane1.setViewportView(ta_console);

        javax.swing.GroupLayout AutoTabLayout = new javax.swing.GroupLayout(AutoTab);
        AutoTab.setLayout(AutoTabLayout);
        AutoTabLayout.setHorizontalGroup(
            AutoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AutoTabLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(AutoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(AutoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tf_periodo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addGroup(AutoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tf_medidasPromedio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cb_sistemaNum, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AutoTabLayout.createSequentialGroup()
                            .addComponent(cbx_registroManual)
                            .addGap(18, 18, 18)
                            .addComponent(tf_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cb_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AutoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AutoTabLayout.createSequentialGroup()
                        .addComponent(btn_start)
                        .addGap(18, 18, 18)
                        .addComponent(btn_stop))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrolltable, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AutoTabLayout.setVerticalGroup(
            AutoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AutoTabLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(AutoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_start)
                    .addComponent(btn_stop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AutoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AutoTabLayout.createSequentialGroup()
                        .addComponent(cb_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_medidasPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_periodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_sistemaNum, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(AutoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_registroManual)
                            .addComponent(tf_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(AutoTabLayout.createSequentialGroup()
                        .addComponent(scrolltable, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Auto Registers", AutoTab);

        jLabel5.setText("Registro");

        cb_registro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AVRMS", "BVRMS", "CVRMS" }));

        ta_consoleSpeedTest.setColumns(20);
        ta_consoleSpeedTest.setRows(5);
        jScrollPane2.setViewportView(ta_consoleSpeedTest);

        btn_go.setText("GO!");
        btn_go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goActionPerformed(evt);
            }
        });

        jLabel6.setText("Tiempo");

        jLabel7.setText("s");

        tableSpeed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "No.", "Valor"
            }
        ));
        jScrollPane3.setViewportView(tableSpeed);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("00:00");

        javax.swing.GroupLayout ManualTabLayout = new javax.swing.GroupLayout(ManualTab);
        ManualTab.setLayout(ManualTabLayout);
        ManualTabLayout.setHorizontalGroup(
            ManualTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManualTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManualTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(ManualTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ManualTabLayout.createSequentialGroup()
                        .addComponent(tf_time, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(28, 28, 28)
                .addGroup(ManualTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ManualTabLayout.createSequentialGroup()
                        .addComponent(btn_go, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        ManualTabLayout.setVerticalGroup(
            ManualTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManualTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManualTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ManualTabLayout.createSequentialGroup()
                        .addGroup(ManualTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cb_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ManualTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(ManualTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_go)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Speed Test", ManualTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        ((DefaultTableModel)table_values.getModel()).setRowCount(0);
        controller.startReading(cb_entrada.getSelectedItem().toString(),Integer.parseInt(tf_medidasPromedio.getText()),Integer.parseInt(tf_periodo.getText()),cb_sistemaNum.getSelectedItem().toString(), cbx_registroManual.isSelected(), tf_registro.toString());
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stopActionPerformed
        controller.stopInfiniteLoop();
    }//GEN-LAST:event_btn_stopActionPerformed

    private void btn_goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goActionPerformed
        controller.speedTest(cb_registro.getSelectedItem().toString(), tf_time.getText());
    }//GEN-LAST:event_btn_goActionPerformed

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
            java.util.logging.Logger.getLogger(TabContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabContainer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AutoTab;
    private javax.swing.JPanel ManualTab;
    private javax.swing.JButton btn_go;
    private javax.swing.JButton btn_start;
    private javax.swing.JButton btn_stop;
    private javax.swing.JComboBox<String> cb_entrada;
    private javax.swing.JComboBox<String> cb_registro;
    private javax.swing.JComboBox<String> cb_sistemaNum;
    private javax.swing.JCheckBox cbx_registroManual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JScrollPane scrolltable;
    private javax.swing.JTextArea ta_console;
    private javax.swing.JTextArea ta_consoleSpeedTest;
    private javax.swing.JTable tableSpeed;
    private javax.swing.JTable table_values;
    private javax.swing.JTextField tf_medidasPromedio;
    private javax.swing.JTextField tf_periodo;
    private javax.swing.JTextField tf_registro;
    private javax.swing.JTextField tf_time;
    // End of variables declaration//GEN-END:variables
    public JTable getTable_values() {
        return table_values;
    }

    public JTextArea getTa_console() {
        return ta_console;
    }
    
    public JScrollPane getScrollTable() {
        return scrolltable;
    }

}
