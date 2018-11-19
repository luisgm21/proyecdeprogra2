
package Clinica;

import java.util.ArrayList;

public class GestorCuadrilla {
     private final  CuadrillaDAO cuadrillaDAO;
     
     public GestorCuadrilla(CuadrillaDAO cuadrillaDAO){
        this.cuadrillaDAO= cuadrillaDAO;
    }
     
     public ArrayList getCuentas() {
        return (ArrayList) cuadrillaDAO.findAll();
    }
     
     public Cuadrilla getCuenta(String numero) {
        Cuadrilla cuenta = cuadrillaDAO.findByPK(numero);
        if (cuenta!=null){
            return cuenta;
        }
       // throw new CuentaInexistenteException("Cuenta Inexistente: "+numero);
          return null;
    }
     
     public void agregarCuenta(Cuadrilla cuadrilla) {
      cuadrillaDAO.insert(cuadrilla);
    }
    
    public void eliminarCuenta(String numero) {
        cuadrillaDAO.delete(numero);
    }
    
}
