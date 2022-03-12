package MustPractice;

public class Factorial {
    public static int iterFactorial(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static int fact(int num){
        if(num == 0){
            return 1;
        }else{
            return (num * fact(num-1));
        }
    }
    public static void main(String[] args) {
        System.out.println(iterFactorial(0));
        System.out.println(iterFactorial(5));
        System.out.println(fact(0));
        System.out.println(fact(4));



    }
}
