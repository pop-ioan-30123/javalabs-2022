package isp.lab4.exercise5;


import isp.lab4.exercise2.FireAlarm;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ionic
 */
public class FireAlarmTest {

    @Test
    public void testgetValue() {
        FireAlarm t;
        t = new FireAlarm(true);
        assertEquals(true, t.isActive());
    }

    @Test
    public void testtoString() {
        FireAlarm t;
        t = new FireAlarm(true);
        assertEquals("Stare alarma: " + true, t.toString());
    }
}
