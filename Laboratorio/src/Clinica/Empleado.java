
package Clinica;

public class Empleado extends Persona{
    
    private Integer idempleado;
    private float sueldo;
    
    
    public Empleado(String nombre, String dni, String telefono, String direccion, String edad, Integer idempleado, float sueldo){
        super(nombre, dni, telefono, direccion, edad);
        this.idempleado=idempleado;
        this.sueldo=sueldo;
        
    }

    
    public Integer getIdempleado() {
        return idempleado;
    }

   
    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
     
}

