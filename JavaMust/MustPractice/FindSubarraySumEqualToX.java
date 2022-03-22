/*
Given an array of positive integer and given value X, find Contiguous sub array whose sum is equal to X.
arr[]={14, 12, 70, 15, 99, 65, 21, 90};
X =97.
Sum found between index 1 to 3
Elements are 12, 70 and 15

 */
public class FindSubarraySumEqualToX {
    public static void main(String[] args) {
        int [] arr = {14, 12, 70, 15, 99, 65, 21, 90};
        findSubarray(arr,97);
    }
    public static void findSubarray(int [] a,int x){
        int csum = a[0];
        int start = 0;
        for(int i=1;i<=a.length;i++){
            while(csum > x && start < i-1){
                csum = csum - a[start];
                start++;
            }
            //System.out.println(csum);
            if(csum == x){
                int end = i-1;
                System.out.println("sum found at indexes : "+ start +" - " +end);
                for(int j=start;j<=end;j++){
                    System.out.print(a[j]+" ");
                }
                return;
            }
            if(i<a.length){
                csum  = csum+a[i];
            }
        }
    }

}
