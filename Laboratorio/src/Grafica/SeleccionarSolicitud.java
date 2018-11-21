
package Grafica;

import Clinica.GestorSolicitud;
import Clinica.SolicitudEm;
import Clinica.SolicitudTerminada;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;


public class SeleccionarSolicitud extends javax.swing.JDialog {
    
    private JTextField jTextField1;
    private JTextField jTextField2;
    private GestorSolicitud soli;
    private SolicitudTerminada solicitud;
    private DefaultListModel lista = new DefaultListModel();

   
    public SeleccionarSolicitud(java.awt.Frame parent, boolean modal,JTextField jTextField1,JTextField jTextField2,GestorSolicitud soli,SolicitudTerminada solicitud) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.jTextField1=jTextField1;
        this.jTextField2=jTextField2;
        this.soli=soli;
        this.solicitud=solicitud;
        for (int i = 0; i < soli.getCuentas().size(); i++) {
        if(soli.getCuentas().get(i).getClass()==SolicitudEm.class){
            lista.addElement(soli.getCuentas().get(i));
        }
            
        }
        jList1.setModel(lista);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SOLICITUDES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SolicitudEm s = jList1.getSelectedValue();
        if (s!=null){
        jTextField1.setText(s.getGrupo().getMedico().getNombre());
        jTextField2.setText(s.getGrupo().getIdcuadrilla());
        solicitud.setDomicilio(s.getDomicilio());
        solicitud.setFecha(s.getFecha());
        solicitud.setGrupo(s.getGrupo());
        solicitud.setPaciente(s.getPaciente());
        solicitud.setReceptor(s.getReceptor());
        solicitud.setTipo(s.getTipo());
        }
        
        
        
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JList<SolicitudEm> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
