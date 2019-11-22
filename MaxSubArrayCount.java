import java.util.Scanner;

public class MaxSubArrayCount{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int x = sc.nextInt();
		int totalSubArrays = n*(n+1)/2;
		int m = 0;
		for(int i=0;i<n;i++)
			if(arr[i]<=x)
				m++;
		int dontCount = m*(m+1)/2;
		int countedSubArrays = totalSubArrays - dontCount;
		System.out.println(countedSubArrays);
	}
}