public class LongestCommonPrefix {
    public static void main(String[] args) {
    String arr[]  ={"java2blog","javaworld","javabean","javatemp","java2blog"};
        System.out.println(longestPrefix(arr));
    }

    public static String longestPrefix(String [] arr){
        if(arr.length == 0) return "";
        String min = getMinString(arr);
        int minPrefixLen = min.length();
        for(int i=0;i<arr.length;i++){
            int j;
            for(j=0;j<minPrefixLen;j++){
                if(min.charAt(j) != arr[i].charAt(j)){
                    break;
                }
            }
            if(j<minPrefixLen){
                minPrefixLen = j;
            }
        }
        return min.substring(0,minPrefixLen);
    }


    public static String getMinString(String [] arr){
        String min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i].length() < min.length()){
                min = arr[i];
            }
        }
        return min;
    }
}
