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
public class EmployeeTest {
    @Test
    public void getPaymentAmountTest() {
        Employee e;
        e=new Employee("Sabou","Mihai");
        assertEquals(0.0, e.getPaymentAmount(),0.1);
    }
}
