/*
prob:Given length l, width b and height h of a cuboid. 
Find the total surface area and volume of cuboid.

Input:
The first line of the input contains T, denoting the number of testcases. 
Each of the next T lines contains three space separated positive integers l, b, h
denoting the length, width and height of cuboid in same line separated by space.

Output:
For each testcase in new line, output two space separated integers denoting surface area and volume of cuboid.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Cuboid
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++){
	    int l=sc.nextInt();
	    int b=sc.nextInt();
	    int h=sc.nextInt();
	    int area=0;
	     area=l*b*h;
	     int surface=0;
	     surface=(2 * l * b + 2 * b * h + 2 * l * h);
	     System.out.println(surface+" "+area);
	     
	     
	 }
	 
	 }
}

/*
Input:
1
1 2 3

Output:
22 6
*/
