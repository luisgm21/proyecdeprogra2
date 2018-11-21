
package Clinica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AfiliadoTest {
    Afiliado afiliado;
    public AfiliadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        afiliado = new Afiliado("Morelli Luis Gonzalo","40598394","154237819","Esquiu 920",21);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    @Test
    public void agregarFamiliar() {
        Persona familiar=new Persona("Marco Asevey","40599363","154906823","Casa",21);
        Persona familiar2=new Persona("Raul Asson","40509509","15323454","En el puente",15);
        afiliado.agregarFamiliar(familiar);
        afiliado.agregarFamiliar(familiar2);
        assertEquals(afiliado.leerFamilia().size(),2);
    }
    @Test
    public void  eliminarFamiliar(){
        Persona familiar=new Persona("Marco Asevey","40599363","154906823","Casa",21);
        Persona familiar2=new Persona("Raul Asson","40509509","15323454","En el puente",15);
        afiliado.agregarFamiliar(familiar);
        afiliado.agregarFamiliar(familiar2);
        afiliado.eliminarFamiliar(familiar.getDni());
        assertEquals(afiliado.leerFamilia().size(),1);
    }
}
