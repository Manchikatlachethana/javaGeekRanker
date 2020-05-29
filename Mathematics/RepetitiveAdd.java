import java.lang.*;
import java.io.*;
class RepetitiveAdd
 {
     public static int add(int n){
         if(n<=9){
           return n;  
         }
         else{
             int sum=0;
             while(n>0){
                 sum=sum+(n%10);
                 n=n/10;
             }
             return add(sum);
         }
     }
	public static void main (String[] args){
	
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0){
	     int n=sc.nextInt();
	     System.out.println(add(n));
	 }
	 
	 }
}
