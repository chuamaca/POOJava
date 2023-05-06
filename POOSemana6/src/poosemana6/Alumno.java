/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poosemana6;

/**
 *
 * @author u19303143
 */
public abstract class Alumno {
    
    public String nombre, apellido, nomcmp;
    private double promedio, EP, EF, PP,PA;

    public double getPP() {
        return PP;
    }

    public void setPP(double PP) {
        this.PP = PP;
    }
    
    
    public abstract double promedio();
    public abstract String datos();
    
    public void generar(){
        nomcmp = apellido + ", "+ nombre;
    }
    
    public String info(){
        String mensaje;
        generar();
        mensaje ="DAtos de Alumno";
           mensaje +="\nNombre:" + nomcmp;
           mensaje +="\nParcial:" + EP;
           mensaje +="\nP. Practicas:" + PP;
           mensaje +="\nParticipacion:" + PA;
           mensaje +="\nE.Final:" + EF;
           mensaje +="\nE.Final:" + promedio;
           
        
        return mensaje;
    }
    

    public Alumno(String nombre, String apellido, double EP, double EF, double PP, double PA) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.EP = EP;
        this.EF = EF;
        this.PP = PP;
        this.PA = PA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getEP() {
        return EP;
    }

    public void setEP(double EP) {
        this.EP = EP;
    }

    public double getEF() {
        return EF;
    }

    public void setEF(double EF) {
        this.EF = EF;
    }

    public double getPA() {
        return PA;
    }

    public void setPA(double PA) {
        this.PA = PA;
    }
    
    
}
