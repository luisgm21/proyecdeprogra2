
package Clinica;


public abstract class Movil {
    private String marca;
    private String modelo;
    private String año;
    private String patente;
    public Movil(String marca,String modelo,String año,String patente){
        this.marca=marca;
        this.modelo=modelo;
        this.año=año;
        this.patente=patente;
    }
}
