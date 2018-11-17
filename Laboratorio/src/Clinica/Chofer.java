
package Clinica;


public class Chofer extends Empleado{
    
    public Chofer(){
        
    }

    public Chofer(Integer idempleado, float sueldo, String cuadrilla, String nombre, String dni, String telefono, String direccion, Integer edad) {
        super(idempleado, sueldo, cuadrilla, nombre, dni, telefono, direccion, edad);
    }
          

    public Chofer(String nombre) {
        super(nombre);
    }
    
    public Chofer(String nombre, String dni, String telefono, String direccion, Integer edad) {
        super(nombre, dni, telefono, direccion, edad);
    }
    
    
    
}   
