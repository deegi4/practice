package ru.skeetstation.golowach.javacore.Lec1Procedural;


import java.util.Arrays;

public class Inserter {//19 01...

    public static void main(String[] args) {
        int size = 5;
        int[] array = {20, 30, 40, 50, 60, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(array));
        int[] insert = {15, 95, 30};

        for (int newElement : insert) {
            int newPosition = Arrays.binarySearch(array, 0, size, newElement);
            if ( newPosition < 0) {
                newPosition = -newPosition - 1;
            }
            System.arraycopy(array, newPosition, array, newPosition + 1, size - newPosition);
            array[newPosition] = newElement;
            System.out.println(Arrays.toString(array));
            size++;
        }
    }

}
