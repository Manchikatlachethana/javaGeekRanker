/*
-->Given an integer num, repeatedly add all its digits until 
   the result has only one digit, and return it.
Input: num = 38
Output: 2
Explanation
-------------
process:
      38 --> 3 + 8 --> 11
      11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
*/

import java.io.*;

class AddDigits {
	public static void main (String[] args) {
		System.out.println(addDigits(123));
		
	}
	public static int addDigits(int num) {
        if(num == 0){
            return 0;
        }
        if(num % 9 == 0)
            return 9;
        return num % 9;
    }
		
	}

