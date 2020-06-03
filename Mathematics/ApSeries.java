/*
prob:Given the first 2 terms A and B of an Arithmetic Series, tell the Nth term of the series. 
Input:The first line of input contains an integer, the number of test cases T.
Each testcase in its first line should contain two positive integer A and B(First 2 terms of AP). 
In the second line of every testcase it contains of an integer N.
output:
For each testcase, in a new line, print the Nth term of the Arithmetic Progression.
hint: use APSeries formula for finding nh term : x=a+(n-1)d
d=(t2-t1),a=first term.
*/

import java.lang.*;
import java.io.*;
class ApSeries
 {
	public static void main (String[] args)
	 {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int q=sc.nextInt();
            int w=sc.nextInt();
            int n=sc.nextInt();
            int d=w-q;
            int result=0;
            result=q+(n-1)*d;
            System.out.println(result);
        }
	 }
}

/* sample Input:
2
2 3
4
1 2
10

sample Output:
5
10
*/
