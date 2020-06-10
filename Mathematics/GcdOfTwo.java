/*
prob:Given two numbers A and B. 
Find the GCD of those 2 numbers.

Input:
The first line of input contains an integer T denoting the number of test cases. 
Each test case contains two space separated integers A and B.

Output:
For each testcase, in a new line, print the GCD of the two numbers.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class GcdOfTwo
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++){
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     System.out.println(gcd(a,b));
	 }
	 }
	 public static int gcd(int a,int b){
	     if(b==0)
	     {
	         return a;
	     }
	   return gcd(b,a%b);
	 }
}
/*
SampleInput:
2
98 56
48 18

SampleOutput:
14
6
*/
