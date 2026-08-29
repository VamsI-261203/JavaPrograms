public class linkedList {

    public static void main(String[] args) {

        // Create a linked list object
        linkedList list = new linkedList();

        // Insert elements at the beginning
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);

        // Display the linked list
        list.display();
    }

    // Head points to the first node
    private Node head;

    // Tail points to the last node
    private Node tail;

    // Stores the number of nodes
    private int size;


    // Constructor
    public linkedList() {
        this.size = 0;
    }


    // Insert a new node at the beginning
    public void insertFirst(int val) {

        // Create a new node
        Node node = new Node(val);

        // New node points to the current head
        node.next = head;

        // Make the new node the head
        head = node;

        // If this is the first node,
        // tail should also point to this node
        if (tail == null) {
            tail = head;
        }

        // Increase the size
        size++;
    }


    // Display all elements
    public void display() {

        // Start from the head
        Node temp = head;

        // Continue until we reach null
        while (temp != null) {

            System.out.print(temp.value + " --> ");

            // Move to the next node
            temp = temp.next;
        }

        System.out.println("END");
    }


    // Node class
    private class Node {

        // Stores the data
        private int value;

        // Stores the reference to the next node
        private Node next;


        // Node constructor
        private Node(int value) {
            this.value = value;
        }
    }
}