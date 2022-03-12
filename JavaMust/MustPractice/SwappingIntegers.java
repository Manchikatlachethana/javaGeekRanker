package MustPractice;

public class SwappingIntegers {
    public static void main(String[] args) {
        int x = 10,y = 5;
        /*using third variable
            int z = x;
             x = y;
             y = z;
         */
        /*without extra space, using +
        x = x+y;//19
        y = x-y;//19-8=11
        x = x-y;//19-11=8
        */

        /*
        using * without extra variable.
        x = x*y;
        y = x/y;
        x = x/y;
         */
        /*
        xor
        0 0 - 0
        0 1 - 1
        1 0 - 1
        1 1 - 0

         */
        //using xor
        //x = 10    (1010)
        //y = 5     (0101)
        x = x^y;  // 1111 - 15
        y = x^y; //  1010 - 10
        x = x^y; //  0101 - 5

        System.out.println(" x - "+x);
        System.out.println(" y - "+y);
    }

}
