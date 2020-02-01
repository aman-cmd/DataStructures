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
	static Node tail = null;
	public static void insert(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			newNode.prev = head;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
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
		Node start = head;
		Node end = tail;
		while(start.data<=end.data) {
			if(start.data+end.data<k) {
				start = start.next;
			}
			else if(start.data+end.data>k) {
				end = end.prev;
			}
			else if(start.data+end.data==k) {
				System.out.println(start.data+", "+end.data);
				start = start.next;
			}
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