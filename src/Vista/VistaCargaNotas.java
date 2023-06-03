package Vista;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Modelo.Alumno;
import Modelo.Inscripcion;
import Modelo.Materia;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaCargaNotas extends javax.swing.JInternalFrame {

    Alumno alumno=new Alumno();
    AlumnoData aluData= new AlumnoData();
    Inscripcion inscripcion= new Inscripcion();
    InscripcionData insData= new InscripcionData();
    DefaultTableModel modelo;
    Materia materia= new Materia();
    
    public VistaCargaNotas() {
        initComponents();
        cargaAlumnos();
        //btnModificar.setEnabled(false);
        btnGuardar.setEnabled(false);
        jtfNota.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMateria = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jtfNota = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(900, 900));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("-CARGA DE NOTAS-");

        jLabel2.setText("ALUMNO:");

        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        jtMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Materia", "Nota"
            }
        ));
        jScrollPane1.setViewportView(jtMateria);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnModificar.setText("Actualizar Nota:");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1122, 1122, 1122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfNota, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(101, 101, 101)))
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
      borrarFilas();  
      llenarTabla();
    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(jcbAlumnos.getSelectedIndex()!=-1 && jtMateria.getSelectedRow()!=-1){
        jtfNota.setEnabled(true);
        btnGuardar.setEnabled(true);
        }
        else{
         JOptionPane.showMessageDialog(this, "Seleccione un alumno y una materia");
        }
    
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        modificarNota();
        borrarFilas();
        llenarTabla();
        jtfNota.setText("");
        jtfNota.setEnabled(false);
        btnGuardar.setEnabled(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cargaAlumnos(){
        List<Alumno> alumnos= aluData.listarAlumnos();
        for(Alumno alu: alumnos){
         jcbAlumnos.addItem(alu);
        
       }
    }
    
//    private float recuperarNota(int idAlumno, int idMateria){
//     List<Inscripcion> ins= insData.obtenerInscripcionesPorAlumno(idAlumno);
//     Materia aux= new Materia();
//     int i=0;
//     float nota = 0;
//     boolean flag= false;
//     while (!flag && i<ins.size()){
//      if(ins.get(i).getIdAlumno()== idAlumno && ins.get(i).getIdMateria()== idMateria){
//         nota= ins.get(i).getNota();
//          flag= true;
//      }
//     }
//     return nota;
//    }   
    
    
    private void modificarNota(){
     if(jtMateria.getSelectedRow()!=-1){
       //btnGuardar.setEnabled(true);
       //jtfNota.setEnabled(true);
       int filaSelec= jtMateria.getSelectedRow();
      int idM= (Integer)jtMateria.getValueAt(filaSelec, 0);
      Alumno alu= (Alumno) jcbAlumnos.getSelectedItem();
      if(jtfNota.getText()!=""){
       float nota= Float.parseFloat(jtfNota.getText());
       insData.actualizarNota(alu.getIdAlumno(),idM, nota);
       
      }
     }
    }
    
    private void llenarTabla(){
        alumno= (Alumno) jcbAlumnos.getSelectedItem();
        modelo = (DefaultTableModel) jtMateria.getModel();
        jtMateria.setModel(modelo);
        MateriaData matData= new MateriaData();
        //Materia materia= new Materia();
        
        //List<Materia> materia= insData.obtenerMateriasCursadas(alumno.getIdAlumno()); //Lista de materias cursadas por el alumno
        List<Inscripcion> inscripto= insData.obtenerInscripcionesPorAlumno(alumno.getIdAlumno()); //Inscripciones del alumno
        for(Inscripcion ins: inscripto){
//            float f= recuperarNota(alumno.getIdAlumno(), mat.getIdMateria());
           materia= matData.buscarMateria(ins.getIdMateria());
           modelo.addRow(new Object[]{ins.getIdMateria(), materia.getNombre() ,ins.getNota()});
        }
    }
    
    private void borrarFilas(){
      modelo = (DefaultTableModel) jtMateria.getModel();
      jtMateria.setModel(modelo);
      if(modelo.getRowCount()>0){
       int filas= modelo.getRowCount()-1;
       for(int i= filas; i>=0;i--){
         modelo.removeRow(i);
      }
      }}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JTable jtMateria;
    private javax.swing.JTextField jtfNota;
    // End of variables declaration//GEN-END:variables
}