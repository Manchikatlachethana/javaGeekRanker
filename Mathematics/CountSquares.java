/*
Given a sample space S consisting of all perfect squares starting from 1, 4, 9 and so on.
You are given a number N, you have to print the number of integers less than N in the sample space S.
The first line contains an integer T, denoting the number of test cases to be taken.
*/

import java.lang.*;
import java.io.*;
class CountSquares
 {
	public static void main (String[] args)
	 {
	
	 Scanner sc=new Scanner(System.in);
   System.out.println("enter number of testcases:" );
	 int t=sc.nextInt();
	 for(int j=0;j<t;j++)
	 {
   System.out.println("enter number to check its squares:" );
	     long n=sc.nextLong();
	     long i=0;
	     for(i=1;i<n;i++)
	     {
	         
	         long q=i*i;
	         if(q>=n)
	         {
	             break;
	         }
	     }
	     long w=i-1;
	     System.out.println("given number has "+w+"squares");
	 }
	 }
}

/* sample input
enter number of testcases:
2
enter number to check its squares:
9
3
sample output
given number has 2 squares
 given number has 1 squares
*/
