package javatraining.day10.collections.list.linkedlist.doublylinkedlist;

class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Insert at the beginning
    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert at the end
    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Delete from the beginning
    public void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                // If the list is now empty, update the tail as well
                tail = null;
            }
        }
    }

    // Display the doubly linked list from head to tail
    public void displayForward() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Display the doubly linked list from tail to head
    public void displayBackward() {
        Node<T> current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.insertAtEnd(10);
        doublyLinkedList.insertAtBeginning(5);
        doublyLinkedList.insertAtEnd(20);
        doublyLinkedList.insertAtBeginning(2);

        System.out.println("Doubly Linked List (Forward):");
        doublyLinkedList.displayForward(); // Output: 2 5 10 20

        System.out.println("Doubly Linked List (Backward):");
        doublyLinkedList.displayBackward(); // Output: 20 10 5 2

        doublyLinkedList.deleteFromBeginning();

        System.out.println("Doubly Linked List after deletion from the beginning (Forward):");
        doublyLinkedList.displayForward(); // Output: 5 10 20

        System.out.println("Doubly Linked List after deletion from the beginning (Backward):");
        doublyLinkedList.displayBackward(); // Output: 20 10 5
    }
}
