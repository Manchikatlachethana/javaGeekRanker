package MustPractice;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "Lets see what are there in strings";
        System.out.println(str.indexOf('s',str.indexOf('s')+1));//index of second s

        System.out.println(str.indexOf('s',str.indexOf('s',str.indexOf('s')+1)+1));//index of third s
        //System.out.println(str.indexOf(('s'), str.indexOf('s') + str.indexOf('s')+1));
        System.out.println(str.indexOf('c'));
        String str1 = "Lets see What are there in strings";
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        String q = "hello";
        String w = "world";
        int a = 10;
        int b = 2;
        System.out.println(q+w+a+b);
        System.out.println(q+w+(a+b));


    }
}
