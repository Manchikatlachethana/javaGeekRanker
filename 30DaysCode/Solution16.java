//Code to Read a string, S, and print its integer value , if  S cannot be converted to an integer, print Bad String.
//Using exception concepts.
/*
Sample Input 0
-----------
3
Sample Output 0
--------------
3
Sample Input 1
--------------
za

Sample Output 1
---------------
Bad String
*/
import java.io.*;
import java.util.*;

public class Solution16 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
    try{
        int value=Integer.parseInt(S);
        System.out.println(value);
        
    }
    catch(Exception e){
        System.out.println("Bad String");
    }
        bufferedReader.close();
    }
}
