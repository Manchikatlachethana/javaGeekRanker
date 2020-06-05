/* 
prob:Given an array of N elements and a integer K.
Your task is to return the position of first occurence of K in the given array.
Note: Position of first element is considered as 1.
Input:
First line of input contains T denoting the number of testcases. 
For each testcase there will be two space separated integer N and K denoting the size of array and the value of K respectively. 
The next line contains the N space separated integers denoting the elements of array.

Output:
For each test case, print the index of first occurrence of given number K. 
Prints -1 if the number is not found in array.

*/
import java.lang.*;
import java.io.*;
class SearchingNum
 {
	public static void main (String[] args) throws IOException
	 {
	 //Scanner sc=new Scanner(System.in);
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 	 int t=sc.nextInt();
    int t = Integer.parseInt(br.readLine());
	 for(int i=0;i<t;i++)
	 {
	     String [] inputs = br.readLine().split("\\s");
	   //  int n=sc.nextInt();//size of array
	   //  int k=sc.nextInt();//search element
	    int n = Integer.parseInt(inputs[0]);   
	    int k = Integer.parseInt(inputs[1]);   
	    inputs= br.readLine().split("\\s");
	     int a[]=new int[n];
	     for(int j=0;j<n;j++)
	     {
	       //  a[j]=sc.nextInt();
	       a[j] = Integer.parseInt(inputs[j]);   
	     }
	     int res=-1;
	     for(int q=0;q<n;q++)
	     {
	         if(k==a[q]){
	             res=q;
	             break;
	         }
	     }
	     if(res!=-1){
	         res++;
	     }
	     System.out.println(res);
	 }
	 }
}

/* 
sample Input :
2 
5 16
9 7 2 16 4
7 98
1 22 57 47 34 18 66

sample Output : 
4
-1
*/
