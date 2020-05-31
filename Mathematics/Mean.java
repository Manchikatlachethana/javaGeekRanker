/* code to find mean 
The first line of input contains an integer T denoting the number of test cases.
For each test case there will be two lines.
The first line contains the integer N denoting the number of students,
second line contains the N space seperated integrers denoting the marks of all the students.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class Mean
 {
	public static void main (String[] args)
	 {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int m[]=new int[n];
            for(int j=0;j<n;j++)
            {
                m[j]=sc.nextInt();
            }
            int mean=0;
            for(int z=0;z<n;z++)
            {
            mean=mean+m[z];
            }
            int a=mean/n;
            System.out.println(a);
        }
	 }
}


/* sample input:
3
4
56 67 30 79
4
78 89 67 76
5
90 100 78 89 67
sample ouput:
58
77
84
*/
