public class MaxSumSubArray {
    public static void main(String[] args) {
        int a[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(a));
    }
    public static int maxSum(int a[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int cmax = 0;
            for(int j=i;j<a.length;j++){
                cmax = cmax+a[j];
                max = Math.max(max,cmax);
            }
        }
        return max;
    }
}
