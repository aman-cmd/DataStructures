import java.util.Scanner;
public class ArrayLeader{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int largest = arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			if(i==arr.length-1) {
				System.out.print(arr[i]+" ");
			}
			if(arr[i-1]>=arr[i]&&arr[i-1]>=largest) {
				largest = arr[i-1];
				System.out.print(largest+" ");
			}
		}
	}
}