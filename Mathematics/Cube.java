/*
Consider cubic dice with 6 faces. 
All the individual faces have a number printed on them. 
The numbers are in the range of 1 to 6, like any ordinary dice. 
You will be provided with a face of this cube, your task is to guess the number on the opposite face of the cube.
*/

import java.lang.*;
import java.io.*;
class Cube
 {
	public static void main (String[] args)
	 {
	Scanner sc=new Scanner(System.in);
  System.out.println("enter number of testcases: ");
	int t=sc.nextInt();  //testcase "t"
	for(int i=0;i<t;i++)
	{
  System.out.println("enter the side of cube: ");
	    int CubeSide=sc.nextInt();
	    int oppositeSide=0;
	    /*
	    1 6
	    2 5
	    3 4
	    4 3
	    5 2
	    6 1
	    */
	    
	    oppositeSide=7-a;
	    System.out.println("The opposite side of : "+CubeSide+"is: "+oppositeSide);
	}
	 }
}

/* sample input
enter number of testcases:
2
enter the side of cube:
6
2

sample output
1
5
