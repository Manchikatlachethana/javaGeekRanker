/*
prob:Given an array A of size N, print second largest element from an array.
Input:
The first line of input contains an integer T denoting the number of test cases.
Each testcase contains two lines of input. 
The first line contains an integer N denoting the size of the array. 
The second line contains the N space seperated intgers of the array

Output:
For each testcase, in a new line, print the second largest element.
*/
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
/*
sample Input
2
5
89 24 75 11 23
6
56 42 21 23 65 20
sample Output
75
56
*/
