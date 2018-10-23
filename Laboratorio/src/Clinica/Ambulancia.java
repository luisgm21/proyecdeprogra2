
package Clinica;


public class Ambulancia extends Movil{
    private String marca;
    private String modelo;
    private String patente;

    public Ambulancia() {
    }

    
    public Ambulancia(String marca, String modelo, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatente() {
        return patente;
    }
  
    
}
