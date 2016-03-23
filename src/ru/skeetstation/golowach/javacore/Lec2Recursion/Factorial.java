package ru.skeetstation.golowach.javacore.Lec2Recursion;


public class Factorial {
    public static int fact(int arg) {
        if (arg == 1) return 1;
        return arg * fact(arg - 1);
    }

    public static void main(String[] args) {
        int a = Factorial.fact(6);
        System.out.println(a);
    }
}
