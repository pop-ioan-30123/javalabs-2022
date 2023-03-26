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
public class SalariedEmployeeTest {
    @Test
    public void getPaymentAmountTest() {
        SalariedEmployee e;
        e=new SalariedEmployee("Petrica", "Muresan",25.1);
        assertEquals(25.1, e.getPaymentAmount(),0.1);
    }
}
