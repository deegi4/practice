package ru.skeetstation.golowach.javacore.Lec3DynamicDataStructure;

import ru.skeetstation.golowach.javacore.Lec3DynamicDataStructure.NodeCopyIsEqual;

public class TestAddLast {

    public static void main(String[] args) {
        // 0
        checkEquals(toString(gen(0)), toString(SingleLLUtils.addLast(null, 0)));
        // 1
        checkEquals(toString(gen(1, 0)), toString(SingleLLUtils.addLast(gen(1), 0)));
        // 2
        checkEquals(toString(gen(1, 2, 0)), toString(SingleLLUtils.addLast(gen(1, 2), 0)));
        // 3
        checkEquals(toString(gen(1, 2, 3, 0)), toString(SingleLLUtils.addLast(gen(1, 2, 3), 0)));
    }

    public static void checkEquals(String expected, String actual) {
        if(!expected.equals(actual)) {
            throw new AssertionError("expected = " + expected + "but actual = " + actual);
        }
        System.err.println("Checked: expected = " + expected + ", actual = " + actual);
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
