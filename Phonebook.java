import java.util.HashMap;
import java.util.Scanner;

public class Phonebook{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashMap hm = new HashMap();
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			String name = sc.next();
			long number = sc.nextLong();
			hm.put(name, number);
		}
		while(sc.hasNext()) {
			String query = sc.nextLine();
			if(hm.get(query)!=null) {
				System.out.println(query+" : "+hm.get(query));
			}
			else {
				System.out.println("Not found");
			}
		}
	}
}