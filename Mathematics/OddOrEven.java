/*
prob:Given a positive integer determine whether it is odd or even.
Input:
First line contains an integer T, the number of test cases. Each test case contains a positive integer N.

Output:
In each seperate line print "odd" if odd and "even" if even.
*/
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

/*
sample Input:
1
23

sample Output:
odd
*/
