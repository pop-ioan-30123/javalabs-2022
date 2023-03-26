package isp.lab3.exercise4;

public class Exercise4 {

    public static void main(String[] args) {

        MyPoint a, b;
        a = new MyPoint();
        b = new MyPoint(2, 3, 4);

        int distanta;
        distanta = a.distance(b);
        System.out.println("Distanta dintre cele 2 puncte estE: " + distanta);
    }
}
