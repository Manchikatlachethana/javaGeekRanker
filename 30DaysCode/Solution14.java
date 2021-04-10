
//Finding the maximum difference value between two elements in an array.
/*

Sample Input:

STDIN   Function
-----   --------
3       __elements[] size N = 3
1 2 5   __elements = [1, 2, 5]

Sample Output:
4

Explanation:
The scope of the elements array and maximumDifference integer is the entire class instance. 
The class constructor saves the argument passed to the constructor as the elements instance variable (where the computeDifference method can access it).
To find the maximum difference, computeDifference checks each element in the array and finds the maximum difference between any 2 elements:
|1-2|=1
|1-5|=4
|2-5|=3
The maximum of these differences is 4.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    Difference(int[] carray)
    {
        for(int i=0;i<carray.length;i++)
        {
            elements[i]=carray[i];    
        }  
    }
    void computeDifference()
    {
        int max=elements[0];
        int min=elements[1];
        for(int i=0;i<elements.length;i++)
        {
            if(elements[i]>max)
            {
                max=elements[i];
            }
            else
            if(elements[i]<min)
            {
                min=elements[i];   
            }
        }   
        maximumDifference=max-min;
    }

} // End of Difference class

public class Solution14 {

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
