/*
prob: find  the  compund interest for given principal amount P , 
time T(in years), compounds N times in a year at rate R. 
Calculate floor of future value of given principal amount.
First line contains an integer, the number of test cases 'T'.  
Each test case should contain three values P, T, N, R.
*/
import java.lang.*;
import java.io.*;

class CompoundInterest
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	  for(int i=0;i<t;i++)
	  {
	    int p=sc.nextInt();
	    int tm=sc.nextInt();
	    int n=sc.nextInt();
	    int r=sc.nextInt();
	    int q=n*tm;
	  
	   double r1 = (double)r/100;
	   double z = 1+r1/n;
	   z = Math.pow(z,q);
	   z = z*p;
	   System.out.println((int)z);
	  }
	 }
 }	 

/* sample Input:
1
1000
2
2
10

sample Output:
1215     //instead of 1215.51
*/
