/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise2;

/**
 *
 * @author ionic
 */
public class Rectangle {

    private final int length;
    private final int width;
    private final String color;

    public Rectangle() {
        this.length = 2;
        this.width = 1;
        this.color = "red";
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        this.color = null;
    }

    public Rectangle(int length, int width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }
    
    public int getLength()
    {
        return this.length;
    }
    public int getWidth()
    {
        return this.width;
    }
    public String getColor()
    {
        return this.color;
    }
    public int getPerimeter()
    {
        return this.length*2+this.width*2;
    }
    public int getArea()
    {
        return this.length*this.width;
    }

}
