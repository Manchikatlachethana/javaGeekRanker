package git;
import java.util.*;


public class Strings2 {
	
	
	
	public static int getFrequency(String []arr,String key){
		
		int count=0;
		for(int i=0;i<arr.length;i++){
		if(arr[i].equals(key)){
		count++;
		}
		}
		return count;
		
		
	}
	public static void main(String[] args) {
		
		String []arr= {"hi","hi","hello","bye","hello","hi"};
		
		int max=0;
		String maxKey="";
		for(int i=0;i<arr.length;i++) {			
			int keyCount=getFrequency(arr, arr[i]);
			if(max<keyCount) {
				max=keyCount;
				maxKey=arr[i];
			}
		}
		System.out.println("key is "+maxKey+" value is "+max);

	}

}
          
/*sample output
key is hi value is 3
*/
