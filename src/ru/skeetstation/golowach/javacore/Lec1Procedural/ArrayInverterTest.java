package ru.skeetstation.golowach.javacore.Lec1Procedural;

import java.util.Arrays;


public class ArrayInverterTest {
    public static void main(String[] args) {
        testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});
    }
    public static void testInvert(int [] arr) {
        System.out.print(Arrays.toString(arr) + " -> ");
        ArrayInverter.invert(arr);
        System.out.println(Arrays.toString(arr));
    }
}
