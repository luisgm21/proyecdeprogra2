
package Clinica;


public abstract class Movil {

    private String marca;
    private String modelo;
    private String año;
    private String patente;
    public Movil(){
        
    }
    public Movil(String marca,String modelo,String año,String patente){
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
        this.patente=patente;
    }

    public Movil(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAño() {
        return año;
    }

    public String getPatente() {
        return patente;
    }

    
}
