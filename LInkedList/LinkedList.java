package LInkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        } 
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            temp = temp.next;
        }

        Node newNode = new Node(value, temp.next);
        temp.next = newNode;

        size++;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(1);
        list.insertLast(2);
        list.insert(3, 1);
    }
}
