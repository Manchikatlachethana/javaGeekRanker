//Compare two int numbers(Integer caching)
public class IntegerComparision {
    public static void main(String[] args) {
//range : -128 to 127(if numbers are between this range then they are equal)
        Integer num1 = 127;
        Integer num2 = 127;
        if(num1 == num2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}
