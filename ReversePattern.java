import java.io.*;
import java.util.*;

class ReversePattern {
	public static void main (String[] args) {
		System.out.println("enter input");
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int x=n-i;

	    for(int j=x;j>=1;j--)
	    {
	        System.out.print("$"+" ");
	    }
		System.out.println();
	    }
	}
}
