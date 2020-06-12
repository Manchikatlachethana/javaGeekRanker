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
