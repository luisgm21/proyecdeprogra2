
package Grafica;

import Clinica.Afiliado;
import Clinica.Persona;


public class MostrarFamiliares extends javax.swing.JDialog {

    private Afiliado afiliado;
    public MostrarFamiliares(java.awt.Frame parent, boolean modal,Afiliado afiliado) {
        super(parent, modal);
        initComponents();
        this.afiliado=afiliado;
        mostrar();
    }
    
     public void mostrar(){
        String [][] matris= new String[afiliado.leerFamilia().size()][5];
        for (int i = 0; i < afiliado.leerFamilia().size(); i++) {
            Persona familiar= (Persona)afiliado.leerFamilia().get(i);
            matris[i][0]=familiar.getNombre();
            matris[i][1]=familiar.getDni();
            matris[i][2]=familiar.getTelefono();
            matris[i][3]=familiar.getDireccion();
            matris[i][4]=Integer.toString(familiar.getEdad());
        }
      jFamiliar.setModel(new javax.swing.table.DefaultTableModel(
           matris,
            new String [] {
                "Nombre ", "Dni", "Telefono", "Direccion", "Edad"
            }
        ));
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jFamiliar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jFamiliar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "DNI", "Telefono", "Direccion", "Edad"
            }
        ));
        jFamiliar.setRowHeight(30);
        jScrollPane1.setViewportView(jFamiliar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
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
    private javax.swing.JTable jFamiliar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
