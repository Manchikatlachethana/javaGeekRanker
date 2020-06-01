/* 
prob:Print the table of a given number N. 
Input:
First line contains an integer, the number of test cases 'T'. 
Each testcase cotains one line of input denoting N.
Output:
For each testcase, print the table of N upto 10.
*/
import java.lang.*;
import java.io.*;
class PrintTable
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++)
	 {
	    int n=sc.nextInt();
	    for(int j=1;j<=10;j++)
	    {
	        System.out.print(n*j+" ");
	    }
	    System.out.println();
	 }
	 }
}

/* sample Input:
1
9 
sample ouput:
9 18 27 36 45 54 63 72 81 90
*/
