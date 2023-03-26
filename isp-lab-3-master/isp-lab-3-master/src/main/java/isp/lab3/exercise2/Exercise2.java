package isp.lab3.exercise2;

public class Exercise2 {

    public static void main(String[] args) {
        
        Rectangle t, v;
        t = new Rectangle();
        v = new Rectangle(4, 5, "blue");

        System.out.println("Lungimea primului dreptunghi este:" + t.getLength());
        System.out.println("Latimea primului dreptunghi este:" + t.getWidth());
        System.out.println("Culoarea primului dreptunghi este:" + t.getColor());
        System.out.println("Perimetrul primului dreptunghi este:" + t.getPerimeter());
        System.out.println("Aria primului dreptunghi este:" + t.getArea() + '\n');

        System.out.println("Lungimea celui de al 2-lea dreptunghi este:" + v.getLength());
        System.out.println("Latimea celui de al 2-lea dreptunghi este:" + v.getWidth());
        System.out.println("Culoarea celui de al 2-lea dreptunghi este:" + v.getColor());
        System.out.println("Perimetrul celui de al 2-lea dreptunghi este:" + v.getPerimeter());
        System.out.println("Aria celui de al 2-lea dreptunghi este:" + v.getArea());

    }
}
