/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poosemana4;

/**
 *
 * @author u19303143
 */
public class Primaria extends Alumno {

    private double P_Arte;

    public Primaria(double P_Arte, String nombre, String apellido, double pp, double ep, double ef) {
        super(nombre, apellido, pp, ep, ef);
        this.P_Arte = P_Arte;
    }

    public String Imprimir() {
        String mensaje;
        mensaje = mostrar();
        mensaje += "\nPromedio de Arte: " + P_Arte;
        System.out.println("Imprimir"+mensaje);
        return mensaje;
    }

    public Double promedio() {
        double prom;
         prom = ((getEf() + getEp() + getPp() + P_Arte)/4);
         System.out.println("Promedio Segundaria: "+ prom);
         return prom;
                         
    }

    public double getP_Arte() {
        return P_Arte;
    }

    public void setP_Arte(double P_Arte) {
        this.P_Arte = P_Arte;
    }

}
