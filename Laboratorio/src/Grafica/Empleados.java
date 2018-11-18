package Grafica;

import Clinica.Administrativo;
import Clinica.ArrayListPersona;
import Clinica.Chofer;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import Clinica.Empleado;
import Clinica.Enfermero;
import Clinica.GestorPersona;
import Clinica.Medico;
import java.awt.Frame;
import javax.swing.JOptionPane;


public class Empleados extends javax.swing.JDialog {
    private DefaultListModel listModel = new DefaultListModel();
    private Frame principal1;
   
    private GestorPersona persona;
    Empleados(java.awt.Frame parent, boolean modal, GestorPersona persona) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.persona=persona;
        empleados();
        
            
        
        
    }
    
    
    public void empleados(){
        int i=0;
        String [][] matris= new String[persona.getCuentas().size()][5];
        for(Object object:persona.getCuentas()){               
            if(object.getClass()==Medico.class){
                Medico medico=new Medico();
                medico=(Medico)object;
                JOptionPane.showMessageDialog(null, medico.getNombre()); 
                matris[i][0]=medico.getNombre();
                matris[i][1]=medico.getDni();
                matris[i][2]=medico.getTelefono();
                matris[i][3]=medico.getDireccion();
                matris[i][4]="Medico";
             //   matris[i][4]=medico.getEdad();
                i++;
            }    
            if(object.getClass()==Chofer.class){
                Chofer chofer=new Chofer();
                chofer=(Chofer)object;
                JOptionPane.showMessageDialog(null, chofer.getNombre());
                matris[i][0]=chofer.getNombre();
                matris[i][1]=chofer.getDni();
                matris[i][2]=chofer.getTelefono();
                matris[i][3]=chofer.getDireccion();
                matris[i][4]="Chofer";
                i++;
            }  
            if(object.getClass()==Enfermero.class){
                Enfermero enfermero=new Enfermero();
                enfermero=(Enfermero)object;
                JOptionPane.showMessageDialog(null, enfermero.getNombre()); 
                matris[i][0]=enfermero.getNombre();
                matris[i][1]=enfermero.getDni();
                matris[i][2]=enfermero.getTelefono();
                matris[i][3]=enfermero.getDireccion();
                matris[i][4]="Enfermero";
            }  
            if(object.getClass()==Administrativo.class){
                Administrativo administrativo=new Administrativo();
                administrativo=(Administrativo)object;
                JOptionPane.showMessageDialog(null, administrativo.getNombre());
                matris[i][0]=administrativo.getNombre();
                matris[i][1]=administrativo.getDni();
                matris[i][2]=administrativo.getTelefono();
                matris[i][3]=administrativo.getDireccion();
                matris[i][4]="Administrativo";
                i++;
            }              
        }   
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
           matris,
            new String [] {
                "Nombre ", "Dni", "Telefono","Direccion","Profesion"
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
        setTitle("Empleados");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTA DE EMPLEADOS"));
        jPanel1.setToolTipText("");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
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

    
        
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
