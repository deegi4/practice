package ru.skeetstation.golowach.javacore.Lec2Recursion.Permutator;

import java.util.Arrays;

/**
 * Created by user on 24.03.2016.
 */
public class Permutator {
    public static void permute(int[] arr, int size) {
        if(size < 2){
            swap(arr, 0, 1);
            System.out.println(Arrays.toString(arr));
        } else {
            for (int k = 0; k < size; k++) {
                swap(arr, k, size - 1);
                permute(arr, size - 1);
            }
        }
    }

    private static void swap(int[] arr, int index0, int index1){
        int tmp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = tmp;
    }

}
