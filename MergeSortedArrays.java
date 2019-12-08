import java.util.Scanner;

public class MergeSortedArrays{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++)
			arr1[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for(int i=0;i<m;i++)
			arr2[i] = sc.nextInt();
		int[] arr3 = new int[m+n];
		int i=0;
		int j=0;
		int k=0;
		while(i<n&&j<m) {
			if(arr1[i]<arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			}
			else if(arr2[j]<arr1[i]) {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}
		if(i>=n) {
			while(j<m) {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}
		else if(i>=m) {
			while(i<n) {
				arr3[k] = arr1[i];
				i++;
				k++;
			}
		}
		for(int t=0;t<n+m;t++)
			System.out.print(arr3[t]+" ");
	}
}