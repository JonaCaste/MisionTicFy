/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.CancionControlador;
import modelo.Cancion;

/**
 *
 * @author jonas
 */
public class LeerVista extends javax.swing.JFrame {

    /**
     * Creates new form leerVista
     */
    public LeerVista() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        id_cancion_label = new javax.swing.JLabel();
        id_cancion_input = new javax.swing.JTextField();
        boton_leer = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombre_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        precio_label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        genero_label = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        duracion_label = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tiene_colaboracion_label = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        id_autor_label = new javax.swing.JLabel();
        boton_volver = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(626, 350));
        jPanel1.setMinimumSize(new java.awt.Dimension(626, 350));

        jLabel4.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        jLabel4.setText("Buscar canción");

        id_cancion_label.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        id_cancion_label.setText("Id de la canción");

        boton_leer.setBackground(new java.awt.Color(204, 102, 255));
        boton_leer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        boton_leer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_leerMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        jLabel16.setText("Buscar");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout boton_leerLayout = new javax.swing.GroupLayout(boton_leer);
        boton_leer.setLayout(boton_leerLayout);
        boton_leerLayout.setHorizontalGroup(
            boton_leerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton_leerLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel16)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        boton_leerLayout.setVerticalGroup(
            boton_leerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boton_leerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        nombre_label.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jLabel3.setText("Precio:");

        precio_label.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jLabel6.setText("Genero:");

        genero_label.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jLabel10.setText("Duración:");

        duracion_label.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jLabel12.setText("Tiene colaboración:");

        tiene_colaboracion_label.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jLabel8.setText("Id del autor");

        id_autor_label.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N

        boton_volver.setBackground(new java.awt.Color(204, 102, 255));
        boton_volver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        boton_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_volverMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Comfortaa", 1, 14)); // NOI18N
        jLabel17.setText("Volver");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout boton_volverLayout = new javax.swing.GroupLayout(boton_volver);
        boton_volver.setLayout(boton_volverLayout);
        boton_volverLayout.setHorizontalGroup(
            boton_volverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton_volverLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel17)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        boton_volverLayout.setVerticalGroup(
            boton_volverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boton_volverLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(14, 14, 14))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre_label)
                            .addComponent(precio_label)
                            .addComponent(genero_label))
                        .addGap(144, 144, 144)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(93, 93, 93)
                                .addComponent(duracion_label))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_autor_label)
                                    .addComponent(tiene_colaboracion_label)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(166, 166, 166))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(id_cancion_label)
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(id_cancion_input, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(boton_leer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(boton_volver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_leer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(id_cancion_input, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(id_cancion_label)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre_label))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(precio_label))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(genero_label)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(duracion_label))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tiene_colaboracion_label))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(id_autor_label))))
                .addGap(35, 35, 35)
                .addComponent(boton_volver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        
    }//GEN-LAST:event_jLabel16MouseClicked

    private void boton_leerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_leerMouseClicked
       System.out.println("prueba");
       
       int id_recibido = Integer.parseInt(id_cancion_input.getText());
       Cancion cancion = CancionControlador.leerCancion(id_recibido);
       
       nombre_label.setText(cancion.getNombre());
       precio_label.setText(Integer.toString(cancion.getPrecio()));
       genero_label.setText(cancion.getGenero());
       duracion_label.setText(Integer.toString(cancion.getDuracion()));
       tiene_colaboracion_label.setText(Integer.toString(cancion.getTieneColaboracion()));
       id_autor_label.setText(Integer.toString(cancion.getIdAutor()));
       
    }//GEN-LAST:event_boton_leerMouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void boton_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_volverMouseClicked
        this.setVisible(false);
        CancionVista cancion = new CancionVista();
        cancion.setVisible(true);
    }//GEN-LAST:event_boton_volverMouseClicked

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
            java.util.logging.Logger.getLogger(LeerVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeerVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeerVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeerVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeerVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boton_leer;
    private javax.swing.JPanel boton_volver;
    private javax.swing.JLabel duracion_label;
    private javax.swing.JLabel genero_label;
    private javax.swing.JLabel id_autor_label;
    private javax.swing.JTextField id_cancion_input;
    private javax.swing.JLabel id_cancion_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombre_label;
    private javax.swing.JLabel precio_label;
    private javax.swing.JLabel tiene_colaboracion_label;
    // End of variables declaration//GEN-END:variables
}