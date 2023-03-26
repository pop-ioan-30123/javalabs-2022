package isp.lab3.exercise1;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Tree T1;
        T1 = new Tree();
        int meters;
        Scanner scanner = new Scanner(System.in);
        meters = scanner.nextInt();
        T1.grow(meters);
        System.out.println("Inaltimea copacului este: " + T1.height);
        System.out.println("Inaltimea copacului este: " + T1.toString());
    }

}
