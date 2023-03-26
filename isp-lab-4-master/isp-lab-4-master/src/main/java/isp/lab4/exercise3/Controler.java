package isp.lab4.exercise3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ionic
 */
public class Controler {

    private TemperatureSensor temperatureSensor;
    private FireAlarm fireSensor;

    public Controler(TemperatureSensor temperatureSensor, FireAlarm fireAlarm) {
        this.temperatureSensor = temperatureSensor;
        this.fireSensor = fireAlarm;
    }

    public void controlStep() {
        if (temperatureSensor.getValue() > 50) {
            this.fireSensor.setActive();
        }
        if (this.fireSensor.isActive() == true) {
            System.out.println("Fire alarm started.");
        } else {
            System.out.println("Fire alarm not started.");
        }

    }
}
