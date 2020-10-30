package com.mycompany.tap.proyfinal;

import com.mycompany.dominio.Alumnos;
import com.mycompany.dominio.AlumnosJpaController;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AlumnosFrame extends javax.swing.JFrame {

    //--------------------------------------------------------------------------
    
    DefaultTableModel modelo;
    int numAlumnos;
    
    //--------------------------------------------------------------------------
    
    public AlumnosFrame() {
        initComponents();
        
        jTableListaAlumnos.setShowGrid(true);
        modelo = (DefaultTableModel)jTableListaAlumnos.getModel();
    }

    //--------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBarOpciones = new javax.swing.JToolBar();
        jButAgregar = new javax.swing.JButton();
        jButModificar = new javax.swing.JButton();
        jButEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaAlumnos = new javax.swing.JTable();
        jLabNumAlumnos = new javax.swing.JLabel();
        jButCerrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuConsultar = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alumnos");
        setBackground(new java.awt.Color(153, 153, 153));

        jToolBarOpciones.setBackground(new java.awt.Color(255, 255, 255));
        jToolBarOpciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBarOpciones.setRollover(true);

        jButAgregar.setText("Agregar");
        jButAgregar.setFocusable(false);
        jButAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAgregarActionPerformed(evt);
            }
        });
        jToolBarOpciones.add(jButAgregar);

        jButModificar.setText("Modificar");
        jButModificar.setFocusable(false);
        jButModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButModificarActionPerformed(evt);
            }
        });
        jToolBarOpciones.add(jButModificar);

        jButEliminar.setText("Eliminar");
        jButEliminar.setFocusable(false);
        jButEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEliminarActionPerformed(evt);
            }
        });
        jToolBarOpciones.add(jButEliminar);

        jTableListaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.Control", "Nombre", "Promedio", "Semestre", "Activo", "Sexo"
            }
        ));
        jTableListaAlumnos.setToolTipText("");
        jTableListaAlumnos.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTableListaAlumnos);
        if (jTableListaAlumnos.getColumnModel().getColumnCount() > 0) {
            jTableListaAlumnos.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTableListaAlumnos.getColumnModel().getColumn(1).setPreferredWidth(350);
        }

        jLabNumAlumnos.setBackground(new java.awt.Color(255, 255, 0));
        jLabNumAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabNumAlumnos.setOpaque(true);

        jButCerrar.setText("Cerrar");
        jButCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCerrarActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenuArchivo.setText("Archivo");

        jMenuConsultar.setText("Consultar");
        jMenuConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultarActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuConsultar);

        jMenuSalir.setText("Salir");
        jMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuSalir);

        jMenuBar1.add(jMenuArchivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBarOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabNumAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButCerrar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBarOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabNumAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButCerrar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------------
    
    private void jMenuConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultarActionPerformed

        AlumnosJpaController alumnoSql = new AlumnosJpaController();
        List<Alumnos> alumno =  alumnoSql.findAlumnosEntities();
        Iterator<Alumnos> lista = alumno.iterator();
        
        int fila = modelo.getRowCount();
        for(int i = (fila-1); i >= 0 ; i--)
            modelo.removeRow(i);
        numAlumnos = 0;
        
        Alumnos[] datos = new Alumnos[alumnoSql.getAlumnosCount()];
        for(int i = 0; i < datos.length ; i++)
            datos[i] = alumno.get(i);
        
        int c;
        while(lista.hasNext())
        {
            c = 0;
            modelo.addRow(new Object[numAlumnos]);
            modelo.setValueAt(datos[numAlumnos].getNumControl(), numAlumnos, c);
            modelo.setValueAt(datos[numAlumnos].getNombre()    , numAlumnos, (c+1));
            modelo.setValueAt(datos[numAlumnos].getPromedio()  , numAlumnos, (c+2));
            modelo.setValueAt(datos[numAlumnos].getSemestre()  , numAlumnos, (c+3));
            modelo.setValueAt(datos[numAlumnos].isActivo()     , numAlumnos, (c+4));
            modelo.setValueAt(datos[numAlumnos].getSexo()      , numAlumnos, (c+5));
            numAlumnos++;
        }
        jLabNumAlumnos.setText("Total de Alumnos: "+numAlumnos);
        jTableListaAlumnos.setModel(modelo);
        
    }//GEN-LAST:event_jMenuConsultarActionPerformed

    //--------------------------------------------------------------------------
    
    private void jMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSalirActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_jMenuSalirActionPerformed

    //--------------------------------------------------------------------------
    
    private void jButCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCerrarActionPerformed
        
        jMenuSalirActionPerformed(evt);
        
    }//GEN-LAST:event_jButCerrarActionPerformed

    private void jButAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAgregarActionPerformed
        
        AlumnoGuardarFrame guardar = new  AlumnoGuardarFrame();
        guardar.setVisible(true);
        
    }//GEN-LAST:event_jButAgregarActionPerformed

    private void jButModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButModificarActionPerformed
        
        AlumnoModificarFrame modificar = new AlumnoModificarFrame();
        modificar.setVisible(true);
        
    }//GEN-LAST:event_jButModificarActionPerformed

    private void jButEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEliminarActionPerformed
        
        AlumnoEliminarFrame eliminar = new AlumnoEliminarFrame();
        eliminar.setVisible(true);
        
    }//GEN-LAST:event_jButEliminarActionPerformed

    //--------------------------------------------------------------------------
    
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
            java.util.logging.Logger.getLogger(AlumnosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlumnosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlumnosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlumnosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAgregar;
    private javax.swing.JButton jButCerrar;
    private javax.swing.JButton jButEliminar;
    private javax.swing.JButton jButModificar;
    private javax.swing.JLabel jLabNumAlumnos;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuConsultar;
    private javax.swing.JMenuItem jMenuSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaAlumnos;
    private javax.swing.JToolBar jToolBarOpciones;
    // End of variables declaration//GEN-END:variables
}
