import java.util.Scanner;
public class StringReverse{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			String str = sc.next();
			String[] arr = str.split("[.]");
			str = arr[arr.length-1];
			for(int j=arr.length-2;j>=0;j--) {
				str = str + "." + arr[j];
			}
			System.out.println(str);
		}
	}
}