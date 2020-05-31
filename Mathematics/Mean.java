// code to find mean

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
