/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7.ClaseAbstracta;

/**
 *
 * @author LAB-USR-AQ660-308
 */
public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado, String color) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double CalcularArea() {
      
        return lado * lado;
    
    }
    
    
}
