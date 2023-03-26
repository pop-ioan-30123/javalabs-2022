/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise5;

/**
 *
 * @author ionic
 */
public class Controler{

    private TemperatureSensor[] temperatureSensor;
    private FireAlarm fireSensor;

    public Controler() {
    }

    public void controlStep() {
        if (temperatureSensor[0].getValue() > 50 || temperatureSensor[1].getValue() > 50 || temperatureSensor[2].getValue() > 50) {
            this.fireSensor.setActive();
        }
        if (this.fireSensor.isActive() == true) {
            System.out.println("Fire alarm started.");
        } else {
            System.out.println("Fire alarm not started.");
        }

    }
}
