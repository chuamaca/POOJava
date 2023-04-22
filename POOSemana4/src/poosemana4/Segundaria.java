/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poosemana4;

/**
 *
 * @author u19303143
 */
public class Segundaria extends Alumno{
    
    private double P_Laborario;

    public Segundaria(double P_Laborario, String nombre, String apellido, double pp, double ep, double ef) {
        super(nombre, apellido, pp, ep, ef);
        this.P_Laborario = P_Laborario;
    }
     public String Imprimir() {
        String mensaje;
        mensaje = mostrar();
        mensaje += "\nPromedio de Laborario: " + P_Laborario;
        return mensaje;
    }

    public Double promedio() {
        double prom;
         prom = ((getEf() + getEp() + getPp() + P_Laborario)/4);
         return prom;
                         
    }

    public double getP_Laborario() {
        return P_Laborario;
    }

    public void setP_Laborario(double P_Laborario) {
        this.P_Laborario = P_Laborario;
    }
    
    
    
    
    
    
}
