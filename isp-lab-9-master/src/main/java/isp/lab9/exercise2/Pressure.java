/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise2;

/**
 *
 * @author ionic
 */
public class Pressure extends Observable {
    void readSensor() {
        int number=(int) ((Math.random() * (10 - 1)) + 1); //between 1 and 10
        System.out.println("The pressure is: "+number);
        this.changeState("ON");
        this.setValue(number);
    }
}
