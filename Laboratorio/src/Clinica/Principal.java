package Clinica;

import Grafica.Principal1;
import java.util.ArrayList;

// menu principal
public class Principal {

    
    public static void main(String[] args) {
        PersonaDAO persona=new ArrayListPersona();
        MovilDAO movil = new ArrayListMovil();
        CuadrillaDAO cuad = new ArrayListCuadrilla();
        SolicitudDAO soli = new ArrayListSolicitud();
        Principal1 prin = new Principal1(persona,movil,cuad,soli);
        prin.setVisible(true);
        

        
       
    /*//Ambulancia ambu = new Ambulancia("AC 380 KK");         
    ArrayList lista = new ArrayList();//vectores    
    Chofer cho = new Chofer();
    Enfermero enfe = new Enfermero();
    Medico medi = new Medico();
    
    Cuadrilla cuadri = new Cuadrilla();
    cuadri.cargaCuadrilla();
       
   // lista.add(ambu);*/
    }
    
}
