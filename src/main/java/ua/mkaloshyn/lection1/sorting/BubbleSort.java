package ua.mkaloshyn.lection1.sorting;

import java.util.Arrays;

public class BubbleSort implements Sorting {

    public int[] sort(int[] arr) {

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

        return arr;
    }
}
