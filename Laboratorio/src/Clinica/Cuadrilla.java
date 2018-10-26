
package Clinica;

import java.util.ArrayList;
import java.util.HashMap;



public class Cuadrilla {
    ArrayList lista = new ArrayList();//vectores
    HashMap<Object,Object> cuadrilla = new HashMap<Object,Object>();
    Ambulancia ambu = new Ambulancia("AC 380 KK");
    Chofer cho = new Chofer("Marco");
    Enfermero enfe = new Enfermero("Raul");
    Medico medi = new Medico("Luis");
    
  
    
    public void cargaCuadrilla(){
        lista.add(cho.getNombre());
        lista.add(medi.getNombre());
        lista.add(enfe.getNombre());
        
        cuadrilla.put(ambu.getPatente(),lista);
        System.out.println(cuadrilla);
        
        
    }
    
    
}
