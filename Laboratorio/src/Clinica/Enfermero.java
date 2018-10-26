
package Clinica;


public class Enfermero extends Empleado{
    public Enfermero(){
        
    }
    public Enfermero(String nombre, String dni, String telefono, String direccion, String edad,Integer idempleado,float sueldo){
        super(nombre,dni,telefono,direccion,edad,idempleado,sueldo);
    }

    public Enfermero(String nombre) {
        super(nombre);
    }
    
}
