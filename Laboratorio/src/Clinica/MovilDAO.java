
package Clinica;

import java.util.Collection;


public interface MovilDAO {
    public void delete(String vnumero);
    public Ambulancia findByPK(String vnumero);
    public Collection findAll();
    public void insert(Ambulancia insertRecord);
    public void update(Ambulancia updateRecord);
}
