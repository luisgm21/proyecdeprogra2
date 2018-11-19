
package Grafica;

import Clinica.Ambulancia;
import Clinica.Chofer;
import Clinica.Cuadrilla;
import Clinica.Enfermero;
import Clinica.GestorCuadrilla;
import Clinica.GestorPersona;
import Clinica.Medico;
import Clinica.Persona;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class CuadrillaGra extends javax.swing.JDialog {

    private DefaultListModel listModel = new DefaultListModel();
    
    private GestorCuadrilla persona;
    CuadrillaGra(java.awt.Frame parent, boolean modal, GestorCuadrilla persona) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        //mostrar();
        this.persona=persona;
        construccionCuadrilla();
    }
    
    public void construccionCuadrilla(){
        Cuadrilla cua= new Cuadrilla();
        int i=0;
        String [][] matris= new String[persona.getCuentas().size()][6];
        for(Object object:persona.getCuentas()){               
            if(object.getClass()==Medico.class){
                Medico medico=new Medico();
                medico=(Medico)object;
                JOptionPane.showMessageDialog(null, medico.getNombre()); 
                matris[i][0]=""+i;
                matris[i][1]=medico.getNombre();
                matris[i][5]=cua.getEstado();
                cua.setCuadrilla(""+i);
                if(matris[i][1]!=null && matris[i][2]!=null && matris[i][3]!=null){
                    cua.setCuadrilla(""+i);
                    
                    i++;
                    
                }               
            }    
            if(object.getClass()==Chofer.class){
                Chofer chofer=new Chofer();
                chofer=(Chofer)object;
                JOptionPane.showMessageDialog(null, chofer.getNombre());                 
                matris[i][3]=chofer.getNombre(); 
                if(matris[i][1]!=null && matris[i][2]!=null && matris[i][3]!=null){
                    i++;
                }
            }  
            if(object.getClass()==Enfermero.class){
                Enfermero enfermero=new Enfermero();
                enfermero=(Enfermero)object;
                JOptionPane.showMessageDialog(null, enfermero.getNombre());               
                matris[i][2]=enfermero.getNombre(); 
                if(matris[i][1]!=null && matris[i][2]!=null && matris[i][3]!=null){
                    i++;
                }
            }  
        }  
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
           matris,
            new String [] {
                "Cuadrilla", "Medico ", "Enfermero", "Chofer","Ambulancia","Estado de Cuadrilla"               
            }
        ));
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cuadrillas");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cuadrillas disponibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Cuadrilla 1:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(303, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
