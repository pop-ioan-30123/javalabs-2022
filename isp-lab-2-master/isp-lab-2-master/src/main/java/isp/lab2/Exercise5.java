package isp.lab2;

public class Exercise5 {

    /**
     * This method should generate an array that have 20 random nubers between
     * -1000 and 1000
     *
     * @return the random numbers
     */
    public static int[] generateRandomNumbers() {
        int min = -1000;
        int max = 1000;
        int[] v;
        v = new int[20];
        for (int i = 0; i < 20; i++) {
            v[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }
        return v;
    }

    /**
     * This method should sort the given random numbers
     *
     * @param randomNumbers numbers generated random
     * @return sorted int array
     */
    public static int[] getSortedNumbers(int[] randomNumbers) {
        for (int i = 0; i < 20; i++) {
            for (int j = i+1; j < 20; j++) {
                if (randomNumbers[j] < randomNumbers[i]) {
                    int aux;
                    aux = randomNumbers[i];
                    randomNumbers[i] = randomNumbers[j];
                    randomNumbers[j] = aux;
                }
            }
        }
        return randomNumbers;
    }

    public static void main(String[] args) {
        // display the random generated numbers
        int[] randomNumbers = generateRandomNumbers();
        System.out.println("The random generated numbers are:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + ", ");
        }
        int[] sortedNumbers = getSortedNumbers(randomNumbers);
        // display the sorted numbers
        System.out.println("\nThe sorted numbers are:");
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + ", ");
        }
    }
}
