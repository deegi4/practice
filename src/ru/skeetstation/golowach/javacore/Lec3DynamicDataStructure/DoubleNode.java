package ru.skeetstation.golowach.javacore.Lec3DynamicDataStructure;


public class DoubleNode {
    public int value;
    public DoubleNode prev;
    public DoubleNode next;

    public DoubleNode(int value, DoubleNode prev, DoubleNode next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

//    public static DoubleNode addLast(DoubleNode tail, int value) {}
//    public static DoubleNode insertInPosition(DoubleNode tail, int index, int value) {}
//    public static DoubleNode removeInPosition(DoubleNode tail, int index) {}
//    public static DoubleNode removeLast(DoubleNode tail) {}

}
