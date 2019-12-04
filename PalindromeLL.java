import java.util.Scanner;

public class PalindromeLL{
	static Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	public static void insert(PalindromeLL li, int data) {
		Node newNode = new Node(data);
		if(li.head == null) {
			li.head = newNode;
		}
		else {
			Node current = li.head;
			while(current.next!=null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
	public static void checkPalindrome(PalindromeLL li) {
		int forward=0;
		int backward=0;
		int place=1;
		Node temp=li.head;
		while(temp!=null)
		{
			forward=forward*10+temp.data;
			backward=backward+place*temp.data;
			place=place*10;
			temp=temp.next;
		}
		if(forward==backward)
		{
			System.out.println("YES IT IS PALINDROME");
		}
		else
		{
			System.out.println("NO IT IS NOT PALINDROME");
		}
	}
	public static void main(String args[]) {
		PalindromeLL li = new PalindromeLL();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			li.insert(li,a);
		}
		li.checkPalindrome(li);
	}
}