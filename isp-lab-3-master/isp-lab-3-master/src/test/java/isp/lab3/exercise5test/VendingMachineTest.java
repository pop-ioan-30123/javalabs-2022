/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab3.exercise5test;

import isp.lab3.exercise5.VendingMachine;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ionic
 */
public class VendingMachineTest {
    @Test
    public void testdisplayProducts() {
    
        String[] v = {"Cola", "Fanta", "Sprite", "7Up", "Nestea", "Oreo", "Milka", "7Days", "Dare", "Gusto"};
        int[] codes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        VendingMachine t;
        t=new VendingMachine();
        Assert.assertArrayEquals(v, t.products);
        Assert.assertArrayEquals(codes, t.id);
    }
    
    public void testinsertCoins() {
    
        VendingMachine t;
        t=new VendingMachine();
        assertEquals(0, t.credit);
        t.insertCoins(3);
        assertEquals(3, t.credit);
    }
    
    public void testdselectProduct() {
    
        int id=8;
        VendingMachine t;
        t=new VendingMachine();
        assertEquals("7Days", t.id[id]);
    }
}
