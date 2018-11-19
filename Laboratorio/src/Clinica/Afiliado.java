
package Clinica;

import Grafica.AltaAfiliados;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


public class Afiliado extends Persona{
    
   // private LocalDateTime fechaultpago;
    private ArrayList<Persona>familia=new ArrayList();
    private int numdefam;
    private PagoAfiliado pago;
    Calendar fecha1 = GregorianCalendar.getInstance(); 
    //DateTimeFormatter miFormatFecha = DateTimeFormatter.ofPattern("d/MM/yyyy H:mm:ss");
    
    public Afiliado(){
        
    }

    public Calendar getFecha1() {
        return fecha1;
    }

    public void setFecha1(Calendar fecha1) {
        this.fecha1 = fecha1;
    }
    
    
    /*public LocalDateTime getFechaultpago() {
        return fechaultpago;
    }

    public void setFechaultpago(LocalDateTime fechaultpago) {
        this.fechaultpago = fechaultpago;
    }*/

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
        familia.add(familiar);
        this.numdefam=familia.size();
        
    }
    public void setFamilia(ArrayList familia){
        this.familia=familia;
    }
    public ArrayList leerFamilia(){
        return familia;
    }
    /*  public void CapturarDatos(){
    super.setNombre(AltaAfiliados.nomb.getText());
    super.setDireccion(AltaAfiliados.direc.getText());
    super.setEdad(Integer.parseInt(AltaAfiliados.eda.getText()));
    super.setTelefono(AltaAfiliados.telf.getText());
    super.setDni(AltaAfiliados.Dni.getText());
    }*/
    public void ImprimirDatos(){
        JOptionPane.showMessageDialog(null,"El Nombre del afiliado es: "+nombre+"\n Su edad es: "+edad+"\n su Direccion: "+direccion+"\n su dni: "+dni+"\n Su telefono: "+telefono,"Mensaje" , JOptionPane.PLAIN_MESSAGE);
    } 
    
}

