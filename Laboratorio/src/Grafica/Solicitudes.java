
package Grafica;

import Clinica.GestorSolicitud;
import Clinica.SolicitudTerminada;
import java.util.ArrayList;
import javax.swing.DefaultListModel;


public class Solicitudes extends javax.swing.JDialog {
    
    private GestorSolicitud soli;
    private DefaultListModel listModel = new DefaultListModel();
    private ArrayList listaauxiliar=new ArrayList();
    
    public Solicitudes(java.awt.Frame parent, boolean modal, GestorSolicitud soli) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.soli=soli;
        iniciar();
        Solicitudes();
        
    }
    
    public void iniciar(){
        for (int i = 0; i < soli.getCuentas().size(); i++) {
            Object auxiliar=soli.getCuentas().get(i);
            
            if(auxiliar.getClass()==SolicitudTerminada.class){
                
                listaauxiliar.add(auxiliar);
                listaauxiliar.size();
            }      
        }
    }
    
    public void Solicitudes(){
        int i=0;
        String [][] matris= new String[listaauxiliar.size()][4];
        for(Object object:listaauxiliar){               
                SolicitudTerminada solicitud = new SolicitudTerminada();
                solicitud=(SolicitudTerminada)object;              
                matris[i][0]=solicitud.getPaciente().getNombre();
                matris[i][1]=solicitud.getDomicilio();
                matris[i][2]=solicitud.getGrupo().getIdcuadrilla();
                matris[i][3]=solicitud.getReceptor().getNombre();
               
            
                i++;
              
        }   
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
           matris,
            new String [] {
                "Paciente", "Domicilio", "Cuadrilla","Receptor"
            }
        ));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solicitudes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
