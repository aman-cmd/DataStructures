import java.util.Scanner;

public class RemoveAdjacentDup{
	public static String removeDuplicate(String str) {
		if(str.length()<=1) {
			return str;
		}
		int count = 0;
		if(str.charAt(0)==str.charAt(1)) {
			while(count<str.length()-1&&str.charAt(count)==str.charAt(count+1)) {
				count++;
			}
			return removeDuplicate(str.substring(count+1));
		}
		else {
			return str.charAt(0) + removeDuplicate(str.substring(1));
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str2 = removeDuplicate(str);
		System.out.println(str2);
	}
}