
package Clinica;

import java.util.ArrayList;
import java.util.HashMap;



public class Cuadrilla {
    ArrayList lista = new ArrayList();//vectores
    ArrayList lista1 = new ArrayList();
    HashMap<Object,Object> cuadrilla = new HashMap<Object,Object>();
    Ambulancia ambu = new Ambulancia("AC 380 KK");
    Chofer cho = new Chofer("Marco");
    Enfermero enfe = new Enfermero("Raul");
    Medico medi = new Medico("Luis");
    
       
    public ArrayList getLista(){       
        lista.add(cho);
        lista.add(enfe);
        lista.add(medi);        
        return (lista);
    }
      
     public ArrayList getLista1(){       
        lista1.add(ambu);               
        return (lista1);
    }
    
    /*public void cargaCuadrilla(){
        lista.add(cho.getNombre());
        lista.add(medi.getNombre());
        lista.add(enfe.getNombre());
        
        cuadrilla.put(ambu.getPatente(),lista);
        System.out.println(cuadrilla);
        
        
    }*/

    public String getAmbu() {
        return ambu.ambulancia();
    }

    public String getCho() {
        return cho.getNombre();
    }

    public String getEnfe() {
        return enfe.getNombre();
    }

    public String getMedi() {
        return medi.getNombre();
    }
    
    
}
