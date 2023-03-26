/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise4test;

import isp.lab3.exercise4.MyPoint;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ionic
 */
public class MyPointTest {

    @Test
    public void testDistance() {
        MyPoint a;
        a = new MyPoint(2, 3, 4);
        assertEquals(3, a.distance(2, 2, 2));
    }
}
