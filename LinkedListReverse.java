import java.util.Scanner;
public class LinkedListReverse{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	static Node head = null;
	public void insert(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
		}
		else {
			Node current = head;
			while(current.next!=null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	public void display() {
		Node current = head;
		while(current!=null) {
			System.out.print(current.data+" -> ");
			current = current.next;
		}
		System.out.print("null");
	}
	public void reverse() {
		Node current = head;
		Node prev = null;
		Node next = null;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	public static void main(String args[]) {
		LinkedListReverse l1 = new LinkedListReverse();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			l1.insert(a);
		}
		l1.display();
		l1.reverse();
		System.out.println("\nAfter reverse : ");
		l1.display();
	}
}