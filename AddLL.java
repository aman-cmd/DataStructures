
public class AddLL{
	static Node head1;
	static Node head2;
	public class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
	public AddLL insert1(AddLL li,int data)
	{
		Node n1 =new Node(data);
		if(li.head1==null)
		{
			li.head1 = n1;
		}
		else
		{
			Node last = li.head1;
			while(last.next!=null)
			{
				last = last.next;
			}
			last.next = n1;
		}
		return li;
	}
	public AddLL insert2(AddLL li,int data)
	{
		Node n1 =new Node(data);
		if(li.head2==null)
		{
			li.head2 = n1;
		}
		else
		{
			Node last = li.head2;
			while(last.next!=null)
			{
				last = last.next;
			}
			last.next = n1;
		}
		return li;
	}
	public static void display(AddLL li)
	{
		Node current = li.head1;
		while(current.next!=null)
		{
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.print(current.data+"\n");
	}
	public static void add(AddLL l1, AddLL l2) {
		Node current1 = l1.head1;
		Node current2 = l2.head2;
		//System.out.println(current1.data+" "+current2.data);
		int carry = 0;
		while(current1!=null) {
			//System.out.println(current1.data+" "+current2.data);
			current1.data = current1.data + current2.data + carry;
			//System.out.println(current1.data);
			carry = current1.data / 10;
			current1.data%=10;
			current1 = current1.next;
			current2 = current2.next;
		}
		if(carry!=0) {
			current1 = l1.new Node(carry);
		}
		
	}
	public static void main(String args[]) {
		AddLL l1 = new AddLL();
		AddLL l2 = new AddLL();
		l1.insert1(l1, 1);
		l1.insert1(l1, 2);
		l1.insert1(l1, 3);
		
		l2.insert2(l2, 4);
		l2.insert2(l2, 5);
		l2.insert2(l2, 6);
		
		l1.display(l1);
		add(l1,l2);
		l1.display(l1);
		//l2.display(l2);
		
	}
}