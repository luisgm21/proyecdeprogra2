
package Clinica;


public class Enfermero extends Empleado{
    public Enfermero(){
        
    }

    public Enfermero(Integer idempleado, float sueldo, String cuadrilla, String nombre, String dni, String telefono, String direccion, Integer edad) {
        super(idempleado, sueldo, cuadrilla, nombre, dni, telefono, direccion, edad);
    }
    

    public Enfermero(String nombre) {
        super(nombre);
    }
    
    public Enfermero(String nombre, String dni, String telefono, String direccion, Integer edad) {
        super(nombre, dni, telefono, direccion, edad);
    }
    
    
}
