
package Clinica;

import java.util.ArrayList;
import java.util.HashMap;



public class Cuadrilla {
    private Medico medic;
    private Chofer chof;
    private Ambulancia ambula;
    private Enfermero enfermero;
    private String estado="desocupado";
    
    HashMap<Object,Object> cuadrilla = new HashMap<Object,Object>();
    
    
       
    public void getLista(){   
        Ambulancia ambu = new Ambulancia("AC 380 KK");
        Chofer cho = new Chofer("Marco");
        Enfermero enfe = new Enfermero("Raul");
        Medico medi = new Medico("Luis");
        medic=medi;
        chof=cho;
        ambula=ambu;
        enfermero=enfe;
    }
      
     public void getLista1(){
         Ambulancia ambu = new Ambulancia("AR 350 JJ");
        Chofer cho = new Chofer("Nico");
        Enfermero enfe = new Enfermero("chino");
        Medico medi = new Medico("Asael");
        medic=medi;
        chof=cho;
        ambula=ambu;
        enfermero=enfe;
    }
    
    /*public void cargaCuadrilla(){
        lista.add(cho.getNombre());
        lista.add(medi.getNombre());
        lista.add(enfe.getNombre());
        
        cuadrilla.put(ambu.getPatente(),lista);
        System.out.println(cuadrilla);
        
        
    }*/
     
    

    public String getAmbu() {
        return ambula.ambulancia();
    }

    public String getCho() {
        return chof.nombre;
    }

    public String getEnfe() {
        return enfermero.nombre;
    }

    public String getMedi() {
        return medic.nombre;
    }
    public String getEstado(){
        return estado;
    }
    
    
}
