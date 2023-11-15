/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana08;

import java.util.Scanner;

/**
 *
 * @author chuamani
 */
public class Semana08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String mensaje;
        int op = 0;
        Scanner teclado = new Scanner(System.in);
        while (op != 9) {
            op = menu();

            switch (op) {
                case 1:
                    mensaje = "Cirugia";
                    Cirugia paciente_cirujia = new Cirugia(1);
                    paciente_cirujia.Imprimir();
                    break;
                case 2:
                    /*
                    COSTO POR USO DE EQUIPOS SOLO PARA NEFROLOGIA, COSTO
                    POR RESONANCIA MAGNETICA SOLO PARA GASTROENTEROLOGIA, DESCUENTO DEL 10% PARA TODOS LOS
                    PACIENTES DE CIRUGIA, DESCUENTO DEL 15% PARA PACIENTES DE NEFROLOGIA MENORES DE 12 AÑOS Y
                    DESCUENTO DEL 12% PARA PACIENTES DE GASTROENTEROLOGIA QUE SEAN MUJERES.
                    
                     */
                      Cirugia paciente_cirujia_neu = new Cirugia(2);
                     paciente_cirujia_neu.Imprimir();
                      
                    mensaje = "Nefrologia";
                    break;
                case 3:
                    mensaje = "Gastroenteorologia";
                    break;

                case 9:
                    mensaje = "Nos Vemos";
                    break;

                default:
                    mensaje = "Opcion no conteplada";
            }

        }
    }

    public static int menu() {
        int opcion;
        String mensaje;
        mensaje = "Menu de Opciones";
        Scanner teclado = new Scanner(System.in);
        mensaje += "\n1|Cirugia";
        mensaje += "\n2|Neourologia";
        mensaje += "\n3|Gastroenteorologia";
        mensaje += "\n1|Salir";
        System.out.println(mensaje);
        opcion = teclado.nextInt();

        return opcion;
    }

}
