
package Grafica;

import Clinica.Afiliado;
import Clinica.GestorPersona;
import java.util.ArrayList;


public class MostrarAfililiado extends javax.swing.JDialog {

    private GestorPersona persona;
    private ArrayList<Afiliado>listaauxiliar=new ArrayList();
    public MostrarAfililiado(java.awt.Frame parent, boolean modal,GestorPersona gestor) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.persona=gestor;
        iniciar();
        mostrar();
    }
    public void iniciar(){
        for (int i = 0; i < persona.getCuentas().size(); i++) {
            Object auxiliar=persona.getCuentas().get(i);
            
            if(auxiliar.getClass()==Afiliado.class){
                Afiliado auxiliar2=(Afiliado)auxiliar;
                listaauxiliar.add(auxiliar2);
            }
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAfiliado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MOSTRAR AFILIADOS");

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("AFILIADOS CARGADOS"));

        jTableAfiliado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre ", "Dni", "Telefono", "Direccion", "Edad"
            }
        ));
        jTableAfiliado.setRowHeight(30);
        jScrollPane1.setViewportView(jTableAfiliado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   public void mostrar(){
        String [][] matris= new String[listaauxiliar.size()][5];
        for (int i = 0; i < listaauxiliar.size(); i++) {
                Afiliado afiliado= listaauxiliar.get(i);
                matris[i][0]=afiliado.getNombre();
                matris[i][1]=afiliado.getDni();
                matris[i][2]=afiliado.getTelefono();
                matris[i][3]=afiliado.getDireccion();
                matris[i][4]=Integer.toString(afiliado.getEdad()); 
        }
      jTableAfiliado.setModel(new javax.swing.table.DefaultTableModel(
           matris,
            new String [] {
                "Nombre ", "Dni", "Telefono", "Direccion", "Edad"
            }
        ));
   }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAfiliado;
    // End of variables declaration//GEN-END:variables
}
