/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise4;

/**
 *
 * @author ionic
 */
public class Humidity extends Observable{
    void readSensor() {
        int number=(int) ((Math.random() * (500 - 50)) + 50); //between 50 and 500
        System.out.println("The humidity is: "+number);
        this.changeState("ON");
        this.setValue(number);
        this.setType("Humidity");
    }
}
