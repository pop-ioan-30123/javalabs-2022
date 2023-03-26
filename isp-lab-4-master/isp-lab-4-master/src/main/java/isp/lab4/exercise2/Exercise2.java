package isp.lab4.exercise2;

public class Exercise2 {
     public static void main(String[] args) {
        FireAlarm t;
        t = new FireAlarm(false);
        System.out.println(t.toString());
        t.setActive();
        System.out.println(t.toString());
     }
}
