
package Clinica;

import java.util.ArrayList;


public class GestorPersona {
      private final  PersonaDAO personaDAO;

    public GestorPersona(PersonaDAO personaDAO){
        this.personaDAO= personaDAO;
    }

    public ArrayList getCuentas() {
        return (ArrayList) personaDAO.findAll();
    }

    public Persona getCuenta(String numero) {
        Persona cuenta = personaDAO.findByPK(numero);
        if (cuenta!=null){
            return cuenta;
        }
       // throw new CuentaInexistenteException("Cuenta Inexistente: "+numero);
          return null;
    }

    public void agregarCuenta(Persona persona) {
        personaDAO.insert(persona);
    }
    
    public void eliminarCuenta(String numero) {
        personaDAO.delete(numero);
    }
}
