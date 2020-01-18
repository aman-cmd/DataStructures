import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Pythagoras{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int te=0;te<t;te++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			HashMap<Integer,Integer>hyp = new HashMap<Integer,Integer>();
			for(int i=0;i<n;i++) {
				hyp.put(arr[i]*arr[i], arr[i]);
			}
			boolean flag = false;
			for(int i=0;i<n-2;i++) {
				for(int j=i+1;j<n-1;j++) {
					if(hyp.containsKey((arr[i]*arr[i])+(arr[j]*arr[j]))) {
						flag = true;
						break;
					}
				}
			}
			System.out.println(flag);
		}
	}
}