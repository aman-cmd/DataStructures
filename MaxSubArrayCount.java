import java.util.Scanner;

public class MaxSubArrayCount{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int x = sc.nextInt();
		for(int i=0;i<n;i++) {
			int max = arr[i];
			for(int j=i;j<n;j++) {
				if(arr[j]>max)
					max = arr[j];
				if(max>x)
					count++;
			}
		}
		System.out.println(count);
	}
}