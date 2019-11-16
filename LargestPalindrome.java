import java.util.Scanner;

public class LargestPalindrome{
	public static boolean checkPalindrome(String input,int i,int j) {
		while(i<j) {
			if(input.charAt(i)!=input.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String result = "";
		for(int i=0;i<input.length()-1;i++) {
			for(int j=i+1;j<input.length();j++) {
				boolean pal = checkPalindrome(input,i,j);
				if(pal==true) {
					if(j-i+1>=result.length()) {
						result = input.substring(i, j+1);
					}
				}
			}
		}
		System.out.println(result);
	}
}