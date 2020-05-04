
/*
For a given 3 digit number, 
find whether it is armstrong number or not. 
An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. 
For example, 371 is an Armstrong number since 33 + 73 + 13 = 371
For each testcase, in a new line, print "Yes" if it is a armstrong number else print "No".
*/

import java.lang.*;
import java.io.*;
class Armstrong
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc=new Scanner(System.in);
	 int  t=sc.nextInt();
	 for(int i=0;i<t;i++)
	 {
	     int n=sc.nextInt();
	     int result=n;
	     int p=n%10;
	     n=n/10;
	     int q=n%10;
	     n=n/10;
	     int r=n%10;
	    int a=p*p*p+q*q*q+r*r*r;
	    if(result==a)
	    {
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	 }
	 }
}
/*sample input
1
371
sample output
Yes
