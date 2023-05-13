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
public class Coordinador extends Persona {

    int nroDocente, nroCurso;

    public Coordinador() {
        Scanner teclado= new Scanner(System.in);
        String mensaje;
        mensaje="Nro De Docentes";
        System.out.println(mensaje);
        nroDocente= teclado.nextInt();
        
         mensaje="Nro De Cursos";
        System.out.println(mensaje);
        
        nroCurso= teclado.nextInt();
    }

    public Coordinador(int nroDocente, int nroCurso, String nombre, String ApelillidoP, String ApellidoM, int edad) {
        super(nombre, ApelillidoP, ApellidoM, edad);
        this.nroDocente = nroDocente;
        this.nroCurso = nroCurso;
    }

    @Override
    public String datos() {
        String mensaje;
        generarNombreCompleto();

        mensaje = "Datos del Coordinador";
        mensaje += "\nNombre : " + getNomcpt();
        mensaje += "'\nEdad: " + getEdad();
        mensaje += "\nNro Docente: " +nroDocente ;
        mensaje += "\nNro CUrsos: " + nroCurso;

        return mensaje;

    }

    public int getNroDocente() {
        return nroDocente;
    }

    public void setNroDocente(int nroDocente) {
        this.nroDocente = nroDocente;
    }

    public int getNroCurso() {
        return nroCurso;
    }

    public void setNroCurso(int nroCurso) {
        this.nroCurso = nroCurso;
    }

}
