// code to print floyds triangle by taking some testcases..

import java.io.*
class FloydTriangle
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++)
	 {
	     int row=sc.nextInt();
	     int q=1;
	   for(int j=1;j<=row;j++)
	   {
	       int x=j;
	       for(int a=1;a<=x;a++)
	       {
	           
	           System.out.print(q+" ");
	           q++;
	       }
	       System.out.println();
	       
	   }
	 }
	 }
}

/* sample input
2
4
5
*/

/* sample output
1
2 3
4 5 6
7 8 9 10
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/
