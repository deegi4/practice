package ru.skeetstation.golowach.javacore.Lec1Procedural;


public class ArrayInverter {
    public static void invert(int [] arr) {
        for (int k = arr.length / 2 - 1; k >= 0 ; k--) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - 1 - k];
            arr[arr.length - 1 - k] = tmp;
        }
//        for (int k = 0; k < arr.length / 2; k++) {
//            int tmp = arr[k];
//            arr[k] = arr[arr.length - k - 1];
//            arr[arr.length - 1 - k] = tmp;
//
//        }
    }
}
