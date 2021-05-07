#code to check a string is a palindrome or not!
  
/*
Sample Input
----------
racecar

Sample Output
--------------
The word, racecar, is a palindrome.
*/
  
import java.io.*;
import java.util.*;

public class Solution {
    
    Stack<Character> sc=new Stack<>();
    Queue<Character> qc=new LinkedList<>();
    void pushCharacter(char ch){
      sc.push(ch);  
    }
    void enqueueCharacter(char ch){
       qc.add(ch);  
    }
    char popCharacter(){
       return sc.pop(); 
    }
    char dequeueCharacter(){
        return qc.remove();
    }
     

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
