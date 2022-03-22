//check whether the given number is armstrong
/*
A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.
For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and,
1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.
 */
public class CheckArmstrong {
    public static void main(String[] args) {

        System.out.println(isArmstrong(153));
    }
    public static int NumOfDigits(int num){
        int n=0;
        while(num != 0){
            n++;
            num = num/10;
        }
        return n;
    }
    public static boolean isArmstrong(int num){
        if(num<0) return false;
        if(num<=0 && num <=9) return true;

        int power = NumOfDigits(num);
        int copyNum = num;
        int sum = 0;
        while(copyNum != 0){
            int lastNum = copyNum%10;
            int digit = 1;
            for(int i=1;i<=power;i++){
                digit = digit*lastNum;
            }
            sum = sum+digit;
            copyNum = copyNum/10;
        }
        if(sum == num){
            return true;
        }
        return false;
    }
}
