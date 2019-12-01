public class LeftView{
	static Node root;
	static class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	public LeftView() {
		root = null;
	}
	public static int height(Node root) {
		if(root==null)
			return -1;
		else {
			int lefth = height(root.left) + 1;
			int righth = height(root.right) + 1;
			if(lefth>righth)
				return lefth;
			else
				return righth;
		}
	}
	static int m = 0;
	public static void print(Node root,int l) {
		if(root==null)
			return;
		if(m<l) {
			System.out.print(root.data+" ");
			m = l;
		}
		print(root.left,l+1);
		print(root.right,l+1);
	}
	public static void main(String args[]) {
		LeftView lv = new LeftView();
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.right = new Node(6);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(7);
		root.left.right.left.right = new Node(8);
		print(root,1);
	}
}