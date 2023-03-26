package isp.lab3.exercise1test;

import isp.lab3.exercise1.Tree;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TreeTest {
    @Test
    public void testgrow() {
        // TEST 1
        Tree t;
        t=new Tree();
        t.grow(3);
        assertEquals(18, t.height);

        // TEST 2
        Tree t1;
        t1=new Tree();
        t1.grow(-1);
        assertEquals(15, t1.height);
    }
    
    @Test
    public void testtoString() {
        // TEST 1
        Tree t;
        t=new Tree();
        String test;
        test=t.toString();
        assertEquals("height "+15 ,test);
    }
}
