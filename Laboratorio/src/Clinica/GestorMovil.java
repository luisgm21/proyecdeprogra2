
package Clinica;

import java.util.ArrayList;

public class GestorMovil {
    private final  MovilDAO movilDAO;
    
     public GestorMovil(MovilDAO movilDAO){
        this.movilDAO= movilDAO;
    }
     
     public ArrayList getCuentas() {
        return (ArrayList) movilDAO.findAll();
    }
    
     public Ambulancia getCuenta(String numero) {
        Ambulancia cuenta = movilDAO.findByPK(numero);
        if (cuenta!=null){
            return cuenta;
        }
       // throw new CuentaInexistenteException("Cuenta Inexistente: "+numero);
          return null;
    }
     
     public void agregarCuenta(Ambulancia ambulancia) {
        movilDAO.insert(ambulancia);
    }
    
    public void eliminarCuenta(String numero) {
        movilDAO.delete(numero);
    }
}
