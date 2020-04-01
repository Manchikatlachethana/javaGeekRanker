/*multiplication  of two marices */

import java.io.*;
import java.util.*;

class MulMatrix{
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    //int testcase=sc.nextInt();
	    int m=sc.nextInt();
	    int n=sc.nextInt();
	    int a[][]=new int[m][n];
	    
	   for(int i=0;i<m;i++)
	   {
	       for(int j=0;j<n;j++)
	       {
	           a[i][j]=sc.nextInt();
	       }
	   }
	   int m1=sc.nextInt();
	   int n1=sc.nextInt();
	   int b[][]=new int[m1][n1];
	   for(int i=0;i<m1;i++)
	   {
	       for(int j=0;j<n1;j++)
	       {
	           b[i][j]=sc.nextInt();
	       }
	   }
	   int c[][]=new int[m][n1];
	   for(int r=0;r<m;r++)
	   {
	       for(int co=0;co<n1;co++)
	       {
	           for(int k=0;k<n;k++)
	           {
	               c[r][co]=c[r][co]+a[r][k]*b[k][co];
	           }
	       }
	   }
	           for(int i=0;i<m;i++)
	           {
	               for(int j=0;j<n1;j++)
	               {
	                   System.out.print(c[i][j]+" ");
	               }
	               System.out.println();
	           }
	}
}
