import java.util.Scanner;

public class PairSums{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int z = sc.nextInt();
		int arrA[] = new int[n];
		int arrB[] = new int[m];
		for(int i=0;i<n;i++)
			arrA[i] = sc.nextInt();
		for(int i=0;i<m;i++)
			arrB[i] = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arrA[i]+arrB[j]==z)
					System.out.print("("+arrA[i]+","+arrB[j]+")"+" , ");
			}
		}
	}
}