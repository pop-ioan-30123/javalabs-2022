/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab9.exercise2;

/**
 *
 * @author Admin
 */
public class Exercise2 {
     public static void main(String[] args) {
        Temperature t = new Temperature();
        t.readSensor();
        Controller controller = new Controller();
        t.register(controller);

        Humidity h = new Humidity();
        h.readSensor();
        h.register(controller);
        
        Pressure p = new Pressure();
        p.readSensor();
        p.register(controller);
        
        System.out.println("It works!");
    }
}
