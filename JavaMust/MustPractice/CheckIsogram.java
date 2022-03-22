//wap to check if string is isogram or not?
//The isogram is a string where the occurrence of each letter is exactly one.

import java.util.HashSet;
import java.util.Set;


public class CheckIsogram {
    public static void main(String[] args) {
        System.out.println(check("code"));
    }
    public static boolean check(String s){
        char [] ch = s.toCharArray();
        Set<Character> chset = new HashSet<Character>();
        for(Character c:ch){
            if(chset.contains(c)){
                return false;
            }else{
                chset.add(c);
            }
        }
        return true;
    }
}
