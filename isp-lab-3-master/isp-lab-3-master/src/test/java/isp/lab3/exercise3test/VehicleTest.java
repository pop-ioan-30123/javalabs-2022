/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise3test;

import isp.lab3.exercise3.Vehicle;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ionic
 */
public class VehicleTest {
    @Test
    public void testtoString() {
        Vehicle t;
        t=new Vehicle("Dacia","Logan",150,'B');
        String test;
        test=t.toString();
        assertEquals("Dacia (Logan) speed 150 fuel type B" ,test);
    }
}
