
package Clinica;

import java.util.Collection;


public interface PersonaDAO {
    public void delete(String vnumero);
    public Persona findByPK(String vnumero);
    public Collection findAll();
    public void insert(Persona insertRecord);
    public void update(Persona updateRecord);
}
