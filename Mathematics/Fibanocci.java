import java.util.*;
import java.lang.*;
import java.io.*;
class Fibanocci
 {
    
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt();
	        long a=0,b=1,c;
	        
	        for(int j=0;j<n;j++){
	        c=a+b;
	        a=b;
	        b=c;
	        System.out.print(a+" ");
	        }
	     System.out.println();
	    }
	 }
}

/* sample input
2
7
5

sample ouput
1 1 2 3 5 8 13
1 1 2 3 5
*/
