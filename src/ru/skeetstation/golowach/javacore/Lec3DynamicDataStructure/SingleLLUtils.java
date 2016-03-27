package ru.skeetstation.golowach.javacore.Lec3DynamicDataStructure;

public class SingleLLUtils {
    public static final int LAST_INDEX = Integer.MAX_VALUE;
    public static final int FIRST_INDEX = 0;

    public static Node addLast(Node tail, int value) {
//        return addLastIter(tail, value);
//        return addLastRec(tail, value);
//        return addLastRecFull(tail, value);
        return insertInPosition(tail, LAST_INDEX, value);
    }

    public static Node addLastIter(Node tail, int value) {
        Node result = tail;
        if (tail == null) {
            tail = new Node(value, null);
        }
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = new Node(value, null);
        return result;
    }

    public static Node addLastRec(Node tail, int value) {
        if (tail == null) return tail = new Node(value, null);
        tail.next = (tail.next == null) ?
                new Node(value, null) : addLastRec(tail.next, value);
        return tail;
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

    public static Node insertInPosition(Node tail, int index, int value) {
        if (index == 0 || tail == null) return new Node(value, tail);

        Node result = tail;
        while (index > 1 && tail.next != null) {
            tail = tail.next;
            index--;
        }
        tail.next = new Node(value, tail.next);
        return result;
    }

    public static Node insertInPositionRec(Node tail, int index, int value) {
        if (index == 0) return new Node(value, tail);
        else if (index > 1 && tail.next != null) insertInPositionRec(tail.next, index - 1, value);
        else tail.next = new Node(value, tail.next);
        return tail;
    }

    public static Node removeInPosition(Node tail, int index) {
        Node result = tail;
        if (index == 0) return tail.next;
        while (index > 1 && tail.next.next != null) {
            tail = tail.next;
            index--;
        }
        tail.next = tail.next.next;
        return result;
    }

    public static Node removeInPositionRec(Node tail, int index) {
        if (index == 0) return tail.next;
        if (index > 1 && tail.next.next != null) removeInPositionRec(tail.next, index - 1);
        else tail.next = tail.next.next;
        return tail;
    }

    public static Node removeLast(Node tail) {
        Node result = tail;
        if (tail == null || tail.next == null) return null;
        while (tail.next.next != null) tail = tail.next;
        tail.next = null;
        return result;
}

    public static Node removeLastRec(Node tail) {
        if (tail == null || tail.next == null) return null;
        if (tail.next.next == null) tail.next = null;
        else removeLastRec(tail.next);
        return tail;
    }

    public static boolean contains(Node tail, int value) {
        if (tail == null) return false;
        if (tail.value == value) return true;
        return contains(tail.next, value);
    }

    public static void main(String[] args) {
        Node tail = Node.genRec(0, 10, 20, 30);
//        Node tail = null;
        System.out.println(Node.toStringRec(tail));
        tail = addLast(tail,45);
        System.out.println("addLast(tail, 45): " + Node.toStringRec(tail));
        tail = insertInPositionRec(tail, LAST_INDEX, 25);
        System.out.println("insertInPosition(tail, 1, 25): " + Node.toStringRec(tail));
        tail = removeInPosition(tail,0);
        System.out.println("removeInPosition(tail, 0): " + Node.toStringRec(tail));
        tail = removeLast(tail);
        System.out.println("removeLast(tail): " + Node.toStringRec(tail));
        System.out.println("contaits(tail, 45): " + contains(tail, 45));
        System.out.println("contaits(tail, 25): " + contains(tail, 25));

    }

}
