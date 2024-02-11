package javatraining.day10.collections.list.linkedlist.singlylinkedlist;

//Linked list data structure
class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    // Insert at the beginning
    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete from the beginning
    public void deleteFromBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    // Display the linked list
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Double> doubleLinkedList = new LinkedList<>();

        doubleLinkedList.insertAtBeginning(70.0);


        LinkedList<Integer> intList = new LinkedList<>();
        intList.insertAtEnd(10);
        intList.insertAtBeginning(5);
        intList.insertAtEnd(20);
        intList.insertAtBeginning(2);
        intList.insertAtBeginning(100);

        System.out.println("Integer Linked List:");
        intList.display(); // Output: 2 5 10 20

        intList.deleteFromBeginning();

        System.out.println("Integer Linked List after deletion from the beginning:");
        intList.display(); // Output: 5 10 20

        LinkedList<String> stringList = new LinkedList<>();
        stringList.insertAtEnd("Hello");
        stringList.insertAtBeginning("Welcome");
        stringList.insertAtEnd("World");

        System.out.println("String Linked List:");
        stringList.display(); // Output: Welcome Hello World
    }
}
