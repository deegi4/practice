package ru.skeetstation.golowach.javacore.Lec1Procedural;


public class SelectionSorter {

    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for(int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
    }

    public static void isort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int min = barrier;
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[min] > arr[index]) {
                    min = index;
                }
            }
            int tmp = arr[barrier];
            arr[barrier] = arr[min];
            arr[min] = tmp;
        }
    }
}
