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
