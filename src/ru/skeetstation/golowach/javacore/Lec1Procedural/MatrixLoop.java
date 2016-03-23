package ru.skeetstation.golowach.javacore.Lec1Procedural;

public class MatrixLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print((i + j < 5)? " - " : " + ");
            }
            System.out.println();
        }
    }
}
