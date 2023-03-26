/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab4.exercise6;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ionic
 */
public class ComissionEmployeeTest {
    @Test
    public void getPaymentAmountTest() {
        ComissionEmployee c;
        c=new ComissionEmployee("Pop","Iulia",20.1,25.3);
        assertEquals(45.4, c.getPaymentAmount(),0.001);
    }
}
