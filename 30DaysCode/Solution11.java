/*
Code to Calculate the hourglass sum for every hourglass in A matrix, then print the maximum hourglass sum.

Constraints
-----------
-9<=A[i][j]<=9
0<=i,j<=6

Sample Input:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output
19

Explanation:
The hourglass with the maximum sum () is:

2 4 4
  2
1 2 4

*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution11 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
              arr[i][j]=scanner.nextInt(); 
            }
            
        }
        int sum=0;
        int maxsum=-63;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
            if(sum>maxsum){
                maxsum=sum;
            }    
            }
            
        }
        System.out.println(maxsum);
        
        scanner.close();
    }
}
