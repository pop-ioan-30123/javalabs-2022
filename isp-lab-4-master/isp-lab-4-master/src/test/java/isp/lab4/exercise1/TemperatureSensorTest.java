package isp.lab4.exercise1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TemperatureSensorTest {

    //implement minimal tests
   @Test
    public void testgetValue() {
        TemperatureSensor t;
        t=new TemperatureSensor(22,"Dormitor");
        assertEquals(22, t.getValue());
    }

    @Test
    public void testgetLocation() {
        TemperatureSensor t;
        t=new TemperatureSensor(22,"Dormitor");
        assertEquals("Dormitor", t.getLocation());
    }

    @Test
    public void testtoString() {
        TemperatureSensor t;
        t=new TemperatureSensor(22,"Dormitor");
        assertEquals("Dormitor "+22, t.toString());
    }
}
