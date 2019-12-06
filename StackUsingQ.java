import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingQ{
	static Queue<Integer> q1 = new LinkedList<Integer>();
	static Queue<Integer> q2 = new LinkedList<Integer>();
	public static void push(int data) {
		q2.add(data);
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		Queue q = q1;
		q1 = q2;
		q2 = q;
	}
	public static Queue pop() {
		q1.poll();
		return q1;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			push(a);
		}
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
	}
}