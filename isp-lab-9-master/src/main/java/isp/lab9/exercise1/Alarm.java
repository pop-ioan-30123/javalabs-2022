/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise1;

/**
 *
 * @author ionic
 */
public class Alarm extends Observable {
    void startAlarm() {
        System.out.println("Alarm has been started!");
        this.changeState("START");
    }
 
    void stopAlarm() {
        System.out.print("Alarm has been stopped!");
        this.changeState("STOP");
    }
}
