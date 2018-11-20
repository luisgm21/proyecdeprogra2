
package Clinica;

import java.util.ArrayList;




public class Cuadrilla {
    private String idcuadrilla;
    private String estado="Desocupado";
    private Medico medico;
    private Chofer chofer;
    private Enfermero enfermero;
    private Ambulancia vehiculo;
    
    
    public Cuadrilla(String cuadrilla, String estado) {
        this.idcuadrilla = idcuadrilla;
        this.estado = estado;
    }

    public Cuadrilla() {
       
    }

    

    public void setCuadrilla(String cuadrilla) {
        this.idcuadrilla = cuadrilla;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdcuadrilla() {
        return idcuadrilla;
    }

    public void setMedico(Medico medico){
        this.medico=medico;
    }
    
    public void setChofer(Chofer chofer){
        this.chofer=chofer;
    }
    
    public void setEnfermero(Enfermero enfermero){
        this.enfermero=enfermero;
    }
    
    public void setVehiculo(Ambulancia vehiculo){
        this.vehiculo=vehiculo;
    }
    
    public void setIdcuadrilla(String id){
        idcuadrilla=id;
    }
    public Medico getMedico(){
        return medico;
    }
    public Chofer getChofer(){
        return chofer;
    }
    
    public Enfermero getEnfermero(){
        return enfermero;
    }
    
    public Ambulancia getVehiculo(){
        return vehiculo;
    }
    
    @Override
    public String toString(){
        return this.getIdcuadrilla();
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
