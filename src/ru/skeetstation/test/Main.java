package ru.skeetstation.test;

public class Main {

        public final void f(){
                g();
        System.out.println("Main.f()");

        }
        public void g(){
        System.out.println("Main.g()");
    }
        public static void main(String[] args) {
                Main mo = new Sun();
                mo.f();
                mo.g();
             Sun so = new Sun();
                so.f();


}}
