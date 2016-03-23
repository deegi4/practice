package ru.skeetstation.golowach.javacore.Lec1Procedural;


import java.util.Arrays;

public class InsertionSorter {

    public static void sort(int[] arr) {
        for (int barrier = 1; barrier < arr.length; barrier++) {
            int newElement = arr[barrier];
            int location = barrier - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
        }
    public static void  isort(int[] arr) {
        for (int barrier = 1; barrier < arr.length; barrier++) {
            int  tmp = arr[barrier];
            int indextmp = Math.abs(-Arrays.binarySearch(arr, 0, barrier, tmp - 1));
            System.arraycopy(arr, indextmp, arr, indextmp + 1, barrier - indextmp );
            arr[indextmp] = tmp;

        }
    }
    public static void binSort(int[] arr) {
        for (int barrier = 1; barrier < arr.length - 1; barrier++) {
            int newElement = arr[barrier];
            int location = barrier;
            int low = 0;
            int high = barrier - 1;
            while (low <= high ) {
                int mid = (low + high) >>> 1;
                long midVal = arr[mid];

                if (midVal < newElement) {
                    low = mid + 1;
                } else if (midVal > newElement) {
                    high = mid - 1;
                } else location = mid;
            }
            if(location == barrier) location = -(low + 1);
            arr[-location + 1] = newElement;
        }
    }
}
