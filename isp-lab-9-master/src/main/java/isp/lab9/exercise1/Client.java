/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise1;

/**
 *
 * @author ionic
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        Alarm fireAlarm = new Alarm();
        AlarmMonitor monitor = new AlarmMonitor();
        AlarmController controller = new AlarmController();
        fireAlarm.register(monitor);
        fireAlarm.register(controller);

        fireAlarm.startAlarm();
        Thread.sleep(500);
        fireAlarm.stopAlarm();
        System.out.println("It works!");
    }
}
