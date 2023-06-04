package Vista;

import AccesoADatos.MateriaData;
import Modelo.Materia;
import javax.swing.JOptionPane;

public class VistaMaterias extends javax.swing.JInternalFrame {

    MateriaData md = new MateriaData();
    int control=0;
    
    public VistaMaterias() {
        initComponents();
        
        //desactivo los txt
        txtAnio.setEnabled(false);
        txtId.setEnabled(false);
        txtNombre.setEnabled(false);
        jrbEstado.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnGuardar.setEnabled(false);
        jrbModificar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btModificador = new javax.swing.ButtonGroup();
        lbId = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jrbNueva = new javax.swing.JRadioButton();
        jrbModificar = new javax.swing.JRadioButton();
        lbAnio = new javax.swing.JLabel();
        txtAnio = new javax.swing.JTextField();
        lbEstado = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jrbEstado = new javax.swing.JRadioButton();
        jrbBuscar = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lbId.setText("ID:");

        lbNombre.setText("NOMBRE:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("-MATERIAS-");

        btModificador.add(jrbNueva);
        jrbNueva.setText("Nueva");
        jrbNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNuevaActionPerformed(evt);
            }
        });

        btModificador.add(jrbModificar);
        jrbModificar.setText("Modificar");
        jrbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbModificarActionPerformed(evt);
            }
        });

        lbAnio.setText("AÑO:");

        lbEstado.setText("ESTADO");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btModificador.add(jrbBuscar);
        jrbBuscar.setText("Buscar");
        jrbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(18, 18, 18)
                .addComponent(btnBorrar)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(jrbNueva)
                            .addGap(67, 67, 67)
                            .addComponent(jrbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbBuscar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbId)
                                .addComponent(lbNombre)
                                .addComponent(lbAnio)
                                .addComponent(lbEstado))
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(btnBuscar))
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jrbEstado)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbNueva)
                    .addComponent(jrbModificar)
                    .addComponent(jrbBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbId)
                            .addComponent(btnBuscar))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNombre)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAnio)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalir)
                    .addComponent(btnBorrar))
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        lbAnio.setEnabled(true);
        txtAnio.setEnabled(true);
        lbEstado.setEnabled(true);
        jrbEstado.setEnabled(true);
        
        if(!txtId.getText().equals("")){
            try {
                Materia m = md.buscarMateria(Integer.parseInt(txtId.getText()));
                txtId.setText(m.getIdMateria() + "");
                txtNombre.setText(m.getNombre());
                txtAnio.setText(m.getAnio() + "");
                if(m.isEstado() == 1){
                    jrbEstado.setSelected(true);
                }else{
                    jrbEstado.setSelected(false);
                }
                btnBorrar.setEnabled(true);
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor ingresado no valido. Por favor, ingrese un id valido.");
                txtId.setText("");
                txtId.requestFocus();
                lbAnio.setEnabled(false);
                txtAnio.setEnabled(false);
                lbEstado.setEnabled(false);
                jrbEstado.setEnabled(false);
            }
            
            
        }else if(!txtNombre.getText().equals("")){
            
             Materia m = md.buscarMateria(txtNombre.getText()); 
            txtId.setText(m.getIdMateria() + "");
            txtNombre.setText(m.getNombre());
            txtAnio.setText(m.getAnio() + "");
            if(m.isEstado() == 1){
                jrbEstado.setSelected(true);
            }else{
                jrbEstado.setSelected(false);
            }
            btnBorrar.setEnabled(true);
        }
        
        if(jrbBuscar.isSelected() && jrbModificar.isEnabled()==false){
          control++;
          jrbModificar.setEnabled(true);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jrbNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNuevaActionPerformed
        lbId.setEnabled(false);
        txtId.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnBuscar.setEnabled(false);
        lbNombre.setEnabled(true);
        txtNombre.setEnabled(true);
        lbAnio.setEnabled(true);
        txtAnio.setEnabled(true);
        lbEstado.setEnabled(true);
        jrbEstado.setEnabled(true);
        btnGuardar.setEnabled(true);
        
    }//GEN-LAST:event_jrbNuevaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jrbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbModificarActionPerformed
        btnBuscar.setEnabled(false);
        btnBorrar.setEnabled(false);
        lbId.setEnabled(true);
        txtId.setEnabled(false);
        lbNombre.setEnabled(true);
        txtNombre.setEnabled(true);
        lbAnio.setEnabled(true);
        txtAnio.setEnabled(true);
        lbEstado.setEnabled(true);
        jrbEstado.setEnabled(true);
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_jrbModificarActionPerformed

    private void jrbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbBuscarActionPerformed
        lbAnio.setEnabled(false);
        txtAnio.setEnabled(false);
        lbEstado.setEnabled(false);
        jrbEstado.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnBuscar.setEnabled(true);
        lbId.setEnabled(true);
        txtId.setEnabled(true);
        lbNombre.setEnabled(true);
        txtNombre.setEnabled(true);
    }//GEN-LAST:event_jrbBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtId.setText("");
        txtNombre.setText("");
        txtAnio.setText("");
        jrbEstado.setSelected(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
               
        if(jrbNueva.isSelected() && !txtNombre.equals("")){
            try {
                Materia m = new Materia();
                m.setNombre(txtNombre.getText());
                m.setAnio(Integer.parseInt(txtAnio.getText()));
                if(jrbEstado.isSelected()){
                    m.setEstado(1);
                }else{
                    m.setEstado(0);
                }                 
                md.guardarMateria(m);
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Año ingresado no valido, por favor ingrese un valor numerico valido.");
                txtAnio.requestFocus();
                txtAnio.setText("");
            }
        }else if(jrbModificar.isSelected()){
            try {
                Materia m = new Materia();
                m.setIdMateria(Integer.parseInt(txtId.getText()));
                m.setNombre(txtNombre.getText());
                m.setAnio(Integer.parseInt(txtAnio.getText()));
                if(jrbEstado.isSelected()){
                    m.setEstado(1);
                }else{
                    m.setEstado(0);
                }  
                md.modificarMateria(m);
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Valor ingresado no valido. Por favor, revise los campos Id y Año.");
                txtId.requestFocus();
            }
            
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        md.eliminarMateria(Integer.parseInt(txtId.getText()));
        btnLimpiarActionPerformed(evt);
        jrbBuscarActionPerformed(evt);
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btModificador;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton jrbBuscar;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JRadioButton jrbModificar;
    private javax.swing.JRadioButton jrbNueva;
    private javax.swing.JLabel lbAnio;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
