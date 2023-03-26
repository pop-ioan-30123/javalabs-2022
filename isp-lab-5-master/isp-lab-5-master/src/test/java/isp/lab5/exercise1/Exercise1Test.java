package isp.lab5.exercise1;

import isp.lab5.exercise1.Exercise1;
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
public class Exercise1Test {
    
    @Test
    public void testgetAmount() {
        Card c1 = new Card("12345", "0000");
        Account a1 = new Account("Mihai", 1000, c1);
        WithdrawMoney t;
        t = new WithdrawMoney(100, a1);
        assertEquals(100, t.getAmount());
    }
    
    @Test
    public void testgetCardId() {
        Card c1 = new Card("12345", "0000");
        assertEquals("12345", c1.getCardId());
    }
    
    @Test
    public void testgetPin() {
        Card c1 = new Card("12345", "0000");
        assertEquals("0000", c1.getPin());
    }
    
    @Test
    public void testgetOwner() {
        Card c1 = new Card("12345", "0000");
        Account a1 = new Account("Mihai", 1000, c1);
        assertEquals("Mihai", a1.getOwner());
    }
    
    @Test
    public void testgetBalance() {
        Card c1 = new Card("12345", "0000");
        Account a1 = new Account("Mihai", 1000, c1);
        assertEquals(1000, a1.getBalance());
    }
    
    @Test
    public void testgetCard() {
        Card c1 = new Card("12345", "0000");
        Account a1 = new Account("Mihai", 1000, c1);
        assertEquals(c1, a1.getCard());
    }
}
