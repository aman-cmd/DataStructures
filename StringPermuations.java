import java.util.Arrays;
import java.util.Scanner;
public class StringPermutation{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		str = new String(arr);
		printPerm(str,"");
	}
	public static void printPerm(String str, String ans) {
		if(str.length()==0) {
			System.out.print(ans+" ");
		}
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0,i) + str.substring(i+1);
			printPerm(ros, ans+ch);
		}
	}
}