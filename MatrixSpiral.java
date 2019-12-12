import java.util.Scanner;

public class MatrixSpiral{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				arr[i][j] = sc.nextInt();
		int r_start = 0;
		int r_end = n-1;
		int c_start = 0;
		int c_end = m-1;
		while(r_start<r_end&&c_start<c_end) {
			for(int i=c_start;i<=c_end;i++) {
				System.out.print(arr[r_start][i]+" ");
			}
			r_start++;
			for(int i=r_start;i<=r_end;i++) {
				System.out.print(arr[i][c_end]+" ");
			}
			c_end--;
			for(int i=c_end;i>=c_start;i--) {
				System.out.print(arr[r_end][i]+" ");
			}
			r_end--;
			for(int i=r_end;i>=r_start;i--) {
				System.out.print(arr[i][c_start]+" ");
			}
			c_start++;
		}
	}
}