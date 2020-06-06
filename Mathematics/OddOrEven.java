import java.lang.*;
import java.io.*;
class OddOrEven
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++)
	 {
	     int n=sc.nextInt();
	        int x=n;
	        if(x%2==0){
	            System.out.println("even");
	        }else{
	            System.out.println("odd");
	        }
	 }
	 }
}
