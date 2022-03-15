import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class GenerateRandomNumbersStrings {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(1000);
        System.out.println(i);
        double d = rand.nextDouble();//range : 0.0 and less than 1.0
        System.out.println(d);

        double random = Math.random();
        System.out.println(random);

        //apache commons-lang Api (using maven dependency)
        String r = RandomStringUtils.randomNumeric(10); //10 digit number
        System.out.println(r);
        String e =RandomStringUtils.randomAlphabetic(5); // 5 character string from A-z,a-z
        System.out.println(e);


    }
}
