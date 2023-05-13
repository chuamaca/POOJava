/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7.ClaseAbstracta;

/**
 *
 * @author LAB-USR-AQ660-308
 */
public class Triangulo extends Figura{
    private double base, altura;

    public Triangulo(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double CalcularArea() {
       return (base * altura)/ 2;
    }
    
    
}
