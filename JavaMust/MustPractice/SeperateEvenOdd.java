import java.util.Arrays;

public class SeperateEvenOdd {
    public static void main(String[] args) {
        int a[] = {12, 17, 70, 15, 22, 65, 21, 90};
        System.out.println(Arrays.toString(seperate(a)));
    }
    public static int [] seperate(int a[]){
        int l=0,h= a.length-1;
        for(int i=0;i<a.length;i++){
            while(a[l] %2 == 0){
                l++;
            }
            while(a[h] %2 !=0){
                h--;
            }
            if(l<h){
                int temp = a[l];
                a[l]=a[h];
                a[h]=temp;
            }
        }
        return a;
    }
}
