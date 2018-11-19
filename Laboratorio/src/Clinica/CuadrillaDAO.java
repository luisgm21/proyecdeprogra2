
package Clinica;

import java.util.Collection;

public interface CuadrillaDAO {
    
    public void delete(String vnumero);
    public Cuadrilla findByPK(String vnumero);
    public Collection findAll();
    public void insert(Cuadrilla insertRecord);
    public void update(Cuadrilla updateRecord);
    
}
