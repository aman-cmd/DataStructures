public class MirrorTree{
	static Node root;
	static class Node{
		int data;
		Node left, right;
		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}
	MirrorTree(){
		root = null;
	}
	public static void main(String args[]) {
		MirrorTree mt = new MirrorTree();
		root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(20);
		root.left.left = new Node(30);
		root.left.right = new Node(40);
		root.right.left = new Node(40);
		root.right.right = new Node(30);
		System.out.println(checkMirror(root));
	}
	private static boolean checkMirror(Node root) {
		return check(root,root);
	}
	private static boolean check(Node a, Node b) {
		if(a==null&&b==null)
			return true;
		if(a!=null&&b!=null&&a.data==b.data)
			return(check(a.left,b.right)&&check(a.right,b.left));
		return false;
	}
}