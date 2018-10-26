package Clinica;

import java.util.ArrayList;


public class Principal {

    
    public static void main(String[] args) {
        
        
    //Ambulancia ambu = new Ambulancia("AC 380 KK");         
    ArrayList lista = new ArrayList();//vectores    
    Chofer cho = new Chofer();
    Enfermero enfe = new Enfermero();
    Medico medi = new Medico();
    
    Cuadrilla cuadri = new Cuadrilla();
    cuadri.cargaCuadrilla();
       
   // lista.add(ambu);
    }
    
}
