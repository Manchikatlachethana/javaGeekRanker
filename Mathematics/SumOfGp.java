import java.util.*;
import java.lang.*;
import java.io.*;
class SumOfGp
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++){
	    int n=sc.nextInt();
	     float a=sc.nextFloat();
	     float r=sc.nextFloat();
	    float res=0;
	     res=(a*((int)(Math.pow(r, n)))-1)/(r-1); 
	     System.out.println((double)(res));
	 }
	 }
}
