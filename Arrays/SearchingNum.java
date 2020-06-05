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
