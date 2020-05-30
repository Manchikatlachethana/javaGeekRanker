/*prob :convert all zeroes of N to 5.
Explanation:
ex:There are two zeroes in "1004", on replacing all zeroes with "5", the new number will be "1554".
*/

import java.util.*;

class ConvertToFive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
         ConvertToFive obj=new  ConvertToFive ();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(obj.convertfive(N));
            T--;
        }
    }
 int convertfive(int num) {
        String input=String.valueOf(num);
        input=input.replaceAll("0","5");
       return  Integer.valueOf(input);
        
 }
 }
 
 
