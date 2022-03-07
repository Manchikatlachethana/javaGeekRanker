import java.util.HashMap;
import java.util.Map;

public class DupicateWordsString {
    public static void main(String[] args) {
        String s = "java is robust java is platform independent so java is best";
        findDuplicates(s);
    }
    public static void findDuplicates(String inputString){
        String []words = inputString.split(" ");
        Map<String,Integer> wordCount = new HashMap<>();
        for(String word:words){
            if(!wordCount.containsKey(word)){
                wordCount.put(word,1);
            }else{
                wordCount.put(word,wordCount.get(word)+1);
            }
        }
        //System.out.println(m);
        for(Map.Entry<String, Integer> e:wordCount.entrySet()){
            if(e.getValue()>1){
                System.out.println(e);
            }
        }

    }
}
