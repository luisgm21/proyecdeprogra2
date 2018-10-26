
package Clinica;


public class Medico extends Empleado{
    public Medico(){
        
    }
    public Medico(String nombre, String dni, String telefono, String direccion, String edad,Integer idempleado,float sueldo){
        super(nombre,dni,telefono,direccion,edad,idempleado,sueldo);
    }

    public Medico(String nombre) {
        super(nombre);
    }
    
}
