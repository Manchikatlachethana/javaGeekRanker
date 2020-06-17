/*
prob: print facoial of given number.
considering some test cases "t".
*/

import java.lang.*;
import java.io.*;
class Factorial
 {
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
      System.out.println("enter number of testcases: ");
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
      System.out.println("enter any number: ");
	        int n=sc.nextInt();
	        long fact=1;
	        for(int j=1;j<=n;j++)
	        {
	            fact=fact*j;
	        }
	        System.out.println("factorial of "+n+" is: "+fact);
	    }
	 }
}

/* sample input
enter number of testcases: 
1
enter any number:
5
sample output
factorial of 5 is:
120
*/
