
package Clinica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class GestorMovilTest {
    GestorMovil gestor;
    public GestorMovilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        gestor = new GestorMovil(new ArrayListMovil());
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void agregarAmbulancia() {        
         gestor.agregarCuenta(new Ambulancia("peugeot","208","2018","acd 324"));
         gestor.agregarCuenta(new Ambulancia("fiat","128","1998","aas 121"));
         
        
         assertEquals(gestor.getCuentas().size(),2); 
     }
     @Test
     public void eliminarAmbulancia(){
         gestor.agregarCuenta(new Ambulancia("peugeot","208","2018","acd 324"));
         gestor.agregarCuenta(new Ambulancia("fiat","128","1998","aas 121"));
         gestor.eliminarCuenta("aas 121");
         assertEquals(gestor.getCuentas().size(),1);
     }
}
