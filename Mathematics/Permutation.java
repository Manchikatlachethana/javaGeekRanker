/*
code  to calculate nPr value.
nPr represents n permutation r and value of nPr is (n!) / (n-r)!.
by taking some testcases "t".
*/


import java.lang.*;
import java.io.*;
class Permutation
 {
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
      System.out.println("enter number of testcases:");
	    int t= sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
      System.out.println("enter n and r value: ");
	        int n=sc.nextInt();
	        int num1=n;
	        int r=sc.nextInt();
	        long result=0;
	        long fact=1;
	        for(int j=num1;j>0;j--)
	        {
	            fact=fact*j;
	        }
	        int num2=n-r;
	        long f=1;
	        for(int k=num2;k>0;k--)
	        {
	            f=f*k;
	        }
	        result=fact/f;
	    System.out.println("value is: "+result);
	    }
	 }
}

/*sample input
enter number of testcases:
2
enter n and r value:
2 1
10 4

sample output
value is: 2
value is: 5040
*/
