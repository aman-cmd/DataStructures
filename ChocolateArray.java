import java.util.Arrays;
import java.util.Scanner;

public class ChocolateArray{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int m = sc.nextInt();
		Arrays.sort(arr);
		int minDiff = Integer.MAX_VALUE;
		for(int i=0;i<n-m+1;i++) {
			int diff = arr[i+m-1] - arr[i];
			if(diff<minDiff)
				minDiff = diff;
		}
		System.out.println(minDiff);
	}
}