import java.util.*;
import java.lang.*;
import java.io.*;
class GreatestNum
 {
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
	        int a[]=new int[3];
	        for(int j=0;j<a.length;j++)
	        {
	            a[j]=sc.nextInt();
	        }
	        int max=0;
	        for(int z=0;z<a.length;z++)
	        {
	        if(a[z]>max)
	        {
	            max=a[z];
	        }
	        }
	            System.out.println(max);
	    }
	 }
}
