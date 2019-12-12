import java.util.Arrays;
import java.util.Scanner;

public class LongestNumber{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		String[] strarr = new String[n];
		for(int i=0;i<n;i++) {
			strarr[i] = String.valueOf(arr[i]);
		}
		Arrays.sort(strarr);
		String res = "";
		for(int i=n-1;i>=0;i--) {
			res += strarr[i];
		}
		
		System.out.println(Long.parseLong(res));
	}
}