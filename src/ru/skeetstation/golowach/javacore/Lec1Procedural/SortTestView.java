package ru.skeetstation.golowach.javacore.Lec1Procedural;
import java.util.Arrays;

public class SortTestView {
    public static void main(String[] args) {
        int [] arr = {1, 5, 8, 3, 9, 7, 4, 6, 2};
        System.out.println(Arrays.toString(arr));
        InsertionSorter.isort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
