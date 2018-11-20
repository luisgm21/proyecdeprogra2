
package Clinica;

import Excepciones.PersonaExistenteException;
import java.util.ArrayList;
import java.util.Collection;


public class ArrayListSolicitud implements SolicitudDAO {
    
    private final ArrayList<SolicitudEm>lista=new ArrayList();

    @Override
    public void delete(String numero) {
        SolicitudEm existe = findByPK(numero);
        if (existe != null) {
            lista.remove(existe);            
            return;
        }        
    }

    @Override
    public SolicitudEm findByPK(String vnumero) {
        SolicitudEm resultado = null;
         for (Object solicitud : lista) {
            SolicitudEm c = (SolicitudEm)solicitud;
            if (c.getDomicilio().equals(vnumero)==true){
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
    public void insert(SolicitudEm insertRecord) {
        SolicitudEm existe = findByPK(insertRecord.getDomicilio());
        if (existe != null) {
            throw new PersonaExistenteException("Solicitud existente " + existe.getDomicilio());
        }
        lista.add(insertRecord);
    }

    @Override
    public void update(SolicitudEm updateRecord) {
        
    }
    
}
