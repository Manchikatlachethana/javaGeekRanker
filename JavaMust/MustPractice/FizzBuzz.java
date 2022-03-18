/*
print 1-100 numbers in new line
conditions: for each multiple of 3 print fizz instead of number,
for each multiple of 5 print buzz instead of number
for each multiples of 3 and 5 print fizzbuzz instead of number

 */
public class FizzBuzz {
    public static void main(String[] args) {
        printing(50);
    }

    public static void printing(int n){
        for(int i=1;i<=n;i++){
            if((i%3 == 0) && (i%5 ==0 )){
                System.out.println("fizzuzz");
            }else if((i%3 == 0)){
                System.out.println("fizz");
            }else if((i%5 == 0)){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
