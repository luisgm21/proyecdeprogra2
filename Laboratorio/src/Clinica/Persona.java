
package Clinica;


public class Persona{
   String nombre;
   String dni;
   String telefono;
   String direccion;
   Integer edad;
   
   public Persona(){
       
   }
   public Persona(String nombre, String dni, String telefono, String direccion, Integer edad){
       this.nombre=nombre;
       this.dni=dni;
       this.telefono=telefono;
       this.direccion=direccion;
       this.edad=edad;
   }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
     public String toString(){
        return this.getNombre()+" "+this.getDni();
    }
}
