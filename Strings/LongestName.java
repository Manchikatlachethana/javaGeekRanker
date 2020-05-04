/*Given a list of names, display the longest name.
*/

import java.lang.*;
import java.io.*;
class LongestName
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
   System.out.println("enter testcaes:");
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++)
	 {
    System.out.println("enter size:");
	     int n=sc.nextInt();
	     sc.nextLine();
	     String s[]=new String[n];
	     for(int q=0;q<n;q++)
	     {
	         s[q]=sc.nextLine();
	     }
	     
	     int max=0;//max
	     int mi=-1;//max index
	     for(int w=0;w<n;w++)
	     {
	         if(s[w].length()>max){
	             max=s[w].length();
	             mi=w;
	         }
	         
	     }
	     System.out.println(s[mi]);
	 }
	 }
}

/* sample input
enter testcaes:
1
enter size:
5
Geek
Geeks
Geeksfor
GeeksforGeek
GeeksforGeeks

sample output
GeeksforGeeks
*/
