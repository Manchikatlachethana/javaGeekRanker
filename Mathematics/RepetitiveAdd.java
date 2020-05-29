/* 
prob: addiing  digits repeatedly until its single digit!
if we conisder 98, we get 9+8  = 17 after first addition. 
Then we get 1+7 = 8. 
We stop at this point because we are left with one digit.

*/

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

/* sample input
2
1
98
sample output
1
8
*/
