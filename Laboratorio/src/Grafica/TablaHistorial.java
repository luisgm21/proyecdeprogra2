
package Grafica;

import Clinica.GestorSolicitud;
import Clinica.SolicitudTerminada;
import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultListModel;


public class TablaHistorial extends javax.swing.JDialog {

    private GestorSolicitud soli;
    private DefaultListModel listModel = new DefaultListModel();
    private ArrayList listaauxiliar=new ArrayList();
    private JDateChooser jDateChooser1;
    private JDateChooser tiempo;
    public TablaHistorial(java.awt.Frame parent, boolean modal,GestorSolicitud soli,JDateChooser jDateChooser1) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.soli=soli;
        this.jDateChooser1=jDateChooser1;
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
        String [][] matris= new String[listaauxiliar.size()][5];
        for(Object object:listaauxiliar){               
                SolicitudTerminada solicitud = new SolicitudTerminada();
                solicitud=(SolicitudTerminada)object; 
                int aux=jDateChooser1.getCalendar().compareTo(solicitud.getFecha());
                if(aux==1){
                    matris[i][0]=solicitud.getPaciente().getNombre();
                    matris[i][1]=solicitud.getDomicilio();
                    matris[i][2]=solicitud.getGrupo().getIdcuadrilla();
                    matris[i][3]=solicitud.getReceptor().getNombre();
                    Calendar ca = solicitud.getFecha();
                    DateFormat formato1 = new SimpleDateFormat("dd/MM/yy");

                    String fecha = formato1.format(ca.getTime());
                    matris[i][4]=fecha;
                    
                }
            
                i++;
              
        }   
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
           matris,
            new String [] {
                "Paciente", "Domicilio", "Cuadrilla","Receptor","Fecha"
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABLA SOLICITUD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

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
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
