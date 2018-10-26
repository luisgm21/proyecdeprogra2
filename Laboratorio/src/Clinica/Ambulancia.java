
package Clinica;



public class Ambulancia extends Movil {
    private String cuadrilla;
    
    public Ambulancia(){
        
    }

    public Ambulancia(String cuadrilla, String marca, String modelo, String año, String patente) {
        super(marca, modelo, año, patente);
        this.cuadrilla = cuadrilla;
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
    
}
