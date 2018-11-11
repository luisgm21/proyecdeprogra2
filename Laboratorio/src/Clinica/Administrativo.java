
package Clinica;


public class Administrativo extends Empleado{
    
    public Administrativo(){
        
    }

    public Administrativo(Integer idempleado, float sueldo, String cuadrilla, String nombre, String dni, String telefono, String direccion, Integer edad) {
        super(idempleado, sueldo, cuadrilla, nombre, dni, telefono, direccion, edad);
    }
    
    

    public Administrativo(String nombre) {
        super(nombre);
    }    
}
