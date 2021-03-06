/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayed2_proyecto_parte1;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Luigi PC
 */
public class AlasUcuJFrame extends javax.swing.JFrame {

    private Administracion alasUcu;
    /**
     * Creates new form AlasUcuJFrame
     */
    public AlasUcuJFrame() {
        initComponents();
        cargarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        origenComboBox = new javax.swing.JComboBox<>();
        destinoComboBox = new javax.swing.JComboBox<>();
        btnBuscarVuelos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listVuelosTotales = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listVueloMenor = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        escalasComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AlasUcu");

        origenComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origenComboBoxActionPerformed(evt);
            }
        });

        btnBuscarVuelos.setText("Buscar Vuelos");
        btnBuscarVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVuelosActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listVuelosTotales);

        listVueloMenor.setAutoscrolls(false);
        jScrollPane2.setViewportView(listVueloMenor);

        jLabel1.setText("Vuelo de menor costo...");

        jLabel2.setText("Origen");

        jLabel3.setText("Destino");

        jLabel4.setText("Todos los vuelos...");

        jLabel5.setText("Escalas:");

        escalasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Directo", "1", "2", "3", "4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(origenComboBox, 0, 207, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarVuelos))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(destinoComboBox, 0, 205, Short.MAX_VALUE)
                            .addComponent(escalasComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origenComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarVuelos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(escalasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void origenComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origenComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_origenComboBoxActionPerformed

    private void btnBuscarVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVuelosActionPerformed
        DefaultListModel<String> lista = new DefaultListModel();
        DefaultListModel<String> listaMenor = new DefaultListModel();
        String origen = (String) origenComboBox.getSelectedItem();
        String destino = (String) destinoComboBox.getSelectedItem();
        int escalas = escalasComboBox.getSelectedIndex() + 1;
        TVuelos vuelos = alasUcu.obtenerCaminos(alasUcu.getAeropuertos().get(origen).getEtiqueta(), alasUcu.getAeropuertos().get(destino).getEtiqueta(), escalas);
        if (vuelos != null){
            for (TVuelo v : vuelos.getVuelos()){
                lista.addElement(v.imprimirEtiquetas());
            }
            listVuelosTotales.setModel(lista);
            listaMenor.addElement(vuelos.obtenerMenor().imprimirEtiquetas());
            listVueloMenor.setModel(listaMenor);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "No hay vuelos disponibles entre " + origen + " y " + destino + ".");
        }
    }//GEN-LAST:event_btnBuscarVuelosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlasUcuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarVuelos;
    private javax.swing.JComboBox<String> destinoComboBox;
    private javax.swing.JComboBox<String> escalasComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listVueloMenor;
    private javax.swing.JList<String> listVuelosTotales;
    private javax.swing.JComboBox<String> origenComboBox;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
        String[] listaAeropuertos = ManejadorArchivosGenerico.leerArchivo("./src/ayed2_proyecto_parte1/Aeropuertos.csv", false);
        for (String s: listaAeropuertos){
            String[] datos = s.split(",");
            origenComboBox.addItem(datos[1]);
            destinoComboBox.addItem(datos[1]);
        }
        alasUcu = new Administracion();
        alasUcu.cargarDatos("./src/ayed2_proyecto_parte1/Aerolineas.csv",
                "./src/ayed2_proyecto_parte1/Aeropuertos.csv",
                "./src/ayed2_proyecto_parte1/vuelos_produccion.csv");
    }
}
