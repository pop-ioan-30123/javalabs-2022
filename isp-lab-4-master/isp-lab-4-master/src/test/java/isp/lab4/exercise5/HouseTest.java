/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise5;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ionic
 */
public class HouseTest {
    
    @Test
    public void testgetValue() {
        TemperatureSensor[] t = new TemperatureSensor[3];
        t[0] = new TemperatureSensor(22, "Dormitor");
        t[1] = new TemperatureSensor(23, "Bucatarie");
        t[2] = new TemperatureSensor(25, "Baie");

        FireAlarm a;
        a = new FireAlarm(false);
        
        Controler c;
        c = new Controler();
        c.controlStep();
         
        House h;
        h=new House(c);
        
        assertEquals(c, h.getControler());
    }
}
