import java.util.Scanner;

public class Arrays{
	public static void print(int a,int b) {
		System.out.println("starting index = "+a+" , ending index = "+b);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int z = sc.nextInt();
		for(int i=0;i<n;i++) {
			int sum = 0;
			int j = i;
			while(sum<z&&j<n) {
				sum+=arr[j];
				j++;
			}
			if(sum==z) {
				print(i,j-1);
			}
		}
	}
}