
package Clinica;


public class Chofer extends Empleado{
    
    public Chofer(){
        
    }
    public Chofer(String nombre, String dni, String telefono, String direccion, String edad,Integer idempleado,float sueldo){
        super(nombre,dni,telefono,direccion,edad,idempleado,sueldo);
    }         

    public Chofer(String nombre) {
        super(nombre);
    }
    
}   
