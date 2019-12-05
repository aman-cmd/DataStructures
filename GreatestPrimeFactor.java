import java.util.Scanner;

public class GreatestPrimeFactor{
	public static boolean checkPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int greatest = Integer.MIN_VALUE;
		for(int i=1;i<=n;i++) {
			if(checkPrime(i)&&i>greatest&&n%i==0) {
				greatest = i;
			}
		}
		System.out.println(greatest);
	}
}