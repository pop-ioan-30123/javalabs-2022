/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab9.exercise4;

/**
 *
 * @author Admin
 */
public class Exercise4 {

    public static void main(String[] args) {

        // Assemble all the pieces of the MVC
        Model m = new Model(1234);

        Temperature t = new Temperature();
        t.readSensor();
        View v1 = new View();
        Controller controller = new Controller(m,v1);
        controller.initController();
        t.register(controller);
        

        Humidity h = new Humidity();
        h.readSensor();
        View v2 = new View();
        controller = new Controller(m,v2);
        controller.initController();
        h.register(controller);

        Pressure p = new Pressure();
        p.readSensor();
        View v3 = new View();
        controller = new Controller(m,v3);
        controller.initController();
        p.register(controller);

        System.out.println("It works!");
    }
    
    //Nu imi dau seama cum ar trebui sa preiau din cod acel return si sa il expun in casuta pe care am creat-o. Am de luat atat tipul senzorului, cat si valoarea pe care o afiseaza.
}
