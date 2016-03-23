package ru.skeetstation.golowach.javacore.Lec1Procedural;

import java.util.Arrays;


public class MatrixUtils {
    public static int[][] mul(int[][] a, int[][] b) {
        if (a[0].length != b.length) return a;//умножение матриц невозможно
        int[][] result = new int[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] m1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] m2 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] m3 = mul(m1, m2);
        System.out.println(Arrays.deepToString(m1));
        System.out.println(Arrays.deepToString(m2));
        System.out.println(Arrays.deepToString(m3));
    }
}
