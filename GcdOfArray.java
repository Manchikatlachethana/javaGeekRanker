import java.util.*;
import java.lang.*;
import java.io.*;
class GcdOfArray
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++){
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int j=0;j<n;j++){
	        a[j]=sc.nextInt();
	    }
	    System.out.println(gcdArray(a,n));
	 }
	 }
	 
	public static int gcd(int a,int b){
	     if(a==0){
	         return b;
	     }
	     return gcd(b%a,a);
	 }
	 
	 public static int gcdArray(int a[],int n){
	     int res=a[0];
	     for(int i=0;i<n;i++){
	       res=gcd( a[i],res);
	       if(res==1){
	       return 1;
	        }
	     }
	     return res;
	 }
}
