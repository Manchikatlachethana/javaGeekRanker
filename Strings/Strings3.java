package git;
import java.util.*;


public class Strings3 {
	
	public static void main(String[] args) {
		
		String []arr= {"hi","hi","hello","bye","hello","hi"};
		Map<String,Integer>keystr=new HashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++) {	
			if(!keystr.containsKey(arr[i])) {
				keystr.put(arr[i],1);
			}
			else {
				int count=keystr.get(arr[i]);
				count++;
				keystr.put(arr[i],count);
			}
			
		}
		System.out.println(keystr);

	}

}

/*sample output
{hi=3, hello=2, bye=1}
*/
                                                                                                                                   
