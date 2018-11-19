
package Clinica;

import Excepciones.PersonaExistenteException;
import java.util.ArrayList;
import java.util.Collection;


public class ArrayListMovil implements MovilDAO {
    private final ArrayList<Ambulancia>lista=new ArrayList();

    @Override
    public void delete(String numero) {
       Ambulancia existe = findByPK(numero);
        if (existe != null) {
            lista.remove(existe);            
            return;
        }        
    }

    @Override
    public Ambulancia findByPK(String vnumero) {
        Ambulancia resultado = null;
         for (Object ambulancia : lista) {
            Ambulancia c = (Ambulancia)ambulancia;
            if (c.getPatente().equals(vnumero)==true){
                resultado=c;
            }
        }
        return resultado;
    }

    @Override
    public Collection findAll() {
        return lista;
    }

    @Override
    public void insert(Ambulancia insertRecord) {
        Ambulancia existe = findByPK(insertRecord.getPatente());
        if (existe != null) {
            throw new PersonaExistenteException("Ambulancia existente " + existe.getMarca()+ existe.getModelo()+ existe.getPatente());
        }
        lista.add(insertRecord);        
    }

    @Override
    public void update(Ambulancia updateRecord) {
        
    }
    
}
