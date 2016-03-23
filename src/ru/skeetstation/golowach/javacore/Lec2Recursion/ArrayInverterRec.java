package ru.skeetstation.golowach.javacore.Lec2Recursion;

/**
 * Created by user on 19.03.2016.
 */
public class ArrayInverterRec {
    public static void invertRec(int[] arr, int k) {
        if (k < arr.length / 2) {
            invertRec(arr, k + 1);
        }
        int tmp = arr[k];
        arr[k] = arr[arr.length - 1 - k];
        arr[arr.length - 1 - k] = tmp;

//        if (k < arr.length / 2) {
//            int tmp = arr[k];
//            arr[k] = arr[arr.length - k - 1];
//            arr[arr.length - k - 1] = tmp;

//            invertRec(arr, k + 1);
//        }
    }
}
