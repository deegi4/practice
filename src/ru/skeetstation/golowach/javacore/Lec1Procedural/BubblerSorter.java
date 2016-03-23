package ru.skeetstation.golowach.javacore.Lec1Procedural;


public class BubblerSorter {


    public static void sort(int[] data) {
        for (int barrier = data.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if(compare(data[index], data[index + 1]) > 0) {
                    int tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }
        }
    }
    public static void isort(int[] data) {
        for (int barrier = 0; barrier < data.length - 1; barrier++) {
            for (int index = data.length - 1; index > barrier; index--) {
                if( compare(data[index], data[index - 1]) < 0) {
                    int tmp = data[index];
                    data[index] = data[index - 1];
                    data[index - 1] = tmp;
                }
            }
        }
    }
    public static int compare(int a, int b) {
        return a - b;
    }
}
