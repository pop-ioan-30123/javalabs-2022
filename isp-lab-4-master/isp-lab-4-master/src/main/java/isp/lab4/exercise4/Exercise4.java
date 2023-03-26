package isp.lab4.exercise4;

public class Exercise4 {

    public static void main(String[] args) {
        //instantiati obiect
        TemperatureSensor[] t = new TemperatureSensor[3];
        t[0] = new TemperatureSensor(22, "Dormitor");
        t[1] = new TemperatureSensor(23, "Bucatarie");
        t[2] = new TemperatureSensor(25, "Baie");

        FireAlarm a;
        a = new FireAlarm(false);

        Controler c;
        c = new Controler(t, a);
        c.controlStep();
    }
}
