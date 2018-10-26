
package Clinica;

public class SolicitudEm {
    private Afiliado paciente;
    private Cuadrilla grupo;
    private String tipo;
    
    
    public SolicitudEm(){

}

public SolicitudEm(Afiliado paciente, Cuadrilla grupo, String tipo){
    this.paciente=paciente;
    this.grupo=grupo;
    this.tipo=tipo;
}
    
}


