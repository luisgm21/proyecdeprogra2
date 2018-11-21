
package Clinica;


public class PagoAfiliado {
    private static final float CUOTABASE=500;
    private static final float CUOTAPFAM=100;
    private Integer numdefam=0;
    private Float coutafin;
    public PagoAfiliado(Integer numdefam){
        if(numdefam !=null){
            this.numdefam=numdefam;
        }else{
            numdefam=0;
        }
    }    
    public Float calculoPago(){
        coutafin=CUOTABASE+CUOTAPFAM*numdefam;  
        return coutafin;
    }
}
    