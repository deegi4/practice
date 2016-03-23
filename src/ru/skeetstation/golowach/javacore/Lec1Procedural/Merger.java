package ru.skeetstation.golowach.javacore.Lec1Procedural;

import java.util.Arrays;


public class Merger {
    public static int[] merge(int[] a, int[] b) {//wrong!
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        while (aIndex + bIndex != result.length) {
//            if(a[aIndex] < b[bIndex]) {
//               System.arraycopy(a, aIndex, result, aIndex++ + bIndex, 1);
//            }
//            System.arraycopy(b, bIndex, result, aIndex + bIndex++, 1);
            //fixBegin
            if (aIndex == a.length) {
                System.arraycopy(b, bIndex, result, aIndex + bIndex, result.length - aIndex - bIndex);
                return result;
            }
            if (bIndex == b.length) {
                System.arraycopy(a, aIndex, result, aIndex + bIndex, result.length - aIndex - bIndex);
                return result;
            }
            //fixEnd
            if(a[aIndex] < b[bIndex]) {
                result[aIndex + bIndex] = a[aIndex++];
            } else {
                result[aIndex + bIndex] = b[bIndex++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] arr2 = {0, 5, 7, 23, 25, 42, 48, 69};
        int[] arr3 = merge(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
