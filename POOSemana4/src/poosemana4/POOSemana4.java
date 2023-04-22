/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poosemana4;

import javax.swing.JOptionPane;

/**
 *
 * @author u19303143
 */
public class POOSemana4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String mensaje, nombre, apellido;
        int cantidad, x = 0, aprobados = 0, desaprobados = 0, tipo;
        double promedio = 0, total = 0, pp, ep, ef, p_arte, p_lab;
        mensaje = "Ingrese la cantidad de Alumnos";
        mensaje = JOptionPane.showInputDialog(mensaje);
        cantidad = Integer.parseInt(mensaje);

        for (int i = 0; i < cantidad; i++) {

            tipo = opcion();
            nombre = dato("Cual es tu nombre");
            apellido = dato("Cual es tu apellido");
            mensaje = "Promedio Examen Practicas";
            pp = Double.parseDouble(dato(mensaje));
            mensaje = "Promedio Examen Parcial";
            ep = Double.parseDouble(dato(mensaje));
            mensaje = "Promedio Examen Final";
            ef = Double.parseDouble(dato(mensaje));
            x++;
            switch (tipo) {
                case 1:
                    mensaje = "Promedio Arte";
                    p_arte = Double.parseDouble(dato(mensaje));
                    mensaje = "N| " + x + " Primaria";
                    Primaria estPrimaria = new Primaria(p_arte, nombre, apellido, pp, ep, ef);
                    mensaje += estPrimaria.Imprimir();
                    promedio = estPrimaria.promedio();
                    mensaje += "\nPromedio: " + promedio;
                    if (promedio > 12) {
                        aprobados++;
                        mensaje += "\nAprobado";
                    } else {
                        desaprobados++;
                        mensaje += "\nDesaprobado";
                    }
                    total += promedio;
                    break;
                case 2:
                    mensaje = "Promedio Laboratorio";
                    p_lab = Double.parseDouble(dato(mensaje));
                    mensaje = "N| " + x + " Segundaria";
                    Segundaria estuSegundaria = new Segundaria(p_lab, nombre, apellido, pp, ep, ef);
                    mensaje+=estuSegundaria.Imprimir();
                    promedio=estuSegundaria.promedio();
                    mensaje+="\npromedio" + promedio;
                    if (promedio > 12) {
                        aprobados++;
                        mensaje += "\nAprobado";
                    } else {
                        desaprobados++;
                        mensaje += "\nDesaprobado";
                    }
                    total += promedio;
                    break;

                case 3:
                    mensaje = "Comercial";
                    break;

                default:
                    mensaje = "error";
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }
        promedio = total / x;
        mensaje = "Promedio Final: " + promedio;
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static int opcion() {
        int opcion;
        boolean error = true;
        String mensaje;
        do {

            mensaje = "Seleccione";
            mensaje += "\n1.Primaria";
            mensaje += "\n2.Segundaria";
            mensaje += "\n3.Comercial";

            mensaje = JOptionPane.showInputDialog(mensaje);
            opcion = Integer.parseInt(mensaje);

            switch (opcion) {
                case 1, 2, 3:
                    error = false;
                    break;
                default:
                    error = true;
            }

        } while (error != false);

        return opcion;
    }

    public static String dato(String mensaje) {
        String dato;
        return dato = JOptionPane.showInputDialog(mensaje);
    }
     public static String dato(String mensaje, int val) {
        String dato;
        double nota;
        boolean error = true;
        
         switch (val) {
             case 1:
                 do {
                     dato= JOptionPane.showInputDialog(mensaje);
                     nota = Double.parseDouble(dato);
                     if (nota>=0 && nota <=20) {
                         error= false;
                     }else{
                         dato="La nota debe ser mayor";
                         dato+=" o igual a 0";
                         dato+=" o menor a 20";
                         JOptionPane.showMessageDialog(null, mensaje);
                         error= true;
                     }
                     
                 } while (error!=false);
                                     
                 break;
             default:
                 mensaje="";
         }
        return dato = JOptionPane.showInputDialog(mensaje);
    }
     

}
