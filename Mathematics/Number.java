/*
prob:code to print the numbers and total count of numbers 
which are divisible by "n" valued number with in the given range..
*/

package git;

import java.util.*;

public class Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		System.out.println("enter range ");
		int range=sc.nextInt();
		int result=0;
		for(int i=1;i<=range;i++)
		{
			if(i%n==0) {
				System.out.println("number  divisible by : "+n+ " is "+i);
				result++;
			}
		}
		System.out.println("count is: "+result);

	}

}

/*sample input
enter any number
4
enter range 
20
*/

/* sample output
number  divisible by : 4 is 4
number  divisible by : 4 is 8
number  divisible by : 4 is 12
number  divisible by : 4 is 16
number  divisible by : 4 is 20
count is: 5
