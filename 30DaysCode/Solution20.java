/* Given an array "a" , of size n distinct elements, sort the array in ascending order using the Bubble Sort algorithm.
Once sorted, print the following  lines:

Array is sorted in numSwaps swaps.
where numSwaps is the number of swaps that took place.
First Element: firstElement
where firstelement is the first element in the sorted array.
Last Element: lastElement
where lastElement is the last element in the sorted array.

Sample Input:
3
1 2 3

Sample Output :
Array is sorted in 0 swaps.
First Element: 1
Last Element: 3

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
   
        int numberOfSwaps=0;
        int temp=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    numberOfSwaps++;
                }
            }
            if(numberOfSwaps==0){
                break;
            }
            
        }
        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
        
    }
    
}
