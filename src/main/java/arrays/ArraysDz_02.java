package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysDz_02 {
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void taskArrays_02_1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int res : arr) {
            sum += res;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void taskArrays_02_2() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(generateRandomArray()));
        int min = arr[0];
        int max = min;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void taskArrays_02_3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int res : arr) {
            sum += res;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / arr.length + " рублей");
    }

    public static void taskArrays_02_4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i - 1]);
        }
    }
}
