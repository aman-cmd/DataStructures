import java.util.Scanner;
public class LinkedListD{
	static class Node {
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
		}System.out.print("null");
	}
	public static void main(String args[]) {
		LinkedListD l1 = new LinkedListD();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			l1.insert(a);
		}
		l1.display();
		l1.deleteRepeated();
		System.out.println("\nAfter deleting repeated elements");
		l1.display();
	}
	public void deleteRepeated() {
		// TODO Auto-generated method stub
		Node current = head;
		while(current.next!=null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
			if(current == null) {
				return;
			}
		}
	}
}