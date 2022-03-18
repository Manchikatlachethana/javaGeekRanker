import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftZeros {
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,3,0};
        System.out.println(Arrays.toString(shiftZerosToRight(arr)));
        shiftZerosRight(arr);
    }
    public static int [] shiftZerosToRight(int a[]){
        if(a.length == 1) return a;
        int count = 0;
        int newAray[] = new int[a.length];
        for(int i:a){
            if(i != 0){
                newAray[count] = i;
                count++;
            }
        }
        return newAray;
    }
    public static void shiftZerosRight(int a[]){
        List<Integer> l = new ArrayList<Integer>();
        for(int i:a){
            if(i != 0){
                l.add(i);
            }
        }
        int count = a.length-l.size();
        for(int i=0;i<count;i++){
            l.add(0);
        }

        System.out.println(l);
    }
}
