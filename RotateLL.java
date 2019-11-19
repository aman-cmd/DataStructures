import java.util.Scanner;

public class RotateLL{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	public RotateLL insert(RotateLL li,int data)
	{
		Node n1 =new Node(data);
		if(li.head==null)
		{
			li.head = n1;
		}
		else
		{
			Node last = li.head;
			while(last.next!=null)
			{
				last = last.next;
			}
			last.next = n1;
		}
		return li;
	}
	public static void display(RotateLL li)
	{
		Node current = li.head;
		while(current.next!=null)
		{
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.print(current.data);
	}
	public static void rotate(RotateLL li, int k) {
		Node start = li.head;
		Node current = li.head;
		while(k>1) {
			current = current.next;
			k--;
		}
		li.head = current.next;
		current.next = null;
		current = li.head;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = start;
	}
	
	public static void main(String args[]) {
		RotateLL li = new RotateLL();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			li = li.insert(li,a);
		}
		int k = sc.nextInt();
		li.rotate(li,k);
		li.display(li);	
	}
}