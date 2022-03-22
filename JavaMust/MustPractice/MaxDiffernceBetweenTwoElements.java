//Given array of integers, find Maximum difference between two elements such that
// larger element appears after the smaller number(Max Difference =95-12 = 83)
public class MaxDiffernceBetweenTwoElements {
    public static void main(String[] args) {
        int a[] = {14, 12, 70, 15, 95, 65, 22, 30};
        System.out.println(maxDiffernce(a));
    }
    public static int maxDiffernce(int a[]){
        int maxdiff = Integer.MIN_VALUE;
        int lowest = a[0];
        for(int i=0;i<a.length;i++){
            int diff = 0;
            if(a[i]>lowest){
                diff = a[i]-lowest;
                if(diff>maxdiff){
                    maxdiff = diff;
                }
            }else{
                lowest = a[i];
            }

        }
        return maxdiff;
    }

}
