import java.util.Scanner;
class Node1
{
	int data;
	Node1 left;
	Node1 right;
	
	Node1(int d)
	{
		data=d;
		left=null;
		right=null;
	}
}

public class MaxHeight {
	
	
	
static Node1 root;
	
MaxHeight()
	{
	root=null;	
	}
	static void insert(int n)
	{
		
		
		root=insertItem(root,n);
		
	}
	static Node1 insertItem(Node1 r,int d)
	{
		if(r==null)
		{
			return (new Node1(d));
		}
		else
		{
			if(r.data>d)
				r.left=insertItem(r.left,d);
			else
				r.right=insertItem(r.right,d);
		}
		return r;
	}

	public static int height(Node1 r)
	{
		if(r==null)
			return -1;
		else
		{
			int lheight=height(r.left)+1;
			int rheight=height(r.right)+1;
			if(lheight>rheight)
				return lheight;
			else
				return rheight;
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter no of elements");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			insert(arr[i]);
		}
int h= height(root);
root = null;
for(int i=n-1;i>=0;i--)
{
	insert(arr[i]);
}
int h1= height(root);
if(h>h1)
	System.out.println(h);
else
	System.out.println(h1);
	}

}
