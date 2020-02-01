import java.util.Scanner;
import java.util.Stack;
public class StackMin{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> st1 = new Stack<Integer>();
		for(int i=0;i<n;i++) {
			st1.push(sc.nextInt());
		}
		int min = Integer.MAX_VALUE;
		while(!st1.isEmpty()) {
			if(st1.pop()<min) {
				min = st1.pop();
			}
		}
		System.out.println("minimum value = "+min);
	}
}