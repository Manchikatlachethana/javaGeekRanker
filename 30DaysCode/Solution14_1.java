//Simplified code for Solution14.java

/*
Sample Input

STDIN   Function
-----   --------
3       __elements[] size N = 3
1 2 5   __elements = [1, 2, 5]

Sample Output
4
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    //constructor
    public Difference(int[] elements){
        this.elements = elements;
    }

    /** Sorts the array
    *   Saves max abs difference between first and last element to maximumDifference. **/
    public void computeDifference(){
        Arrays.sort(elements);
        this.maximumDifference = Math.abs(elements[elements.length - 1] - elements[0]);
    }
}
    

public class Solution14_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
