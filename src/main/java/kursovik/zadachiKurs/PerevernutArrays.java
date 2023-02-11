package kursovik.zadachiKurs;

import java.util.Arrays;

public class PerevernutArrays {
    public static int[] reversArrays(int[]arr) {
        int index = 0;
        int temp;
        for (int i = arr.length - 1; i >= arr.length/2; i--) {
            temp = arr[index];
            arr[index++] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] newArr = {0,1,4,3,4,5,7,7,81,19,12,45,67,8,9,1,2,5};

        System.out.println(Arrays.toString(reversArrays(newArr)));

    }
}
