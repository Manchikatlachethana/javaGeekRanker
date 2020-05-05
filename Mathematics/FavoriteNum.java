
/*
You are given an integer input N and you have to find whether it is Alexa’s favourite or not.

If it is then print “YES” else print “NO”.
A number is Alexa's favourite if it is either the sum or the difference of the integer 5. 
(5+5, 5+5+5, 5-5,5-5-5+5+5…..)
consider some test cases.
For each test case , the output is in a new line containg the answer 'YES' or 'NO'
depending on whether the given number N is Alexa's favourite or not .
*/

import java.lang.*;
import java.io.*;
class FavoriteNum
 {
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of test cases: ");
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++)
	    {
      System.out.println("enter the number: ");
	        int a=sc.nextInt();
	        if(a%10==0||a%10==5||a%10==-5)
	        {
	            System.out.println("YES it is Alexa's favourite number");
	        }
	        else
	        {
	        System.out.println("NO it is not Alexa's favourite number");
	        }    
	    }
	 }
}

/* sample input
enter the number of test cases:
2
enter the number:
-255
389

sample output
YES it is Alexa's favourite number
NO it is not Alexa's favourite number

*/
