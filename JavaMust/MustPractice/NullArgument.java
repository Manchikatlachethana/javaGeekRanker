//pass null argument with method overloading using string and object types
public class NullArgument {
    public static void main(String[] args) {
        test(null);
    }

    public static void test(String s){
        System.out.println("string method");
    }

    public static void test(Object o){
        System.out.println("Object method");
    }
}
