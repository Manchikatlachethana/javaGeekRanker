package MustPractice;

public class SmalestLargest {
    public static void main(String[] args) {
        int a[] = {-1,-11,-3,0};
        int smallest = a[0]; //Integer.MAX_VALUE
        int largest = a[0];//Integer.MIN_VALUE
        for(int i=0;i<a.length;i++){    //i=1
            if(a[i]<smallest){
               smallest = a[i];
            }
            else if(a[i]>largest){
                largest = a[i];
            }
        }
        System.out.println(smallest+" , "+largest);
    }
}
