
package Clinica;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Afiliado extends Persona{
    private int numafiliado;
    private LocalDateTime fechaultpago;
    private ArrayList<Persona>familia=new ArrayList();
    private PagoAfiliado pago;
}
