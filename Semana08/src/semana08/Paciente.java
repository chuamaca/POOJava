/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana08;

import java.util.Scanner;

/**
 *
 * @author chuamani
 */
public abstract class Paciente {

    private String nombre, desp;
    private int edad, especialidad;

    public abstract double importe();

    public Paciente(int especialidades) {
        Scanner teclado= new Scanner(System.in);
        
        especialidad= especialidades;
        String mensaje;
        mensaje="Ingrese su nombre";
        System.out.println(mensaje);
        nombre= teclado.next();
        mensaje="Ingrese SU EDAD";
        System.out.println(mensaje);
        edad= teclado.nextInt();
        
    }

    public String datos() {
        String mensaje;
        generar();
        mensaje = "Datos del paciente";
        mensaje += "|Nombre:" + nombre;
        mensaje += "|Edad:" + edad;
        mensaje += "|Especialidad:" + desp;

        return mensaje;
    }

    public void generar() {
        switch (especialidad) {
            case 1:
                desp = "Cirugia";
                break;
            case 2:
                desp = "Nefrologia";
                break;
            case 3:
                desp = "Gastroenteorologia";
                break;

            default:
                desp = "Error";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }
    

}
