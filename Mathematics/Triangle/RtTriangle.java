/*
Calculate the area of right angled triangle.

Input:
The first line of the input contains T denoting the number of testcases. 
Each testcase contains 2 space separated positive integers denoting t base of right angled triangle, perpendicular of right angled triangle .

Output:
For each testcase, output a single line containing  area of right angled triangle.

*/
import java.util.*;
import java.lang.*;
import java.io.*;
class RtTriangle
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++){
	  int base=sc.nextInt();
	  int per=sc.nextInt();
	  int rtarea=(base*per)/2;
	  System.out.println(rtarea);   
	 }
	 }
}
/*
Input:
1
54 12
Output:
324
*/
