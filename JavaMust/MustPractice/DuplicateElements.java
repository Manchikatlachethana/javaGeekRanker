package MustPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        String [] lang = {"c", "c++", "java", "python" , "javascript", "php" , "java"};
        Set<String> nondup = new HashSet<>();
//        for(String s:lang){
//            if(!nondup.contains(s)){
//                nondup.add(s);
//            }
//            else{
//                System.out.println(s);
//            }
//        }

        for(String s:lang){
            if(nondup.add(s) == false){
                System.out.println(s);
            }
        }
        //Map
        Map<String, Integer> m = new HashMap<>();
        for(String s:lang){
            if(!m.containsKey(s)){
                m.put(s,1);
            }
            else{
                m.put(s,m.get(s)+1);
            }
        }
        for(Map.Entry<String, Integer> e:m.entrySet()){
            if(e.getValue()>1){
                System.out.println(e.getKey());
            }
        }

    }
}
