
package Clinica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class GestorPersonatst {
        GestorPersona gestor;
    public GestorPersonatst() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {//gestor = new GestorCuadrilla(new ArrayListCuadrilla());
        gestor = new GestorPersona(new ArrayListPersona());
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void agregarPersona() {
         gestor.agregarCuenta(new Medico("marco","40599363","3834906823","ignacio de aguero 695",21));
         gestor.agregarCuenta(new Afiliado("pedro","42599363","38349123423","rivadavia 213",21));
         gestor.agregarCuenta(new Enfermero("pedro","4423123","3834453253","sarmiento 50",23));
         gestor.agregarCuenta(new Chofer("asael","1524875","38349157126","illia 21",35));
         gestor.agregarCuenta(new Administrativo("raul","2154833","383465253521","chacabuco",28));
       
         assertEquals(gestor.getCuentas().size(),5); 
     }
     @Test
     public void eliminarPersona(){
         gestor.agregarCuenta(new Medico("marco","40599363","3834906823","ignacio de aguero 695",21));
         gestor.agregarCuenta(new Afiliado("pedro","42599363","38349123423","rivadavia 213",21));
         gestor.agregarCuenta(new Enfermero("pedro","4423123","3834453253","sarmiento 50",23));
         gestor.agregarCuenta(new Chofer("asael","1524875","38349157126","illia 21",35));
         gestor.agregarCuenta(new Administrativo("raul","2154833","383465253521","chacabuco",28));
         gestor.eliminarCuenta("40599363");
         assertEquals(gestor.getCuentas().size(),4);
     }
}
