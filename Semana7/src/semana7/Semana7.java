/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana7;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-AQ660-308
 */
public class Semana7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String mensaje;
        int op;

        System.out.println("Datos del Alumno:");
        Alumno alumno = new Alumno();
        listar(alumno);

        System.out.println("Datos del Docente:");
        Docente docente = new Docente();
        listar(docente);

        System.out.println("Datos del Coordinador:");
        Coordinador coord = new Coordinador();
        listar(coord);

    }
    /*
    Sobrecarga:
    Cuando el metodo queremos que se conforme de manera diferente
    
    
    */
    //
    //Sobre Escritura
    //Enlace Dinamico - > Cuanod enviamos un objeto y el determina que objetos es

    public static void listar(Persona obj) {

        if (obj instanceof Alumno) {

            ((Alumno) obj).promedio();

            System.out.println(((Alumno) obj).datos());
        } else if (obj instanceof Docente) {
            System.out.println(((Docente) obj).datos());
        } else if (obj instanceof Coordinador) {
            System.out.println(((Coordinador) obj).datos());
        }

    }

}
