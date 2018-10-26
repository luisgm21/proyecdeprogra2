
package Clinica;


public class PagoAfiliado {
    private float coutabase=300;
    private float coutapfam=50;
    private float coutafin;
    
    public float calculoPago(int tipoafiliado){
        if(tipoafiliado==1){
            coutafin=coutabase;
        }
        else{
            if(tipoafiliado==2)
            {
                coutafin=coutabase+coutapfam;
            }
        }
        return coutafin;
    }
}
