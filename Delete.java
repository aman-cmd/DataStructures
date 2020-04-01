import java.util.Scanner;
public class Delete{
	public static class Node{
		int data;
		Node next;
		Node(){}
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = new Node();
		Node current = new Node();
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(i==0) {
				head = new Node(sc.nextInt());
				current = head;
			}else {
				current.next = new Node(sc.nextInt());
				current = current.next;
			}
		}
		printLL(head);
		int d = sc.nextInt();
		deleteNode(head,d);
		
		printLL(head);
	}
	private static void deleteNode(Node head, int i) {
		Node current = head;
		if(head.data==i) {
			Node cur = head;
			while(cur.next!=null) {
				cur.data = cur.next.data;
				if(cur.next.next==null) {
					cur.next = null;
					break;
				}
				cur = cur.next;
			}
		}else {
			while(current.next!=null) {
				if(current.next.data==i) {
					current.next = current.next.next;
				}
				current = current.next;
			}
			
		}
	}
	private static void printLL(Node head) {
		Node current = head;
		while(current!=null) {
			System.out.print(current.data+"->");
			current = current.next;
		}System.out.print("null");
	}
}