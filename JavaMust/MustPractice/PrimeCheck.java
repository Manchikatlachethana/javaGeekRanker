package MustPractice;

public class PrimeCheck {
    public static boolean Check(int n){
        if(n<=1){
            return false;
        }
        for (int i=2;i<n/2;i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void primes(int num){
        for(int i=2;i<=num;i++){
            if(Check(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println(Check(9));
        primes(100);

    }
}
