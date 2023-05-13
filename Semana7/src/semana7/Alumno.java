/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-AQ660-308
 */
public class Alumno extends Persona {

    private Double promedio, pp, ep, ef;

    public Alumno() {
        Scanner teclado = new Scanner(System.in);
        String mensaje;
        mensaje = "PROMEDIO PRACTICAS";
        System.out.println(mensaje);
        pp = teclado.nextDouble();

        mensaje = "Examen Parcial";
        System.out.println(mensaje);
        ep = teclado.nextDouble();

        mensaje = "Examen Final";
        System.out.println(mensaje);
        ef = teclado.nextDouble();

    }

    public Alumno(Double promedio, Double pp, Double ep, Double ef, String nombre, String ApelillidoP, String ApellidoM, int edad) {
        /*Se usa el super ya que estas Heredeando de la clase Padre*/
        super(nombre, ApelillidoP, ApellidoM, edad);
        this.promedio = promedio;
        this.pp = pp;
        this.ep = ep;
        this.ef = ef;
    }
    
    public void promedio(){
        
        promedio= (ep +pp+ef)/3;
    }
    
   @Override
    public String datos() {
        String mensaje;
        generarNombreCompleto();
        promedio();
        mensaje = "";
        mensaje += "\nNombre Completo: " + getNomcpt();
        mensaje += "'\nEdad: " + getEdad();
        mensaje += "\nExamen Parcial: " + ep;
        mensaje += "\nExamen final: " + ef;
        mensaje += "\nPromedio Parcial: " + pp;
        mensaje += "\nPromedio: " + promedio;

        return mensaje;

    }

}
