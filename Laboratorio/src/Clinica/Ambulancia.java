
package Clinica;



public class Ambulancia extends Movil {

    public Ambulancia(){
        
    }
    public Ambulancia(String marca,String modelo,String año,String patente){
        super(marca,modelo,año,patente);
    }

    public Ambulancia(String patente) {
        super(patente);
    }
    
    public String ambulancia(){
        return super.getPatente();
    }
}
