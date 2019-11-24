import java.util.Scanner;

public class ReverseDoublyLL{
	static Node head;
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int data){
			this.data= data;
		}
	}
	public static void insert(ReverseDoublyLL li,int data) {
		Node newNode = new Node(data);
		if(li.head==null) {
			li.head = newNode;
			newNode.prev = null;
			newNode.next = null;
		}
		else {
			Node current = li.head;
			while(current.next!=null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.next = null;
			newNode.prev = current;
		}
	}
	public static void display(ReverseDoublyLL li) {
		Node current = li.head;
		System.out.print("null -> ");
		while(current.next!=null) {
			System.out.print(current.data+" <-> ");
			current = current.next;
		}
		System.out.print(current.data+" <-> null");
		System.out.println();
	}
	public static void reverseLL(ReverseDoublyLL li) {
		Node current = li.head;
		while(current!=null) {
			Node temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			li.head = current;
			current = current.prev;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ReverseDoublyLL li = new ReverseDoublyLL();
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			li.insert(li, a);
		}
		li.display(li);
		li.reverseLL(li);
		li.display(li);
	}
}