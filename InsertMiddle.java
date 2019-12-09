import java.util.Scanner;

public class InsertMiddle{
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public static void insert(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
		}
		else {
			Node current = head;
			while(current.next!=null)
				current = current.next;
			current.next = newNode;
		}
	}
	public static void display() {
		Node current = head;
		while(current!=null) {
			System.out.print(current.data+" -> ");
			current = current.next;
		}
		System.out.print("null");
	}
	public static void insertMid(int data) {
		Node newNode = new Node(data);
		int size = 0;
		int s = 0;
		Node current = head;
		while(current!=null) {
			size++;
			current = current.next;
		}
		current = head;
		while(s<size/2-1) {
			current = current.next;
			s++;
		}
		Node nxt = current.next;
		current.next = newNode;
		newNode.next = nxt;
	}
	public static void main(String args[]) {
		InsertMiddle li = new InsertMiddle();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			li.insert(a);
		}
		int z = sc.nextInt();
		li.insertMid(z);
		li.display();
	}
}