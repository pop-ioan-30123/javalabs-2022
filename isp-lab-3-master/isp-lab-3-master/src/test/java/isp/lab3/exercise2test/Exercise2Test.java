/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise2test;

import isp.lab3.exercise2.Rectangle;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ionic
 */
public class Exercise2Test {
    @Test
    public void testgetlength() {
        Rectangle t;
        t=new Rectangle();
        assertEquals(2, t.getLength());
    }
    
    @Test
    public void testgetwidth() {
        Rectangle t;
        t=new Rectangle();
        assertEquals(1, t.getWidth());
    }
    
     @Test
    public void testgetcolor() {
        Rectangle t;
        t=new Rectangle();
        assertEquals("red", t.getColor());
    }
    
    @Test
    public void testgetPerimeter() {
        Rectangle t;
        t=new Rectangle();
        assertEquals(6, t.getPerimeter());
    }
     
    @Test
    public void testgetarea() {
        Rectangle t;
        t=new Rectangle();
        assertEquals(2, t.getArea());
    }
}
