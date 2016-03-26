package ru.skeetstation.golowach.javacore.Lec3DynamicDataStructure;

import ru.skeetstation.golowach.javacore.Lec3DynamicDataStructure.Node;

public class NodeCopyIsEqual {
    public static void main(String[] args) {
        Node tailA = gen(0, 1, 2, 3);
        Node tailB = copy(tailA);
        System.out.println("a: " + toString(tailA));
        System.out.println("b: " + toString(tailB));
        System.out.println("isEqual: " + isEqual(tailA, tailB));
        System.out.println();
        tailB.next.next.value = 1000;
        System.out.println("a: " + toString(tailA));
        System.out.println("b: " + toString(tailB));
        System.out.println("isEqual: " + isEqual(tailA, tailB));
    }

    public static Node copy(Node tail) {
        return tail == null ? null : new Node(tail.value, copy(tail.next));
    }
    public static boolean isEqual(Node tailA, Node tailB) {
        if (tailA != null && tailB != null) {
            return  (tailA.value == tailB.value) && isEqual(tailA.next, tailB.next);
        } else {
            return  tailA == tailB;
        }
    }

    public static Node gen(int... values) {
        Node tail = null;
        for(int k = values.length - 1; k >= 0; k--) {
            tail = new Node(values[k], tail);
        }
        return tail;
    }

    public static String toString(Node tail) {
        return (tail == null) ? "*" : tail.value + "->" + toString(tail.next);
    }
}
