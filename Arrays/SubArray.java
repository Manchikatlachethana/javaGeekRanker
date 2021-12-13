//prinitng all sub arrays.
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+",");
                }
                System.out.println();
            }
        }
    }
}
/*
Input (stdin)
5
1 -2 4 -5 1

Your Output (stdout)
1,
1,-2,
1,-2,4,
1,-2,4,-5,
1,-2,4,-5,1,
-2,
-2,4,
-2,4,-5,
-2,4,-5,1,
4,
4,-5,
4,-5,1,
-5,
-5,1,
1,
*/
