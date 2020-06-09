/*
prob:Write a Program to calculate the sum of n terms of a Geometric Progression when first term is a and common ratio is r.

Input: 
The first line of the input contains T denoting the number of testcases. 
The first line of the test case will be the number of terms of GP and second line contains first term and common ratio.

Output: 
For each test case the output will be the sum of n terms of GP.Print the answer upto 6 decimal places.
*/
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

/*
Input:
1
3
3 2

Output:
21.0
*/
