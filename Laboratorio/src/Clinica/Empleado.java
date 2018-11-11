
package Clinica;

public class Empleado extends Persona{
    
    private Integer idempleado;
    private float sueldo;
    private String cuadrilla;
    public Empleado(){
        
    }

    public Empleado(Integer idempleado, float sueldo, String cuadrilla, String nombre, String dni, String telefono, String direccion, Integer edad) {
        super(nombre, dni, telefono, direccion, edad);
        this.idempleado = idempleado;
        this.sueldo = sueldo;
        this.cuadrilla = cuadrilla;
    }
    
    
    public Empleado(String nombre, String dni, String telefono, String direccion, Integer edad) {
        super(nombre, dni, telefono, direccion, edad);
    }
    

    public Empleado(String nombre) {
        super(nombre);
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

    public String getCuadrilla() {
        return cuadrilla;
    }
    
     
}

