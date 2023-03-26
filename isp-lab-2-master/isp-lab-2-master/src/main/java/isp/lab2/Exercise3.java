package isp.lab2;

import java.util.Scanner;

public class Exercise3 {

    /**
     * This method should verify if a number is prime
     *
     * @param number the number to check
     * @return true if number is prime and false otherwise
     */
    public static boolean isPrimeNumber(final int number) {
        int copie;
        copie = number;
        if (copie == 0 || copie == 1) {
            return false;
        }
        for (int d = 2; d <= copie / 2; d++) {
            if (copie % d == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method should calculate the sum of digits of a given number
     *
     * @param number the number used to calculate the sum of digits
     * @return an int representing the sum of digits of the given number
     */
    public static int calculateSumOfDigits(int number) {
        int copie;
        int suma;
        suma = 0;
        copie = number;
        while (copie != 0) {
            suma = copie % 10 + suma;
            copie /= 10;
        }
        return suma;
    }

    /**
     * This method should extract the prime numbers from a given interval using
     * isPrimeNumber(final int number) method defined above NOTE* a < b
     *
     * @param a the left end of the interval
     * @param b the right end of the interval
     * @return and int array consisting of the prime numbers from the given
     * interval
     */
    public static int[] getPrimeNumbersFromInterval(int a, int b) {
        // TODO: Use isPrimeNumber(final int number)
        int[] v = new int[200];
        int j;
        j = 0;
        for (int i = a; i <= b; i++) {
            if (isPrimeNumber(i) == true) {
                v[j] = i;
                j++;
            }
        }
        int[] w = new int[j];
        for (int i = 0; i < j; i++) {
            w[i] = v[i];
        }
        return w;
    }

    /**
     * This method should calculate the geometric mean of the given prime
     * numbers
     *
     * @param primeNumbers the numbers used to calculate the geometric mean
     * @return the geometric mean of the given numbers
     */
    public static double calculateGeometricMean(int[] primeNumbers) {
        long p = 1;
        double gmean;

        for (int i = 0; i < primeNumbers.length; i++) {
            p *= primeNumbers[i];
        }
        double putere = (double) 1 / primeNumbers.length;

        gmean = Math.pow(p, putere);
        return gmean;
    }

    /**
     * This method should calculate the number of prime numbers which have the
     * sum of digits an even number NOTE* use calculateSumOfDigits(int number)
     *
     * @param primeNumbers prime numbers used for calculation
     * @return the numbers which respect the given condition
     */
    public static int numberOfPNWithEvenSumOfDigits(int[] primeNumbers) {
        // TODO: Use calculateSumOfDigits(int number)
        int contor;
        contor = 0;
        for (int i : primeNumbers) {
            if (calculateSumOfDigits(i) % 2 == 0 && calculateSumOfDigits(i) != 0) {
                contor++;
            }
        }
        return contor;
    }

    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti valoarea lui a: ");
        a = scanner.nextInt();

        System.out.println("Introduceti valoarea lui b: ");
        b = scanner.nextInt();

        if (a < b) {
            if (a >= 0 && b <= 200) {
                System.out.println("The geometric mean is: " + calculateGeometricMean(getPrimeNumbersFromInterval(a, b)));
                System.out.println("The number of prime numbers which have the sum of digits an even number is: " + numberOfPNWithEvenSumOfDigits(getPrimeNumbersFromInterval(a, b)));
            } else {
                System.out.println("Nu ati introdus valorile corecte");
            }

        }
    }
}
