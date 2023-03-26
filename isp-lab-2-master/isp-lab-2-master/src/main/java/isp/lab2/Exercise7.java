package isp.lab2;

import java.util.Scanner;

public class Exercise7 {

    /**
     * This method should generate a random number which represent the position
     * in the given arrays,so the random should be between 0 and 7
     *
     * @return the generated random
     */
    public static int generateARandom() {
        int min = 0;
        int max = 7;
        int number = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return number;
    }

    public static int nr_vector(int[] vector, int times) {
        return vector[times];
    }

    public static void main(String[] args) {
        int[] ucl = new int[]{1, 2, 3, 4, 5, 6, 7, 13};
        int[] answers = new int[]{10, 4, 2, 1, 2, 1, 1, 1};
        int times = generateARandom();
        System.out.println("Ghiciti numarul la care ma gandesc:");
        Scanner scanner = new Scanner(System.in);
        int a;
        a = -1;
        int numar;
        int lasttry;
        lasttry = -2;
        int contor;
        contor = 0;
        numar = ucl[times];
        while (a != numar) {
            a = scanner.nextInt();
            if (a < numar) {
                System.out.println("Numarul este mai mare!");
                if (lasttry != a) {
                    contor++;
                }
            } else if (a > numar) {
                System.out.println("Numarul este mai mic!");
                if (lasttry != a) {
                    contor++;
                }
            } else if (a == numar) {
                System.out.println("Ati ghicit numarul din a " + contor + "-a incercare!");
            }
        }

    }
}
