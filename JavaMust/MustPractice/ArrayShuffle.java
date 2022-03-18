//shuffle the given array.
import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        arrayShuffling(arr);
    }

    public static void arrayShuffling(int a[]){
        Random rand = new Random();
        for(int i=0;i<a.length;i++){
            int rIndex = rand.nextInt(a.length);
            int temp = a[rIndex];
            a[rIndex] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));


    }
}
