package isp.lab4.exercise3;

public class Exercise3 {
    
     public static void main(String[] args) {
        //instantiati obiect
        TemperatureSensor t;
        t=new TemperatureSensor(22,"Dormitor");
        
        FireAlarm a;
        a = new FireAlarm(false);
        
        Controler c;
        c=new Controler(t,a);
        c.controlStep();
     }
}
