package git;

public class MoveZeros {
	
	public static void  moveZerosToEnd(int []arr,int n) {
		
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
			while(count<n) 
				arr[count++]=0;
			
		
	}

	public static void main(String[] args) {
		
		int []arr= {1,3,0,2,0,3,4,0,0,7};
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("ARRAY AFTER PUSHING ZEROS TO END:");
		
		moveZerosToEnd(arr,n);

		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}

/*sample output
1 3 0 2 0 3 4 0 0 7 
ARRAY AFTER PUSHING ZEROS TO END:
1 3 2 3 4 7 0 0 0 0 
*/
