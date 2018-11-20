
package Clinica;

import java.util.Collection;


public interface SolicitudDAO {
    
    public void delete(String vnumero);
    public SolicitudEm findByPK(String vnumero);
    public Collection findAll();
    public void insert(SolicitudEm insertRecord);
    public void update(SolicitudEm updateRecord);
}
