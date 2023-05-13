/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana7.ClaseAbstracta;

/**
 *
 * @author LAB-USR-AQ660-308
 */
public abstract class Figura {

    String color;

    public abstract double CalcularArea();

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
