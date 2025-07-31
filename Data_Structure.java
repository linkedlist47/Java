//Node creation
class Node {
    int data;       // Data stored in the node
    Node next;      // Reference to next node

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  // Node class representing each element in the list
class Node {
    int data;       // Data stored in the node
    Node next;      // Reference to next node

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


// LinkedList class managing nodes
public class LinkedList {
    Node head;   // Head of the list (first node)

    // Insert at the beginning
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;  // New node points to old head
        head = newNode;       // Head updated to new node
    }

    // Insert at the end
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {   // Empty list
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;  // Traverse to last node
        }
        current.next = newNode;       // Link last node to new node
    }

    // Insert at specific position (0-based index)
    public void insertAtPosition(int position, int data) {
        if (position == 0) {
            insertAtHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int count = 0;

        // Traverse to node just before position
        while (current != null && count < position - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete first node with given value
    public void deleteByValue(int data) {
        Node current = head;
        Node prev = null;

        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println(data + " not found in list.");
            return;
        }

        if (prev == null) { // Deleting head
            head = current.next;
        } else {
            prev.next = current.next;
        }
    }

    // Delete node at given position (0-based)
    public void deleteByPosition(int position) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;
        int count = 0;

        while (current != null && count < position) {
            prev = current;
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        prev.next = current.next;
    }

    // Search for a value; return true if found, else false
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Print all nodes in the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Return length of the list
    public int length() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Main method for quick test
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtHead(10);
        ll.insertAtTail(20);
        ll.insertAtPosition(1, 15);  // 10 -> 15 -> 20
        ll.printList();

        System.out.println("Length: " + ll.length());   // Length: 3
        System.out.println("Search 15: " + ll.search(15)); // true

        ll.deleteByValue(15);
        ll.printList();   // 10 -> 20 -> null

        ll.deleteByPosition(1);
        ll.printList();   // 10 -> null
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  // Separate Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    // Static global variables
    static Node head;
    static Node tail;
    static Node newNode;

    // Method to add node at the end
    public static void add(int data) {
        newNode = new Node(data);

        if (head == null) {  // empty list
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Print the list
    public static void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);

        printList();  // Output: 10 -> 20 -> 30 -> null
    }
}

