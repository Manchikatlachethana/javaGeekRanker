import java.io.*;
import java.util.*;

class StackDemo {
	public static void main (String[] args) {
		Stack<String> s = new Stack<String>(); 
		s.push("Welcome"); 
        s.push("To"); 
        s.push("GitHub"); 
        System.out.println(" Stack elemens are : " + s); 
        System.out.println("The element at the top of the stack is: " + s.peek()); 
        System.out.println("Popped element: " + s.pop()); 
        System.out.println(" Remaining Stack elemens are : " + s); 
        System.out.println("Is the stack empty? " +s.empty()); 
        System.out.print("Does the stack contain To element? ");
        System.out.println("element is at "+s.search("To")); 
        
        
	}
}

/*sample output
Stack elemens are : [Welcome, To, GitHub]
The element at the top of the stack is: GitHub
Popped element: GitHub
 Remaining Stack elemens are : [Welcome, To]
Is the stack empty? false
Does the stack contain To element? element is at 1
*/
