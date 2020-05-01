// code to reverse the given numbers in an array, by taking some test cases.

import java.lang.*;
import java.io.*;
class ReverseArray
 {
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();   // number of testcases
	    for(int i=0;i<t;i++)
	    {
	        long n=sc.nextLong();
	        long box=0;
	        long k=0;
	        while(n>0){
	        k=n%10;
	        box=box*10+k;
	        n=n/10;
	        }
	        System.out.println(box);
	        
	        
	    }
	 }
}

/* sample input
2
200
122
*/
/* sample output
2
221
*/
