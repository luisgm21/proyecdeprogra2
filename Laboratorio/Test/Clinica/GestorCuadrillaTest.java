/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinica;

import static jdk.nashorn.internal.objects.NativeRegExp.test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Marco
 */
public class GestorCuadrillaTest {
    
    GestorCuadrilla gestor;
    
    public GestorCuadrillaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {//gestor = new GestorCuentas(new ArrayCuentaDAO());
        gestor = new GestorCuadrilla(new ArrayListCuadrilla());
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
     @Test
     public void AgregarCuadrilla() {//String idcuadrilla, Medico medico, Chofer chofer, Enfermero enfermero, Ambulancia vehiculo
        Medico medico=new Medico("marco","40599363","3834906823","ignacio de aguero 695",21);//String nombre, String dni, String telefono, String direccion, Integer edad
        Chofer chofer=new Chofer("pedro","40512323","3834453253","sarmiento 50",23);
        Enfermero enfermero = new Enfermero("pedro","4423123","3834453253","sarmiento 50",23);
        Ambulancia ambulancia= new Ambulancia("peugeot","208","2018","acd 324");
        gestor.agregarCuenta(new Cuadrilla("1",medico,chofer,enfermero,ambulancia));
        
        assertEquals(gestor.getCuentas().size(),1);       
      
        
     }
     @Test
      public void EliminarCuadrilla(){
        Medico medico=new Medico("marco","40599363","3834906823","ignacio de aguero 695",21);//String nombre, String dni, String telefono, String direccion, Integer edad
        Chofer chofer=new Chofer("pedro","40512323","3834453253","sarmiento 50",23);
        Enfermero enfermero = new Enfermero("pedro","4423123","3834453253","sarmiento 50",23);
        Ambulancia ambulancia= new Ambulancia("peugeot","208","2018","acd 324");
        gestor.agregarCuenta(new Cuadrilla("1",medico,chofer,enfermero,ambulancia));
        
        Medico medico1=new Medico("marco","4059234","3834906823","ignacio de aguero 695",21);//String nombre, String dni, String telefono, String direccion, Integer edad
        Chofer chofer1=new Chofer("pedro","40513453","3834453253","sarmiento 50",23);
        Enfermero enfermero1 = new Enfermero("pedro","4456623","3834453253","sarmiento 50",23);
        Ambulancia ambulancia1= new Ambulancia("peugeot","208","2018","acd 232");
        gestor.agregarCuenta(new Cuadrilla("2",medico1,chofer1,enfermero1,ambulancia1));
        gestor.eliminarCuenta("2");    
        
        assertEquals(gestor.getCuentas().size(), 1);
      }
     
        
}
