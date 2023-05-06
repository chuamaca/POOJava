/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poosemana6;

/**
 *
 * @author u19303143
 */
public class Primaria extends Alumno {

    private double pesoEp, pesoEf, pesoPp, pesoPa;

    public Primaria(double pesoEp, double pesoEf, double pesoPp, double pesoPa, String nombre, String apellido, double EP, double EF, double PP, double PA) {
        super(nombre, apellido, EP, EF, PP, PA);
        this.pesoEp = pesoEp;
        this.pesoEf = pesoEf;
        this.pesoPp = pesoPp;
        this.pesoPa = pesoPa;
    }

    @Override
    public double promedio() {
        double promedioFinal = 0;

        promedioFinal = pesoEf + getEF() + pesoEp + getEP() + pesoPa + getPA() + pesoPp + getPP();

        return promedioFinal;
    }

    @Override
    public String datos() {
        String mensaje;

        promedio();
        mensaje = info();
        mensaje += "\nZXXX";

        return mensaje;

    }

    public double getPesoEp() {
        return pesoEp;
    }

    public void setPesoEp(double pesoEp) {
        this.pesoEp = pesoEp;
    }

    public double getPesoEf() {
        return pesoEf;
    }

    public void setPesoEf(double pesoEf) {
        this.pesoEf = pesoEf;
    }

    public double getPesoPp() {
        return pesoPp;
    }

    public void setPesoPp(double pesoPp) {
        this.pesoPp = pesoPp;
    }

    public double getPesoPa() {
        return pesoPa;
    }

    public void setPesoPa(double pesoPa) {
        this.pesoPa = pesoPa;
    }

}
