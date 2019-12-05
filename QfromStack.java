import java.util.Scanner;
import java.util.Stack;

public class QfromStack{
	static Stack<Integer> st1 = new Stack<Integer>();
	static Stack<Integer> st2 = new Stack<Integer>();
	public static void enqueue(int data) {
		while(!st1.isEmpty()) {
			st2.push(st1.pop());
		}
		st1.push(data);
		while(!st2.isEmpty()) {
			st1.push(st2.pop());
		}
	}
	public static int dequeue() {
		if(st1.isEmpty()) {
			System.out.println("already empty");
			return 0;
		}
		else {
			return st1.pop();
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			enqueue(a);
		}
		System.out.println(dequeue());
		System.out.println(dequeue());
	}
}