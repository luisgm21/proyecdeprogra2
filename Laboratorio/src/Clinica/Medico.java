
package Clinica;


public class Medico extends Empleado{
    public Medico(){
        
    }

    public Medico(Integer idempleado, float sueldo, String cuadrilla, String nombre, String dni, String telefono, String direccion, Integer edad) {
        super(idempleado, sueldo, cuadrilla, nombre, dni, telefono, direccion, edad);
    }
    

    public Medico(String nombre) {
        super(nombre);
    }
    
    
    
}
