/*
Calculate the area of  circle.

Input:
The first line of the input contains T denoting the number of testcases. 
Each testcase contains radius of circle .

Output:
For each testcase, output a single line containing  area of circle .
Note: We need to print the floor values of the areas. Also take value of pi = 3.14
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Circle
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++){
	    double rad=sc.nextDouble();
	    double circlearea=3.14*rad*rad;
	    int carea=(int)circlearea;
	    System.out.println(carea);
	     
	 }
	 }
}
/*
SampleInput:
1
52
SampleOutput:
8490
*/
