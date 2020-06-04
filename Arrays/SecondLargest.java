import java.lang.*;
import java.io.*;
class SecondLargest
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
	    int max=a[0];
	    int smax = a[1];
	    for(int k=1;k<n;k++){
	        if(a[k]>max){
	            smax=max;
	            max=a[k];
	        }
	        else if(smax<a[k] && a[k]!=max){
	            smax = a[k];
	        }
	    }
	    System.out.println(smax);
	    
	 }
	 
	 }
}
