package MustPractice;

public class Armstrong {
    public static void CheckArmstrong(int num){
        /*
        153
        1: 1*1*1=1
        5: 5*5*5=125
        3: 3*3*3=27
        1+125+27 = 153
         */
        int t = num;
        int cube = 0;
        int r;
        while(num>0){
            r = num % 10;
            num = num/10;
            cube = cube+(r*r*r);
        }
        if(t == cube){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }

    public static void main(String[] args) {
        CheckArmstrong(153);
        CheckArmstrong(0);
        CheckArmstrong(1);
        CheckArmstrong(15);




    }
}
