
package Clinica;

import javax.swing.JOptionPane;

public class SolicitudEm {
    private Afiliado paciente;
    private Cuadrilla grupo;
    private String tipo;
    private Integer id;
    private String domicilio;
    private String tipoemergencia;
    private String nombre;
    //id,nombre,domicilio,tipoemergencia));
    
    public SolicitudEm(){

    }

    public SolicitudEm(Afiliado paciente, Cuadrilla grupo, String tipo){
        this.paciente=paciente;
        this.grupo=grupo;
        this.tipo=tipo;
    }
    
    
    
    public SolicitudEm(Integer id,String nombre,String domicilio,String tipoemergencia){
        this.domicilio=domicilio;
        this.id=id;
        this.tipoemergencia=tipoemergencia;
        this.nombre=nombre;        
    }

   
    public void solicitudEm(){        
        JOptionPane.showMessageDialog(null, "MORELI GATO");
        JOptionPane.showMessageDialog(null,this.id);
        JOptionPane.showMessageDialog(null,this.domicilio);
        JOptionPane.showMessageDialog(null,this.tipoemergencia);
        JOptionPane.showMessageDialog(null,this.nombre);        
        
    }
    
    
    /*public void solicitudEm(SolicitudEm solicitud){
        
        JOptionPane.showMessageDialog(null, "MORELI GATO");
        JOptionPane.showMessageDialog(null,id);
        JOptionPane.showMessageDialog(null,domicilio);
        JOptionPane.showMessageDialog(null,tipoemergencia);
        JOptionPane.showMessageDialog(null,nombre);        
        System.out.println(domicilio);
    }*/

   
}


