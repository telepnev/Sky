package arrays;

import java.util.Arrays;

public class ArraysDz_01 {
    public static void main(String[] args) {
//        taskArrays_01_1_2();
//        taskArrays_01_3();
        taskArrays_01_4();

    }

    public static void taskArrays_01_1_2() {
        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        double[] arrayDouble = {1.57, 7.654, 9.986};
        String[] arrayString = {"one", "tree", "null" };
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i]);
            if (i != arrayInt.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();

        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print(arrayDouble[i]);
            if (i != arrayDouble.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();

        for (int i = 0; i < arrayString.length; i++) {
            System.out.print(arrayString[i]);
            if (i != arrayString.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
    }

    public static void taskArrays_01_3() {
        int[] arrayInt = {1, 2, 3};
        double[] arrayDouble = {1.57, 7.654, 9.986};
        String[] arrayString = {"one", "tree", "null" };

        for (int i = arrayInt.length - 1; i >= 0; i--) {
            System.out.print(arrayInt[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = arrayDouble.length - 1; i >= 0; i--) {
            System.out.print(arrayDouble[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();
        for (int i = arrayString.length - 1; i >= 0; i--) {
            System.out.print(arrayString[i]);
            if (i != 0) {
                System.out.print(" , ");
            }
        }
        System.out.println();

    }


    public static void taskArrays_01_4() {
        int[] arrayInt = {1, 2, 3, 6, 0, 23, 12, 5, 4, 33, 10, 11, 17};
        for (int i = 0; i < arrayInt.length; i++) {
            int num = arrayInt[i];
            if (num % 2 != 0) {
                arrayInt[i] += 1;
//                System.out.print(arrayInt[i] + 1 + " ");
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }

}

