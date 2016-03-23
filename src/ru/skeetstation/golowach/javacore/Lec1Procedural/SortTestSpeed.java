package ru.skeetstation.golowach.javacore.Lec1Procedural;
import java.util.Random;

public class SortTestSpeed {
    public static void main (String[] args) {
        int[] array = new int[128*1024];
        Random rnd = new Random();
        for (int k = 0; k < array.length; k++) {
            array[k] = rnd.nextInt();
        }

        long t0 = System.nanoTime();
//        SelectionSorter.sort(array);
        InsertionSorter.sort(array);
        System.out.println("Time:" + (System.nanoTime() - t0)/ 1000000);
    }
}
