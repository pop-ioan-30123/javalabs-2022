package isp.lab2;

import java.util.Scanner;

public class Exercise6 {

    /**
     * This method should generate the required vector non-recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateVector(int n) {
        int[] v = new int[n];
        v[0] = 1;
        v[1] = 2;
        for (int i = 2; i < n; i++) {
            v[i] = v[i - 2] * v[i - 1];
        }
        return v;
    }

    private static int rezolvare(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        return rezolvare(n - 2) * rezolvare(n - 1);
    }

    /**
     * This method should generate the required vector recursively
     *
     * @param n the length of teh generated vector
     * @return the generated vector
     */
    public static int[] generateRandomVectorRecursively(int n) {
        int v[] = new int[n];
        while (n != 0) {
            v[n - 1] = rezolvare(n - 1);
            n--;
        }
        return v;
    }

    public static void main(String[] args) {
        // TODO: print the vectors
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul de termeni: "); int n=scanner.nextInt();
        System.out.println("Normal: ");
        for(int i=0;i<n;i++)
        System.out.println(generateVector(n)[i]);
        System.out.println("Recursiv: ");
        for(int i=0;i<n;i++)
        System.out.println(generateRandomVectorRecursively(n)[i]);
    }
}
