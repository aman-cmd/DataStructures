import java.util.Scanner;

public class LCA{
	static Node root;
	static class Node{
		int key;
		Node left,right;
		public Node(int data) {
			this.key = data;
			left = right = null;
		}
	}
	public LCA() {
		root = null;
	}
	public LCA(int data) {
		root = new Node(data);
	}
	public static void insert(int data) {
		root = insertItem(root,data);
	}
	public static Node insertItem(Node root, int data) {
		if(root==null) {
			root = new Node(data);
			return root;
		}
		else if(data<root.key) {
			root.left = insertItem(root.left,data);
		}
		else if(data>root.key) {
			root.right = insertItem(root.right,data);
		}
		return root;
	}
	public static Node lowestCommonAncestor(int m,int n) {
		return lca(root,m,n);
	}
	
	public static Node lca(Node root, int m, int n) {
		if(root==null)
			return root;
		if(root.key==m||root.key==n) {
			return root;
		}
		Node left_lca = lca(root.left,m,n);
		Node right_lca = lca(root.right,m,n);
		if(left_lca!=null&&right_lca!=null) {
			return root;
		}
		if(left_lca==null)
			return right_lca;
		else
			return left_lca;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		LCA lca = new LCA();
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			insert(a);
		}
		int a = sc.nextInt();
		int b = sc.nextInt();
		Node x = lowestCommonAncestor(a,b);
		System.out.println(x.key);
	}
}