package ru.skeetstation.golowach.javacore.Lec3DynamicDataStructure;

import java.util.Arrays;


public class Node {
    public int value;
    public Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
    public static String toStringIter(Node tail) {
        String result = "";
        while (tail.next != null){
            result += tail.value + " -> ";
            tail = tail.next;
        }

        return result + tail.value + " -> *";
    }

    public static String toStringRec(Node tail) {
        return (tail == null) ? "*" : tail.value + " -> " + toStringRec(tail.next);
    }

    public static String toStringRecFull(Node tail) {
        if (tail == null) {
            return  "*";
        } else {
            return tail.value + " -> " + toStringRecFull(tail.next);
        }
    }

    public static Node genSimple() {
        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);

        Node tail = node3;
        node3.next = node2;
        node2.next = node1;
        node1.next = node0;
        return tail;
    }

    public static Node genSimpleAn() {
        Node tail;
        tail = new Node(0, null);
        tail = new Node(1, tail);
        tail = new Node(2, tail);
        tail = new Node(3, tail);
        return tail;
    }

    public static Node genIter(int... values) {
        Node tail = null;
        for(int k = values.length - 1; k >= 0; k--) {
            tail = new Node(values[k], tail);
        }
        return tail;
    }

    public static Node genRecFull(int... v) {
        if (v.length == 0)
            return null;
        else {
            int[] newArray = Arrays.copyOfRange(v, 1, v.length);
            Node next = genRecFull(newArray);
            return  new Node(v[0], next);
        }

    }

    public static Node genRec(int... v) {
        return v.length == 0 ? null : new Node(v[0], genRec(Arrays.copyOfRange(v, 1, v.length)));
    }

    public static Node merge(Node tailA, Node tailB) {
        if (tailA != null && tailB != null) {
            if (tailA.value < tailB.value) {
                return new Node(tailA.value, merge(tailA.next, tailB));
            } else {
                return new Node(tailB.value, merge(tailA, tailB.next));
            }
        } else return (tailA == null) ? tailB : tailA;
    }

    public static void main(String[] args) {
        Node tail1 = genSimple();
        Node tail2 = genSimpleAn();
        Node tail3 = genIter(0, 10, 20, 30);
        Node tail4 = genRecFull(5, 15, 25, 35);
        Node tail5 = genRec(8, 18, 28, 38);
        Node tailM = merge(tail4, tail5);

        System.out.println(toStringIter(tail1));
        System.out.println(toStringIter(tail2));
        System.out.println(toStringIter(tail3));
        System.out.println(toStringIter(tail4));
        System.out.println(toStringRec(tail5));
        System.out.println(toStringRec(tailM));
    }
}
