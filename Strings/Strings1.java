package git;
import java.util.*;


public class Strings1 {
	
	
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
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("key is "+arr[i]+" value is "+getFrequency(arr,arr[i]));
		}

	}

}
                                                                                                                                   
/*
key is hi value is 3
key is hi value is 3
key is hello value is 2
key is bye value is 1
key is hello value is 2
key is hi value is 3
*/
