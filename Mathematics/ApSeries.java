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
