
import java.util.Scanner;
public class PossibleBSTs
{ 
 int fact(int n) 
{ 
	int sum = 1; 
	
	for(int i=1;i<=n;i++)
	{
		sum=sum*i;
	}
	return sum; 
	} 
 int freq(int n) 
{ 
	return fact(2 * n)/(fact(n) * fact(n + 1)) ; 
} 
public static void main (String[] args) 
{
	PossibleBSTs obj=new PossibleBSTs();
	Scanner sc=new Scanner(System.in);
	String str=sc.next()+sc.nextLine();
	String str1[]=str.split(" ");
	int n=str1.length;
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
	 arr[i]=Integer.parseInt(str1[i]);
	}
	int i,j; 
	System.out.println("Output : ");
	for(i = 0; i < n; i++) 
	{ 
		int l = 0; 
		for(j = 0; j < n; j++) 
		{ 
			if (arr[j] < arr[i]) 
				l ++ ; 
		} 
		int BST1 = obj.freq(l) ; 
		int BST2 =obj. freq(n - l - 1) ; 
		int BST3 = BST1 * BST2 ; 
		System.out.print(BST3 + " ") ; 
	} 
} 
} 


