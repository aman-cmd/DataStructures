import java.util.Scanner;
public class Subarrays{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int i = 0;
		int j = n-1;
		int sumLow = arr[0];
		int sumHigh = arr[n-1];
		int sumMid = 0;
		int flag = 0;
		while(i<j) {
			if(sumLow==sumHigh) {
				for(int k=i+1;k<j;k++) {
					sumMid+=arr[k];
				}
				if(sumLow==sumMid) {
					System.out.println(i + " , " + (j-1));
					flag = 1;
					break;
				}
			}
			else if(sumLow<sumHigh) {
				i++;
				sumLow+=arr[i];
			}
			else if(sumHigh<sumLow) {
				j--;
				sumHigh+=arr[j];
			}
		}
		if(flag==0) {
			System.out.println("-1");
		}
	}
}