
package Clinica;


public class PagoAfiliado {
    private static final float CUOTABASE=300;
    private static final float CUOTAPFAM=50;
    private float coutafin;
    
    public float calculoPago(int numfam){
        coutafin=CUOTABASE+CUOTAPFAM*numfam;  
        return coutafin;
    }
}
    