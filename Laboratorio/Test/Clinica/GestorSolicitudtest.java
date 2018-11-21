
package Clinica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class GestorSolicitudtest {
        GestorSolicitud gestor;
    public GestorSolicitudtest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        gestor = new GestorSolicitud(new ArrayListSolicitud());
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void agregarSolicitud() {
        Afiliado afiliado=new Afiliado("marco","40599363","3834906823","ignacio de aguero 695",21);
        Medico medico=new Medico("marco","40599363","3834906823","ignacio de aguero 695",21);
        Chofer chofer=new Chofer("pedro","40512323","3834453253","sarmiento 50",23);
        Enfermero enfermero = new Enfermero("pedro","4423123","3834453253","sarmiento 50",23);
        Ambulancia ambulancia= new Ambulancia("peugeot","208","2018","acd 324");
        Cuadrilla cuadrilla=new Cuadrilla("1",medico,chofer,enfermero,ambulancia);
        
        Administrativo administrativo=new Administrativo("raul","2154833","383465253521","chacabuco",28);
        SolicitudEm solicitud=new SolicitudEm(afiliado,cuadrilla,"ignacio de aguero 695","accidente de transito",administrativo);
        gestor.agregarCuenta(solicitud);
        
        assertEquals(gestor.getCuentas().size(),1);
        
     }
    
     
}
