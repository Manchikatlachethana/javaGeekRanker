/*
Swap given two numbers and print them. (Try to do it without a temporary variable.)
considering the number of test cases 'T'. Each test case should contain two positive numbers a and b.

import java.lang.*;
import java.io.*;
class Swapping
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
   System.out.println("enter number of tescases: ");
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++)
	 {
   System.out.println("enter a and b values: ");
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     a=a+b;
	     b=a-b;
	     a=a-b;
	     System.out.print(a+" "+ b);
	    System.out.println();
	 }
	 }
}

/* sample input
enter number of tescases:
2
enter a and b values:
20 30
12 32

sample output
30 20
32 12
*/
