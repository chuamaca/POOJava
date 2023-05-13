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
public class Docente extends Persona {

    private int horas;
    private double sueldo;

    public Docente() {
        Scanner teclado = new Scanner(System.in);
        String mensaje;
        mensaje = "Horas Trabajadas";
        System.out.println(mensaje);
        horas = teclado.nextInt();
        //Se deja aqui por si se quiere cambiar ya que el cosntructor se llama solo 1 vez
        sueldo = horas * 40;
    }

    @Override
    public String datos() {
        String mensaje;
        generarNombreCompleto();
        generarSueldo();
        
        mensaje = "Datos del Docente";
        mensaje += "\nNombre : " + getNomcpt();
        mensaje += "'\nEdad: " + getEdad();
        mensaje += "\nHroaras: " + horas;
        mensaje += "\nPago Por Hora s/. 40.00 ";
        mensaje += "\nSueldo:  " + sueldo;

        return mensaje;

    }

    public Docente(int horas, String nombre, String ApelillidoP, String ApellidoM, int edad) {
        super(nombre, ApelillidoP, ApellidoM, edad);
        this.horas = horas;
    }

    
    public void generarSueldo() {
        sueldo = horas * 40;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

}
