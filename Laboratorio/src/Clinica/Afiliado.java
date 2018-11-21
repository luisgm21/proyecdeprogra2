
package Clinica;

import Excepciones.PersonaExistenteException;
import Grafica.AltaAfiliados;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


public class Afiliado extends Persona{
    
    Calendar fechaultpago;
    private ArrayList<Persona>familia=new ArrayList();
    private Integer numdefam;
    private PagoAfiliado pago;
    Calendar fechaActual = GregorianCalendar.getInstance(); 
    //DateTimeFormatter miFormatFecha = DateTimeFormatter.ofPattern("d/MM/yyyy H:mm:ss");
    
    public Afiliado(){
        
    }

    public Calendar getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Calendar fechaActual) {
        this.fechaActual = fechaActual;
    }
    
    
    public Calendar getFechaultpago() {
        return fechaultpago;
    }

    public void setFechaultpago(Calendar fechaultpago) {
        this.fechaultpago = fechaultpago;
    }

    public int getNumdefam() {
        return numdefam;
    }

    public void setNumdefam(int numdefam) {
        this.numdefam = numdefam;
    }

    public PagoAfiliado getPago() {
        return pago;
    }

    public void setPago(PagoAfiliado pago) {
        this.pago = pago;
    }
    public Afiliado(String nombre, String dni, String telefono, String direccion, Integer edad){
        super(nombre,dni,telefono,direccion,edad);
        
        //fechaultpago=LocalDateTime.parse("18/11/2018 00:00:00", miFormatFecha);
    }
    public void agregarFamiliar(Persona familiar){
        Persona existe=buscarFamiliar(familiar.getDni());
        if(existe!=null){
           throw new PersonaExistenteException("persona existente " + existe.getNombre());
        }
        familia.add(familiar);
        this.numdefam=familia.size();
    }
    public void eliminarFamiliar(String numero) {
        Persona existe = buscarFamiliar(numero);
        if (existe != null) {
            familia.remove(existe);                     
        }        
       
    }
    public Persona buscarFamiliar(String vnumero)  {
        Persona resultado = null;
         for (Object persona : familia) {
            Persona c = (Persona)persona;
            if (c.getDni().equals(vnumero)==true){
                resultado=c;
            }
        }
        return resultado;
    }
    public void setFamilia(ArrayList familia){
        this.familia=familia;
    }
    public ArrayList leerFamilia(){
        return familia;
    }
    public Persona getFamiliar(String numero) {
        Persona cuenta = buscarFamiliar(numero);
        if (cuenta!=null){
            return cuenta;
        }
       // throw new CuentaInexistenteException("Cuenta Inexistente: "+numero);
          return null;
    }
    public Float Pago(){
        pago=new PagoAfiliado(numdefam);
        return pago.calculoPago();
    }

    /*  public void CapturarDatos(){
    super.setNombre(AltaAfiliados.nomb.getText());
    super.setDireccion(AltaAfiliados.direc.getText());
    super.setEdad(Integer.parseInt(AltaAfiliados.eda.getText()));
    super.setTelefono(AltaAfiliados.telf.getText());
    super.setDni(AltaAfiliados.Dni.getText());
    }*/  
}

