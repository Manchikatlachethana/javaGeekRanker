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
	               
