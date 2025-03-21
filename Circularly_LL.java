class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    static Node head, tail;

    public static void insert(int data) {
        Node n = new Node(data);

        if (head == null) { 
            head = tail = n;
            tail.next = head; 
        } else {
            tail.next = n; 
            tail = n;      
            tail.next = head; 
        }
    }

    public static void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data);
            if (temp.next != head) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.insert(50);
        cll.display();
    }
}
