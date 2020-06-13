/*
prob:Calculate the area of rectangle
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Rectangle
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++){
	     int l=sc.nextInt();
	     int b=sc.nextInt();
	     
	     System.out.println(l*b);
	 }
	 }
}
/*
1
32 32 
Output:
1024 
*/
