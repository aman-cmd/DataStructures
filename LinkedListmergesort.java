import java.util.*;
public class Amazon{
	static LinkedList<Integer> result = new LinkedList<Integer>();
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of LL : ");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++) {
			String str = sc.nextLine();
			if(str.length()==0) {continue;}  /*ignore*/
			char[] arr = str.toCharArray();
			str = "";
			for(int j=0;j<arr.length-1;j++) {
				if(!(arr[j]==' '&&arr[j+1]==' ')) {
					str += arr[j];
				}
			}
			if(arr[arr.length-1]!=' ') {
				str += arr[arr.length-1];
			}
			String[] strarr = str.split(" ");
			addToList(strarr);
		}
		System.out.println(result);
	}
	private static void addToList(String[] strarr) {
		for(int i=0;i<strarr.length;i++) {
			int value = Integer.parseInt(strarr[i]);
			if(result.size()==0) {
				result.add(value);
			}
			else if(result.size()==1) {
				int index = (result.get(0)<=value) ? 1 : 0;
				result.add(index, value);
			}
			else if(result.size()>=2) {
				if(value<=result.get(0)) {
					result.add(0, value);
					continue;
				}
				for(int j=0;j<result.size();j++) {
					if(j==result.size()-1) {
						result.add(value);
						break;
					}
					if(result.get(j)<=value&&result.get(j+1)>=value) {
						result.add(j+1,value);
						break;
					}
				}
			}
		}
	}
}