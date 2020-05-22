import java.util.*;
import java.lang.*;
import java.io.*;
class Prime
 {
     public static boolean isPrime(int n){
         if(n%2==0){
             return false;
         }
             for(int i=3;i<=Math.sqrt(n);i+=2){
                if(n%i==0){
                    return false;
                } 
             }
             return true;
     }

	public static void main (String[] args){
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++){
	     int n=sc.nextInt();
	     if(isPrime(n)){
	         System.out.println("Yes");
	     }
	     else{
	        System.out.println("No"); 
	     }
	     
	 }
	}
 }
 
 /* sample input
 1
5
sample output
Yes
*/
	 
