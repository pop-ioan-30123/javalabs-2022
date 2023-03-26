/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise2;

/**
 *
 * @author ionic
 */
public class Controller implements Observer {

    @Override
    public void update(Object event) {
        System.out.println("The sensor was setted.");
        System.out.println("Received event: Event class:" + event.getClass() + ":" + event.toString());
    }
}
