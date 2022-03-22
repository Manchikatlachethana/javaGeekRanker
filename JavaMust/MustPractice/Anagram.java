public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnangram("angel","angle"));
    }

    public static boolean isAnangram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            int index = s2.indexOf(c);
            if(index != -1){
                s2 = s2.substring(0,index)+s2.substring(index+1,s2.length());
            }else{
                return false;
            }
        }
        return s2.isEmpty();
    }
}
