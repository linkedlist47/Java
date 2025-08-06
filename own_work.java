import java.io.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    Node head;

    public void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newnode;
    }

    public void insertb(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void insertp(int data, int position) {
        Node newnode = new Node(data);
        if (position == 0) {
            insertb(data);
            return;
        }

        Node temp = head;
        int count = 0;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void del(int data) {
        Node temp = head, prev = null;

        if (head != null && head.data == data) {
            head = head.next;
            System.out.println("Deleted");
            return;
        }

        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Not found");
            return;
        }

        prev.next = temp.next;
        System.out.println("Deleted");
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Main list = new Main(); // create instance
            int choice, data;

            while (true) {
                System.out.println("\n=== MENU ===");
                System.out.println("1 - Insert at end");
                System.out.println("2 - Insert at beginning");
                System.out.println("3 - Insert at position");
                System.out.println("4 - Delete a node");
                System.out.println("5 - Exit");
                System.out.println("6 - Multiple inputs");
                System.out.println("7 - Display list");

                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(br.readLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter data to insert: ");
                        data = Integer.parseInt(br.readLine());
                        list.insert(data);
                        break;

                    case 2:
                        System.out.print("Enter data to insert at beginning: ");
                        data = Integer.parseInt(br.readLine());
                        list.insertb(data);
                        break;

                    case 3:
                        System.out.print("Enter data: ");
                        data = Integer.parseInt(br.readLine());
                        System.out.print("Enter position (0-based): ");
                        int pos = Integer.parseInt(br.readLine());
                        list.insertp(data, pos);
                        break;

                    case 4:
                        System.out.print("Enter value to delete: ");
                        data = Integer.parseInt(br.readLine());
                        list.del(data);
                        break;

                    case 5:
                        System.out.println("Exiting...");
                        return;

                    case 6:
                    try {
                        System.out.println("Enter values, type any characters to stop");
                        while (true) {
                            System.out.print("Input: ");
                            data = Integer.parseInt(br.readLine());
                            list.insert(data);
                        }
                    }
                    catch (NumberFormatException e) {
                        break;
                    }
                       

                    case 7:
                        list.display();
                        break;

                    default:
                        System.out.println("Invalid choice, try again.");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
____________________________________________________________________________________________________________________________________________________________________________________________________________________
