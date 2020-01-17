import java.util.Arrays;
import java.util.Scanner;
public class Anagrams{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		a = a.toLowerCase();
		b = b.toLowerCase();
		char[] arr_a = a.toCharArray();
		char[] arr_b = b.toCharArray();
		Arrays.sort(arr_a);
		Arrays.sort(arr_b);
		a = new String(arr_a);
		b = new String(arr_b);
//		System.out.println(a);
//		System.out.println(b);
		if(a.equalsIgnoreCase(b)) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}
	}
}