
package Clinica;

import javax.swing.JOptionPane;

public class SolicitudEm {
    private Afiliado paciente;
    private Cuadrilla grupo;
    private String tipo;
    private String domicilio;
    
    private Administrativo receptor;
    //id,nombre,domicilio,tipoemergencia));
    
    public SolicitudEm(){

    }

    public SolicitudEm(Afiliado paciente, Cuadrilla grupo, String direccion, String tipo, Administrativo receptor){
        this.paciente=paciente;
        this.grupo=grupo;
        this.tipo=tipo;
    }
    
    
    
    

   
    public void solicitudEm(){        
        JOptionPane.showMessageDialog(null, "MORELI GATO");
        
        JOptionPane.showMessageDialog(null, this.getDomicilio());
        JOptionPane.showMessageDialog(null, this.getTipo());
               
        
    }
    
    
    /*public void solicitudEm(SolicitudEm solicitud){
        
        JOptionPane.showMessageDialog(null, "MORELI GATO");
        JOptionPane.showMessageDialog(null,id);
        JOptionPane.showMessageDialog(null,domicilio);
        JOptionPane.showMessageDialog(null,tipoemergencia);
        JOptionPane.showMessageDialog(null,nombre);        
        System.out.println(domicilio);
    }*/

    
    public Afiliado getPaciente() {
        return paciente;
    }

   
    public void setPaciente(Afiliado paciente) {
        this.paciente = paciente;
    }

    
    public Cuadrilla getGrupo() {
        return grupo;
    }

    
    public void setGrupo(Cuadrilla grupo) {
        this.grupo = grupo;
    }

   
    public String getTipo() {
        return tipo;
    }

   
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public String getDomicilio() {
        return domicilio;
    }

    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    
    

   
    public Administrativo getReceptor() {
        return receptor;
    }

   
    public void setReceptor(Administrativo receptor) {
        this.receptor = receptor;
    }

    

   
}


