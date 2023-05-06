/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poosemana6;

import javax.swing.JOptionPane;

/**
 *
 * @author u19303143
 */
public class POOSemana6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Primaria p= new Primaria(, 0, 0, 0, nombre, apellido, 0, 0, 0, 0);
        String mensaje;
        String nombre, apellido;
        double pp, ef, pa, ep, pesoPp, pesoEf, pesoPa, pesoEp;
        mensaje = "Ingrese su nombre";
        nombre = JOptionPane.showInputDialog(mensaje);
        mensaje = "Ingrese su Apellido";
        apellido = JOptionPane.showInputDialog(mensaje);

        pesoPa = 0.25;
        pesoPp = 0.25;
        pesoEp = 0.25;
        pesoEf = 0.25;
        pa = nota("Participacion");
        pp = nota("Practicas");
        ep = nota("Examen Parcial");
        ef = nota("Examen Final");

        Primaria primariObj = new Primaria(pesoEp, pesoEf, pesoPp, pesoPa, nombre, apellido, ep, ef, pp, pa);
        mensaje = primariObj.datos();
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static double nota(String preguntas) {

        double nota;
        String mensaje;
        boolean error = true;
        do {
            mensaje = JOptionPane.showInputDialog(preguntas);
            nota = Double.parseDouble(mensaje);
            if (nota > 0 && nota <= 20) {
                error = false;
            } else {
                error = true;
                mensaje = "La nota debe ser mayor a 0 y menor o igual 20";
                JOptionPane.showInputDialog(mensaje);
            }

        } while (error != false);

        return nota;

    }

}
