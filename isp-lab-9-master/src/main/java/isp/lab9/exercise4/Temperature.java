/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise4;

/**
 *
 * @author ionic
 */
public class Temperature extends Observable {
    void readSensor() {
        int number=(int) ((Math.random() * (30 + 20)) - 20); //between -20 and 30
        System.out.println("The temperature is: "+number);
        this.changeState("ON");
        this.setValue(number);
        this.setType("Temperature");
    }
}
