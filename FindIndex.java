/* code to find index of required  array element
using some testcases "t".
*/

import java.lang.*;
import java.io.*;
class FindIndex
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
   System.out.println("enter number of testcases: ");
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++)
	 {
   System.out.println("enter size of array: ");
	     int n=sc.nextInt();
       System.out.println("enter array elements: ");
	     int arr[]=new int[n];
	     for(int j=0;j<n;j++)
	     {
	         arr[j]=sc.nextInt();
	     }
       System.out.println("enter key elemnt: ");
	     int key=sc.nextInt();
	     int index=-10;
	     for(int w=0;w<n;w++)
	     {
	       if(key==arr[w])
	       {
	         index=w;
	         break; 
	       }
	     }
	     if(index!=-10)
	     {
	      System.out.print(index+" ");
	     }
	     else
	     {
	         System.out.println(-1);
	     }
	     
	     for(int q=n-1;q>=0;q--){
	         if(key==arr[q])
	         {
	             index=q;
	             break;
	         }
	     }
	     if(index!=-10)
	     {
	      System.out.println("index is:"+index);
	     }
	     else
	     {
	         System.out.println(-1);
	     }
	 }
	 
	 }
}

/* sample input
enter number of testcases:
2
enter size of array:
6
enter array elements:
1 2 3 4 5 5
5
6
6 5 4 3 1 2
4
sample output
index is:
4 5
2 2
