/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7.ClaseAbstracta;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-AQ660-308
 */
public class Main {

    public static void main(String[] args) {
        String colorDelCuadrado;
        double ladoDelCuadrado;
        String Opcion;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introdusca: 1 Cuadrado - 2 Rectangulo");
        Opcion = teclado.next();
        if (Opcion == "1") {
            System.out.print("Introduzca el color del cuadrado: ");
            colorDelCuadrado = teclado.nextLine();

            System.out.print("Introduzca el lado del cuadrado: ");
            ladoDelCuadrado = teclado.nextDouble();

            Cuadrado cua = new Cuadrado(ladoDelCuadrado, colorDelCuadrado);

            System.out.printf("El área del cuadrado %s es: %f", cua.getColor(), cua.CalcularArea());
        }

    }
}
