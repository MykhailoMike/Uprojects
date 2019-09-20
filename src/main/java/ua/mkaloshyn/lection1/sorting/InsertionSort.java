package ua.mkaloshyn.lection1.sorting;

import java.util.Arrays;

public class InsertionSort implements Sorting {

    public int[] sort(int[] arr) {

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && (temp < arr[j])) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        return arr;
    }
}
