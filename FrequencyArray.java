import java.util.Scanner;

public class FrequencyArray{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int max = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		int newarr[] = new int[max+1];
		for(int i=0;i<newarr.length;i++)
			newarr[i] = 0;
		for(int i=0;i<n;i++) {
			newarr[arr[i]]++;
		}
		for(int i=0;i<newarr.length;i++) {
			if(newarr[i]>0) {
				System.out.println("freq of "+i+" is "+newarr[i]);
			}
		}
	}
}