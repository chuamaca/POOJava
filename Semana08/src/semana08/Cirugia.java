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
public class Cirugia extends Paciente implements Reporte, Apoyo {

    private int cantidad_dias;
    private double costo_dia, rehabilitacion, costo_total;
    private double costo_resonancia;

    public Cirugia(int especialidades) {
        super(especialidades);
        Scanner teclado = new Scanner(System.in);
        String mensaje;
        mensaje = "Dias de internamiento";
        System.out.println(mensaje);
        cantidad_dias = teclado.nextInt();

        mensaje = "Costo por dia";
        System.out.println(mensaje);
        costo_dia = teclado.nextDouble();

        mensaje = "Dias de Rehabilitacion";
        System.out.println(mensaje);
        rehabilitacion = teclado.nextInt();
        
        
        mensaje = "Costo por Resonancia";
        System.out.println(mensaje);
        costo_resonancia = teclado.nextDouble();
        
        
    }

    public Cirugia(int cantidad_dias, double costo_dia, double rehabilitacion, int especialidades) {
        super(especialidades);
        this.cantidad_dias = cantidad_dias;
        this.costo_dia = costo_dia;
        this.rehabilitacion = rehabilitacion;
    }

    //Implementaciones de Interfase PACIENTE
    @Override
    public double importe() {
        double descuento;
        costo_total = (cantidad_dias * costo_dia) + (rehabilitacion * costo_dia);
        if (rehabilitacion > 0) {

            descuento = descuento() * costo_total;
            costo_total = costo_total - descuento;
            //costo_total -= descuento;
            if (getEspecialidad() == 2) {
                descuento = descuento() * costo_total;
                costo_total = costo_total - descuento + costo_resonancia ;
            }
        }
        return costo_total;
    }

    //Implementaciones de Interfase REPORTE
    @Override
    public void Imprimir() {
        String mensaje;
        mensaje = datos();
        mensaje += "\nDatos de la cirujia";
        mensaje += "\nCosto por dia: " + costo_dia;
        mensaje += "\nCantidad de dias: " + cantidad_dias;
        mensaje += "\nDias en Rehabilitacion: " + rehabilitacion;
        
         mensaje += "\nCosto Resonacia: " + costo_resonancia;
        mensaje += "\nDescuento: " + descuento();
        mensaje += "\nCosto Total:  " + importe();
        System.out.println(mensaje);

    }

    //Implementaciones de Interfase APOYO
    @Override
    public double descuento() {
        double desc = 0;
        if (rehabilitacion > 0) {
            if (getEdad() <= 15) {
                desc = 0.2;
            }

        } else {
            if (getEdad() <= 60) {
                desc = 0.1;
            } else {
                desc = 0.25;
            }
        }
        return desc;
    }

}
