package hw2;

import java.util.concurrent.ThreadLocalRandom;

public class Array {
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(0, 10);
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print(array[array.length - 1]);
        System.out.println("]");
    }

    public static int countEvens(int[] array) {
        int counter = 0;

        for (int i : array) {
            if (i % 2 == 0)
                counter++;
        }

        return counter;
    }

    public static int MinAndMaxDeference (int[] array) {
        int deference;
        int max = array[0];
        int min = max;

        for (int i : array) {
            if (i > max)
                max = i;
            else if (i < min)
                min = i;

        }

        deference = max - min;

        return deference;
    }

    public static boolean findNullElements(int[] array) {
        boolean check = false;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                check = true;
                break;
            }
        }

        return check;
    }
}
