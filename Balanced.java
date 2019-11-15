import java.util.Scanner;
import java.util.Stack;
public class Balanced{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		Stack<Character> st = new Stack();
		int i=0;
		while(i<input.length()) {
			char ch = input.charAt(i);
			if(ch=='('||ch=='{'||ch=='[') {
				st.push(ch);
			}
			if((ch==')'&&st.peek()=='(')||(ch=='}'&&st.peek()=='{')||(ch==']'&&st.peek()=='[')) {
				st.pop();
			}
			i++;
		}
		if(st.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("notBalanced");	
	}
}