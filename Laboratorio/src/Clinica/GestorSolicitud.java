
package Clinica;

import java.util.ArrayList;


public class GestorSolicitud {
     private final  SolicitudDAO solicitudDAO;
     
     
     public GestorSolicitud(SolicitudDAO solicitudDAO){
        this.solicitudDAO= solicitudDAO;
    }
     
      public ArrayList getCuentas() {
        return (ArrayList) solicitudDAO.findAll();
    }
      
    public SolicitudEm getCuenta(String numero) {
        SolicitudEm cuenta = solicitudDAO.findByPK(numero);
        if (cuenta!=null){
            return cuenta;
        }
       // throw new CuentaInexistenteException("Cuenta Inexistente: "+numero);
          return null;
    } 
    
    public void agregarCuenta(SolicitudEm solicitud) {
        solicitudDAO.insert(solicitud);
    }
    
    public void eliminarCuenta(String numero) {
        solicitudDAO.delete(numero);
    }
    
}
