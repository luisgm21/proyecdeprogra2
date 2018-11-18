
package Clinica;

import java.util.ArrayList;




public class Cuadrilla {
    private String idcuadrilla;
    private String estado="Desocupado";
    
    
    
    
    public Cuadrilla(String cuadrilla, String estado) {
        this.idcuadrilla = idcuadrilla;
        this.estado = estado;
    }

    public Cuadrilla() {
       
    }

    

    public void setCuadrilla(String cuadrilla) {
        this.idcuadrilla = idcuadrilla;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdcuadrilla() {
        return idcuadrilla;
    }

    
    
    
    
    
       
    /*public void getLista(){   
        Ambulancia ambu = new Ambulancia("AC 380 KK");
        Chofer cho = new Chofer("Marco");
        Enfermero enfe = new Enfermero("Raul");
        Medico medi = new Medico("Luis");
        medic=medi;
        chof=cho;
        ambula=ambu;
        enfermero=enfe;
    }*/
      
    /* public void getLista1(){
         Ambulancia ambu = new Ambulancia("AR 350 JJ");
        Chofer cho = new Chofer("Nico");
        Enfermero enfe = new Enfermero("chino");
        Medico medi = new Medico("Asael");
        medic=medi;
        chof=cho;
        ambula=ambu;
        enfermero=enfe;
    }*/
    
    /*public void cargaCuadrilla(){
        lista.add(cho.getNombre());
        lista.add(medi.getNombre());
        lista.add(enfe.getNombre());
        
        cuadrilla.put(ambu.getPatente(),lista);
        System.out.println(cuadrilla);
        
        
    }*/
     
    

   /* public String getAmbu() {
        return ambula.ambulancia();
    }

    public String getCho() {
        return chof.nombre;
    }

    public String getEnfe() {
        return enfermero.nombre;
    }

    public String getMedi() {
        return medic.nombre;
    }*/
    public String getEstado(){
        return estado;
    }
    
    
}
