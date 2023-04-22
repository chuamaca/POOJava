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
        double promedio = 0, total = 0, pp, ep, ef, parte;
        mensaje = "Ingrese la cantidad de Alumnos";
        mensaje = JOptionPane.showInputDialog(mensaje);
        cantidad = Integer.parseInt(mensaje);

        for (int i = 0; i < cantidad; i++) {

            tipo = opcion();
            nombre = dato("Cual es tu nombre");
            apellido = dato("Cual es tu apellido");
            mensaje = dato("Promedio Examen Practicas");
            pp = Double.parseDouble(dato(mensaje));
            mensaje = dato("Promedio Examen Parcial");
            ep = Double.parseDouble(dato(mensaje));
            mensaje = dato("Promedio Examen Final");
            ef = Double.parseDouble(dato(mensaje));
            x++;
            switch (tipo) {
                case 1:
                    mensaje = "Promedio Arte";
                    parte = Double.parseDouble(dato(mensaje));
                    mensaje = "N| " + x + " Primaria";

                    Primaria estPrimaria = new Primaria(parte, nombre, apellido, pp, ep, ef);
                    mensaje += estPrimaria.Imprimir();
                    promedio = estPrimaria.promedio();
                    mensaje += "\nPromedio:" + promedio;
                    if (promedio < 12) {
                        aprobados++;
                        mensaje += "\nAprobado";
                    } else {
                        desaprobados++;
                        mensaje += "\nDesaprobado";
                    }
                    total += promedio;

                    break;

                case 2:
                    mensaje = "Segundaria";
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

}
