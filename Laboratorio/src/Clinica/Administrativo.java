
package Clinica;


public class Administrativo extends Empleado{
    
    public Administrativo(){
        
    }
    public Administrativo(String nombre, String dni, String telefono, String direccion, String edad,Integer idempleado,float sueldo){
        super(nombre,dni,telefono,direccion,edad,idempleado,sueldo);
    }

    public Administrativo(String nombre) {
        super(nombre);
    }    
}
