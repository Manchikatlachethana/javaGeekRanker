package MustPractice;

public class SwappingStrings {
    public static void main(String[] args) {
        String a = "swapping";
        String b = "strings";
        //append a and b
        a = a+b;
        //store initial string a in string b
        b = a.substring(0,a.length()-b.length());
        //store initial string b in a
        a = a.substring(b.length());
        System.out.println(a);
        System.out.println(b);

    }
}
