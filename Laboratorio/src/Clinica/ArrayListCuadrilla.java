
package Clinica;

import Excepciones.PersonaExistenteException;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayListCuadrilla implements CuadrillaDAO {
    private final ArrayList<Cuadrilla>lista=new ArrayList();

    @Override
    public void delete(String numero) {
        Cuadrilla existe = findByPK(numero);
        if (existe != null) {
            lista.remove(existe);            
            return;
        }       
    }

    @Override
    public Cuadrilla findByPK(String vnumero) {
        Cuadrilla resultado = null;
         for (Object cuadrilla : lista) {
            Cuadrilla c = (Cuadrilla)cuadrilla;
            if (c.getIdcuadrilla().equals(vnumero)==true){
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
    public void insert(Cuadrilla insertRecord) {
        Cuadrilla existe = findByPK(insertRecord.getVehiculo().getPatente());
        if (existe != null) {
            throw new PersonaExistenteException("Cuadrilla existente " + existe.getIdcuadrilla());
        }
        lista.add(insertRecord);
    }

    @Override
    public void update(Cuadrilla updateRecord) {
        
    }
}
