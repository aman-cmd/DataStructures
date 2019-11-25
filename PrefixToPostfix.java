import java.util.Scanner;
import java.util.Stack;

public class PrefixToPostfix{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String result = "";
		Stack<String> st = new Stack<String>();
		for(int i=str.length()-1;i>=0;i--) {
			char c = str.charAt(i);
			if(c=='+'||c=='-'||c=='*'||c=='/') {
				String s1 = (String) st.pop();
				String s2 = (String) st.pop();
				result = s1+s2+c;
				st.push(result);
			}
			else {
				st.push(c+"");
			}
		}
		System.out.println("Prefix  -> "+str);
		System.out.println("Postfix -> "+st.pop());
	}
}