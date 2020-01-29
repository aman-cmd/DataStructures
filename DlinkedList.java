import java.util.Scanner;
public class DLinkedList{
	static class Node{
		int data;
		Node next,prev;
		Node(int data){
			this.data = data;
			prev = next = null;
		}
	}
	static Node head = null;
	public static void insert(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			newNode.prev = head;
		}
		else {
			Node current = head;
			while(current.next!=null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
		}
	}
	public static void display() {
		Node current = head;
		System.out.print("head <-> ");
		while(current!=null) {
			System.out.print(current.data+" <-> ");
			current = current.next;
		}
		System.out.print("null");
	}
	public static void printPairs(int k) {
		Node current = head;
		while(current.next.next!=null) {
			Node inner = current.next;
			while(current.data+inner.data<k) {
				inner = inner.next;
			}
			if(current.data+inner.data==k) {
				System.out.println(current.data+","+inner.data);
			}
			current = current.next;
		}
	}
	public static void main(String args[]) {
		DLinkedList dll = new DLinkedList();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			insert(a);
		}
		display();
		System.out.println();
		int k = sc.nextInt();
		printPairs(k);
	}
}