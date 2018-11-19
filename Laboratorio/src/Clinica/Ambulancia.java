
package Clinica;

import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Ambulancia extends Movil {
    private String cuadrilla;
    
    
    ArrayList lista =new ArrayList();
    
    public Ambulancia(){
        
    }

    public Ambulancia(String cuadrilla, String marca, String modelo, String año, String patente) {
        super(marca, modelo, año, patente);
        this.cuadrilla = cuadrilla;
    }
    
    public Ambulancia( String marca, String modelo, String año, String patente){
        super(marca, modelo, año, patente);
    }

    public Ambulancia(String patente) {
        super(patente);
    }
   
    public String ambulancia(){
        return super.getPatente();
    }

    public String getCuadrilla() {
        return cuadrilla;
    }
       
    public ArrayList agregarAmbulancia(){
        lista.add(super.getMarca());
        lista.add(super.getModelo());
        lista.add(super.getAño());
        lista.add(super.getPatente());
        return (lista);
    }   
    
    @Override
    public String toString(){
        return this.getMarca()+ " " +this.getModelo();
    }
}
