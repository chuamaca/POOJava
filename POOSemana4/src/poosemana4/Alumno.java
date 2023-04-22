/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poosemana4;

/**
 *
 * @author u19303143
 */
public class Alumno {

    private String nombre, apellido, codigo;
    double pp, ep, ef;
    int edad;

    private void generarCodigo() {
        codigo = "c" + apellido + "05";
    }

    public String mostrar() {
        String mensaje;
        generarCodigo();

        mensaje = "\nNombre" + nombre;
        mensaje += "\nApellido" + apellido;
        mensaje += "\nCodigo" + codigo;
        mensaje += "\nPromedio de Practicas" + pp;
        mensaje += "\nExamen parcial" + ep;
        mensaje += "\nExamen Final" + ef;
        return mensaje;
    }

    public Alumno(String nombre, String apellido, double pp, double ep, double ef) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pp = pp;
        this.ep = ep;
        this.ef = ef;
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

    public double getPp() {
        return pp;
    }

    public void setPp(double pp) {
        this.pp = pp;
    }

    public double getEp() {
        return ep;
    }

    public void setEp(double ep) {
        this.ep = ep;
    }

    public double getEf() {
        return ef;
    }

    public void setEf(double ef) {
        this.ef = ef;
    }

    public String getCodigo() {
        return codigo;
    }

}
