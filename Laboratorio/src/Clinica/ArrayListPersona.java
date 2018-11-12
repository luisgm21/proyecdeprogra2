
package Clinica;

import java.util.ArrayList;
import java.util.Collection;


public class ArrayListPersona implements PersonaDAO{
    private final ArrayList<Persona>lista=new ArrayList();
    
    @Override
    public Persona findByPK(String vnumero)  {
        Persona resultado = null;
         for (Object persona : lista) {
            Persona c = (Persona)persona;
            if (c.getDni().equals(vnumero)==true){
                resultado=c;
            }
        }
        return resultado;
    }
    @Override
    public void delete(String numero) {
        Persona existe = findByPK(numero);
        if (existe != null) {
            lista.remove(existe);            
            return;
        }        
       
    }
    @Override
     public Collection findAll(){       
        return lista;
    }        
    @Override
      public void insert(Persona insertRecord) {
        Persona existe = findByPK(insertRecord.getDni());
        
        lista.add(insertRecord);
    }

    @Override
    public void update(Persona updateRecord) {
        
    }
    
}
