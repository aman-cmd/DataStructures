import java.util.Scanner;

public class MaxSubArrayCount{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int x = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int max = Integer.MIN_VALUE;
				for(int k=i;k<=j;k++) {
					if(arr[k]>max) {
						max = arr[k];
					}
				}
				if(max > x)
					count++;
			}
		}
		System.out.println(count);
	}
}