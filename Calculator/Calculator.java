
// code which is used to perform Arithematic operations just like a calculator..
/*
 *  @CHETHANA
 */

package git;

import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("choose the arithematic operations which are to be performed");
	System.out.println("1.addition of wo numbers");
	System.out.println("2.subtraction of wo numbers");
	System.out.println("3.multiplicaion of wo numbers");
	System.out.println("4.division of wo numbers");
	System.out.println("5.modulo of wo numbers");
	System.out.println("enter choice (from 1 to 5):");
	int choice=sc.nextInt();
	System.out.print("enter a value:");
	int a=sc.nextInt();
	System.out.println("enter b value:");
	int b=sc.nextInt();
	
	switch(choice) {
	case 1:
		System.out.println("Addition of "+a+" , " +b+" is: "+(a+b));
		break;
	case 2:
		System.out.println("subtraction of "+a +" , "+b+"is: "+(a-b));
		break;
	case 3:
		System.out.println("multiplicaion of "+a+" , " +b+"is: "+(a*b));
		break;
	case 4:
		System.out.println("division of "+a +" , "+b+"is: "+a/b);
		break;
	case 5:
		System.out.println("modulo of "+a +" , "+b+"is: "+a%b);
		break;
	}

	}

}

/* sample input:
choose the arithematic operations which are to be performed
1.addition of wo numbers
2.subtraction of wo numbers
3.multiplicaion of wo numbers
4.division of wo numbers
5.modulo of wo numbers
enter choice (from 1 to 5):
4
enter a value:1
enter b value:
2
*/

/* sample output:

division of 1 , 2is: 0
*/
