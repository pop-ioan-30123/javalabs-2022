/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise1;

/**
 *
 * @author ionic
 */
public class AlarmController implements Observer {

    @Override
    public void update(Object event) {
        System.out.println("Sending SMS message to owner.");
    }
}
