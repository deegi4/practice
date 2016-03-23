package ru.skeetstation.golowach.javacore.Lec2Recursion;


public class FibonacciSequence {
    public static void main(String[] args) {
        fibRecPrint(5);
        System.out.println();
        fibRecFink(5);
        System.out.println();

        int n = 15;// n < 47 не попадает в int
        for (int k = 0; k < n; k++) {
            System.out.println("fib(" + k + ") = " + fib(k));
        }


    }
    public static int fibRec(int index){
        if (index == 0) return 1;
        if (index == 1) return 1;
        return fibRec(index - 2) + fibRec(index - 1);

    }

    public static int fibRecPrint(int index) {
        System.out.print(index + " "); // ! 5 3 4 2 2 3 2 / ! 5 3 2 4 2 3 2 / ! 5 3 1 2 1 4 2 1 3 1 2 1 / => 5 3 1 2 0 1 4 2 0 1 3 1 2 0 1
        int result =  index < 2 ?  1 : fibRecPrint(index - 2) + fibRecPrint(index - 1); //в одну строчку
        System.out.print("*" + index + "* ");
        return result; // / 1 0 1 2 3 0 1 2 1 0 1 2 3 4 5
    }
    public static int fibRecPrintAfter(int index) {
//        System.out.print(index + " ");
        int result =  index < 2 ?  1 : fibRecPrint(index - 2) + fibRecPrint(index - 1); //в одну строчку
        System.out.print("*" + index + "* ");
        return result; // / 1 0 1 2 3 0 1 2 1 0 1 2 3 4 5
    }
    public static int fibRecFink(int index) {
        return index < 2 ?  1 + fink(index) : fibRecFink(index - 2) + fink(index) + fibRecFink(index - 1);
    }

    public static  int fink(int index) {
        System.out.print(index + " ");
        return  0;
    }

    static int fib(int index) {
        if (index == 0) return 1;
        if (index == 1) return 1;
        int[] result = new int[index + 1];
        result[0] = 1;
        result[1] = 1;
        for (int k = 2; k < result.length; k++) {
            result[k] = result[k - 2] + result[k - 1];
        }
        return result[index];
    }
}

