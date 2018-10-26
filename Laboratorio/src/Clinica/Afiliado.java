
package Clinica;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Afiliado extends Persona{
    private int numafiliado;
    private LocalDateTime fechaultpago;
    private ArrayList<Persona>familia=new ArrayList();
    private int numdefam;
    private PagoAfiliado pago;
    public Afiliado(){
        
    }
    public Afiliado(String nombre, String dni, String telefono, String direccion, String edad){
        super(nombre,dni,telefono,direccion,edad);
    }
    public void agregarFamiliar(Persona familiar){
        familia.add(familiar);
        numdefam=familia.size();
    }
}

