package isp.lab4.exercise1;

//import isp.lab4.exercise0.CarAlarm; //NU ASA

public class Exercise1 {

    public static void main(String[] args) {
        //instantiati obiect
        TemperatureSensor t;
        t=new TemperatureSensor(22,"Dormitor");
        System.out.println("Locatie: "+t.getLocation());
        System.out.println("Temperatura: "+t.getValue());
        System.out.println(t.toString());
    }
}
