package ru.skeetstation.golowach.javacore.Lec2Recursion;

/**
 * Created by user on 19.03.2016.
 */
public class Recursion {
    public static void main(String[] args) {
        rec(1);
    }

    public static void rec(int arg) {
        System.out.print(" " + arg);
        if (arg < 7 ) {
            System.out.print(" before" + arg);
            rec(2*arg);
            System.out.print(" after" + arg);
        }
        System.out.print(" " + arg);
    }
}
