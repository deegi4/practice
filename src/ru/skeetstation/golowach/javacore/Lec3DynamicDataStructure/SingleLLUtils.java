package ru.skeetstation.golowach.javacore.Lec3DynamicDataStructure;

public class SingleLLUtils {
    public static Node addLast(Node tail, int value) {
        while (tail != null) tail = tail.next;
        return tail = new Node(value, null);
    }

    public static Node addLastRecFull(Node tail, int value) {
        if (tail == null) {
            tail = new Node(value, null);
        } else if (tail.next == null) {
            tail.next = new Node(value, null);
        } else {
            addLastRecFull(tail.next, value);
        }
        return tail;
    }

    public static Node addLastRec(Node tail, int value) {
        if (tail == null) return tail = new Node(value, null);
        tail.next = (tail.next == null) ? new Node(value, null) : addLastRec(tail.next, value);
        return tail;
    }

    public static Node insertInPosition(Node tail, int index, int value) {
//        if(index == 0) tail = new Node(value, tail.next);
//        else insertInPosition(tail.next, index - 1, value);
//        return tail;

        while (index != 0) {
            tail = tail.next;
            index--;
        }
        return tail.next = new Node(value, tail.next);

    }

    public static Node insertInPositionRec(Node tail, int index, int value) {
        if(index == 0) tail.next = new Node(value, tail.next);
        else insertInPosition(tail.next, index - 1, value);
        return tail;

    }

    public static void main(String[] args) {
        Node tail = Node.genRec(0, 10, 20, 30);
//        Node tail = null;
        System.out.println(Node.toStringRec(tail));
        tail = addLastRec(tail,45);
        insertInPositionRec(tail, 2, 25);
        System.out.println(Node.toStringRec(tail));

    }

}
