class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	static Node head,tail;
	public static void insert(int data) {
		Node n = new Node(data);

		if(head == null) {
			head = n;
			tail = n;
		}
		else {
			tail.next = n;
			tail = n;
		}
	}
	public static void display() {
		Node temp = head;

		if(head == null) {
			System.out.println("List is empty");
		}
		while(temp != null) {
			System.out.print(temp.data);
			if(temp.next != null) {
				System.out.print("->");
			}

			temp = temp.next;
			
		}
		System.out.println();
	}
	
	public void RemoveTail(){
        System.out.println("remove tail of ll:");
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
            tail = temp;
    }


}

public class Main {
	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.insert(10);
		ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.display();
		ll.RemoveTail();
		ll.display();
	}
}