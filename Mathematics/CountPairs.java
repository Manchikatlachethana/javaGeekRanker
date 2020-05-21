package git;

public class CountPairs {
	
	public static void findPairs(int []arr,int sum) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum)
				{
					count++;
				}
			}
		}
		System.out.println("no of pairs for sum " +sum+ " is: "+count);
		
	}

	public static void main(String[] args) {
		
		int []arr= {3,1,4,9,5,6,2};
		findPairs(arr,6);
		

	}

}

/*sample output:
no of pairs for sum 6 is: 2
*/
