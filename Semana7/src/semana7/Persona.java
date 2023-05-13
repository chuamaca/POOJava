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
/*
Poliformismo



 */
public class Persona {

    private String nombre, ApelillidoP, ApellidoM, nomcpt;
    private int edad;

    public String datos() {

        String mensaje;
        mensaje = "Datos";
        return mensaje;
    }

    public void generarNombreCompleto() {
        nomcpt = ApelillidoP + " " + ApellidoM + ", " + nombre;
    }

    public Persona() {

        Scanner teclado = new Scanner(System.in);
        String mensaje;
        mensaje = "Cual es tu nombre";
        System.out.println(mensaje);
        this.nombre = teclado.next();

        mensaje = "Cual es tu Apellido Paterno";
        System.out.println(mensaje);
        this.ApelillidoP = teclado.next();

        mensaje = "Cual es tu Apellido Materno";
        System.out.println(mensaje);
        this.ApellidoM = teclado.next();

        mensaje = "Cual es tu Edad";
        System.out.println(mensaje);
        this.edad = teclado.nextInt();

    }

    public Persona(String nombre, String ApelillidoP, String ApellidoM, int edad) {
        this.nombre = nombre;
        this.ApelillidoP = ApelillidoP;
        this.ApellidoM = ApellidoM;
        this.edad = edad;
    }

    public String getNomcpt() {
        return nomcpt;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelillidoP() {
        return ApelillidoP;
    }

    public void setApelillidoP(String ApelillidoP) {
        this.ApelillidoP = ApelillidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
