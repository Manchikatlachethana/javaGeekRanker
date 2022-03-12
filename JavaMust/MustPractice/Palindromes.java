package MustPractice;

public class Palindromes {
    public static void CheckPalindrome(int num){
        int sum = 0;
        int t = num;
        while(num>0){
            sum = sum*10+num%10;
            num = num/10;
        }
        if(t==sum){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    public static void main(String[] args) {
        CheckPalindrome(-1210121);
    }
}
