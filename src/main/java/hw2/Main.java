package hw2;

import java.util.concurrent.ThreadLocalRandom;

import static hw2.Array.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[ThreadLocalRandom.current().nextInt(2, 11)];

        System.out.print("Текущий массив: ");
        fillArray(array);
        printArray(array);

        System.out.println();
        System.out.println("Количество четных элементов: " + countEvens(array));

        System.out.println();
        System.out.println("Разница между самым большим и самым маленьким элементом массива: " +
                MinAndMaxDeference(array));

        System.out.println();
        if (findNullElements(array)) System.out.println("В массиве есть два соседних элемента со значением 0");
        else System.out.println("В массиве нет двух соседних элементов со значением 0");
    }
}
