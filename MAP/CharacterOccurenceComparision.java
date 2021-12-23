/* Given a string check the occurence of the characterin the string  is greater than 1  */

import java.io.*;
import java.util.*;

class CharacterOccurenceComparision {
    public static boolean characterCount(String str){
       Map<Character,Integer> m = new HashMap<>();
       for(int i=0;i<str.length();i++){
          if(m.containsKey(str.charAt(i))){
            m.put(str.charAt(i),m.get(str.charAt(i))+1);
          
            }
           else{
               m.put(str.charAt(i),1);
           }
       }
       System.out.println(m);
       for(Map.Entry<Character,Integer> e:m.entrySet()){
           
           if(e.getValue()>1){
               return true;
           }
           
       }

        
      return false;  
    }
	public static void main (String[] args) {
		String s = "welcome to github";
		System.out.println(characterCount(s));
		
	}
}

/*
OUTPUT
-------
{ =2, b=1, c=1, e=2, g=1, h=1, i=1, l=1, m=1, o=2, t=2, u=1, w=1}
true
*/
