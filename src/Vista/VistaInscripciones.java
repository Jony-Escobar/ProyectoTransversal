package Vista;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaInscripciones extends javax.swing.JInternalFrame {

    Alumno alumno=new Alumno();
    AlumnoData aluData= new AlumnoData();
    Inscripcion inscripcion= new Inscripcion();
    InscripcionData insData= new InscripcionData();
    DefaultTableModel modelo;
    
        
    
    public VistaInscripciones() {
        initComponents();
        cargaAlumnos();
        //DefaultTableModel modelo = (DefaultTableModel) jtMaterias.getModel();
        //jtMaterias.setModel(modelo);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jrbInscriptas = new javax.swing.JRadioButton();
        jrbNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        btnInscribir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAnularInscripcion = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("-FORMULARIO DE INSCRIPCION-");

        jLabel2.setText("ALUMNO:");

        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setText("LISTADO DE MATERIAS");

        jrbInscriptas.setText("Inscriptas");
        jrbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInscriptasActionPerformed(evt);
            }
        });

        jrbNoInscriptas.setText("No Inscriptas");
        jrbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoInscriptasActionPerformed(evt);
            }
        });

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "ANIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtMaterias);

        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAnularInscripcion.setText("Anular Inscripcion");
        btnAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularInscripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(229, 229, 229))))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInscribir)
                                .addGap(26, 26, 26)
                                .addComponent(btnAnularInscripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbInscriptas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbNoInscriptas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbInscriptas)
                    .addComponent(jrbNoInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInscribir)
                    .addComponent(btnSalir)
                    .addComponent(btnAnularInscripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void borrarFilas(){
        modelo = (DefaultTableModel) jtMaterias.getModel();
          jtMaterias.setModel(modelo);
         System.out.println("Cantidad de filas: "+ modelo.getRowCount());
      if(modelo.getRowCount()>0){
       int filas= modelo.getRowCount()-1;
       for(int i= filas; i>=0;i--){
         modelo.removeRow(i);
      }
      }
     }
    
    private void jrbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInscriptasActionPerformed
      
      jrbInscriptas.setSelected(true);
      jrbNoInscriptas.setSelected(false);
      btnInscribir.setEnabled(false);
      btnAnularInscripcion.setEnabled(true);
      borrarFilas();
      llenarTabla();
        
    }//GEN-LAST:event_jrbInscriptasActionPerformed

    private void jrbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoInscriptasActionPerformed
        
        btnAnularInscripcion.setEnabled(false);
        btnInscribir.setEnabled(true);
        jrbNoInscriptas.setSelected(true);
        jrbInscriptas.setSelected(false);
        borrarFilas();
        llenarTabla();
    }//GEN-LAST:event_jrbNoInscriptasActionPerformed

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        borrarFilas();
        jrbInscriptas.setSelected(false);
        jrbNoInscriptas.setSelected(false);
    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        alumno= (Alumno) jcbAlumnos.getSelectedItem();
        int filaSelec= jtMaterias.getSelectedRow();
        if(filaSelec!=-1){
         int idM= (Integer)jtMaterias.getValueAt(filaSelec, 0);
         String nombre= (String)jtMaterias.getValueAt(filaSelec, 1);
         int anio= (Integer)jtMaterias.getValueAt(filaSelec, 2);
         inscripcion.setIdAlumno(alumno.getIdAlumno());
         inscripcion.setIdMateria(idM);
         insData.guardarInscripcion(inscripcion);
        }
        else{
         JOptionPane.showMessageDialog(this, "Debe seleccionar una materia");
        }
        
    }//GEN-LAST:event_btnInscribirActionPerformed

    private void btnAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularInscripcionActionPerformed
        alumno= (Alumno) jcbAlumnos.getSelectedItem();
        int filaSelec= jtMaterias.getSelectedRow();
        if(filaSelec!=-1){
         int idM= (Integer)jtMaterias.getValueAt(filaSelec, 0);
         String nombre= (String)jtMaterias.getValueAt(filaSelec, 1);
         int anio= (Integer)jtMaterias.getValueAt(filaSelec, 2);
         inscripcion.setIdAlumno(alumno.getIdAlumno());
         inscripcion.setIdMateria(idM);
         insData.borrarInscripcionMateriaAlumno(alumno.getIdAlumno(), idM);
         borrarFilas();
         llenarTabla();
        }
        else{
         JOptionPane.showMessageDialog(this, "Debe seleccionar una materia");
        }
    }//GEN-LAST:event_btnAnularInscripcionActionPerformed

     
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnularInscripcion;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JRadioButton jrbInscriptas;
    private javax.swing.JRadioButton jrbNoInscriptas;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables

    private void cargaAlumnos() {
        List<Alumno> allAlumnos= aluData.listarAlumnos();
        for(Alumno alu: allAlumnos){
         jcbAlumnos.addItem(alu);
        }
    }
    
    private void llenarTabla(){
     Alumno alu= (Alumno)jcbAlumnos.getSelectedItem();
     
//        DefaultTableModel modelo = (DefaultTableModel) jtMaterias.getModel();
          modelo = (DefaultTableModel) jtMaterias.getModel();
          jtMaterias.setModel(modelo);
//        Object[] fila= new Object[4];
//        fila[0]= jtfNombre.getText();
//        fila[1]= jtfApellido.getText();
//        fila[2]= jtfDni.getText();
//        fila[3]= jcbSexo.getSelectedItem();
//        modelo.addRow(fila); 
        
//      
        if(jrbInscriptas.isSelected()){
         List<Materia> materias= insData.obtenerMateriasCursadas(alu.getIdAlumno());
         for(Materia mat: materias){
          modelo.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), mat.getAnio()});
         }
        }
        else{
          List<Materia> materias= insData.obtenerMateriasNoCursadas(alu.getIdAlumno()); //  .obtenerMateriasNoCursadas(alu.getIdAlumno());
         for(Materia mat: materias){
          modelo.addRow(new Object[]{mat.getIdMateria(), mat.getNombre(), mat.getAnio()});
         }
        }
    }
}
