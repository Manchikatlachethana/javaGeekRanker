package git;
import java.util.*;

public class SolutionDay10 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int n=sc.nextInt();
		System.out.println("Decimal number "+n+" will be converted to binary...0's and 1's ");
		System.out.println("the consecutive numbers of 1's in " +n+ "is ");
		int onescount=0;
		int consecutivecount=0;
		while(n>0) 
		{
			if(n%2==1)
			{
				onescount++;
				
				if(onescount>=consecutivecount) 
				{
					consecutivecount=onescount;
				}
			}
			else
			{
				onescount=0;
			}
			n=n/2;
		}
		
		System.out.println(consecutivecount);

	}

}

/* sample input:
Enter a decimal number:
20

sample output:
Decimal number 20 will be converted to binary...0's and 1's 
the consecutive numbers of 1's in 20 is 
1
*/
