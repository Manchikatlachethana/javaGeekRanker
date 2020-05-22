package git;

public class Strings {
	
	
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
		
		String []arr= {"hi","hello","hi","hello"};
		String key="hi";
		
		System.out.println("number of repeated "+key+" elements ");
		System.out.println(getFrequency(arr, key));
		

	}

}

/*sample output
number of repeated hi elements 
2
*/
                                                                                                                                   
