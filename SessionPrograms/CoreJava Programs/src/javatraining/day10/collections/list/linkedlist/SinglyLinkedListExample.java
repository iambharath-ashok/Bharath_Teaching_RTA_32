package javatraining.day10.collections.list.linkedlist;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedListExample {
    public static void main(String[] args) {
        // Create nodes
        Node<String> node1 = new Node<>("Alice");
        Node<String> node2 = new Node<>("Bob");
        Node<String> node3 = new Node<>("Charlie");

        // Link nodes
        node1.next = node2;
        node2.next = node3;

        // Traversing the linked list
        Node<String> currentNode = node1;
        while (currentNode != null) {
            System.out.println("Data: " + currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
