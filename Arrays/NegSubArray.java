//Java Subarray
import java.io.*;
import java.util.*;

public class NegSubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int negArrCount = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int currSum = 0;
                for(int k=i; k<=j; k++){
                    currSum += arr[k]; 
                }
                if(currSum < 0){
                    negArrCount++;
                }
            }
        }
        System.out.println(negArrCount);
    }
}
/*
Sample Input

5
1 -2 4 -5 1
Sample Output

9
*/
