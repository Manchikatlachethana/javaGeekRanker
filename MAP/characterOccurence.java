

import java.io.*;
import java.util.*;

class characterOccurence {
    public static boolean thrice(String s){
    HashMap<Character,Integer>map = new HashMap<Character,Integer>();
    
    for(int i=0;i<s.length();i++){
        
      if(!(map.containsKey(s.charAt(i)))){
          map.put(s.charAt(i),1);
      }
      else{
          map.put(s.charAt(i),map.get(s.charAt(i))+1);
      }
         
    } 
    System.out.println(map);
    
    
     if(map.containsValue(3)){
          return true;
      }
    return false;
    }
    
    
	public static void main (String[] args) {
	    System.out.println(thrice("checking thrice of character in a string"));
	}
}
