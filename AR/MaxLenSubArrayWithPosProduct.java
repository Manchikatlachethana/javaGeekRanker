import java.util.*;

public class MaxLenSubArrayWithPosProduct {
    public static void main(String[] args) {
        int nums[] = {0,1,-2,-3,-4};
        System.out.println(getMaxLen(nums));
    }
    public static int getMaxLen(int[] nums) {
        ArrayList<ArrayList<Integer>> subarrays = splitZero(nums);
        int max=0;
        for(ArrayList<Integer> sub:subarrays){
            int len =  maxLen(sub);
            if(max<len){
                max=len;
            }
        }
        return max;
    }

    private static ArrayList<ArrayList<Integer>> splitZero(int[] nums){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> subarr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                subarr.add(nums[i]);
            }else{
                if(subarr.size()!=0){
                    result.add(subarr);
                    subarr = new ArrayList<>();
                }
            }
        }
        result.add(subarr);
        return result;
    }

    private static int maxLen(ArrayList<Integer> sub){
        int totalneg=0, firstneg=-1,lastneg=-1;
        for(int i=0;i<sub.size();i++){
            if(sub.get(i)<0){
                totalneg++;
                if(firstneg<0){
                    firstneg = i;
                }
                lastneg=i;
            }
        }

        if(totalneg%2==0){
            return sub.size();
        }else{
            int start = firstneg+1;
            int end = sub.size()-lastneg;
            if(start<end){
                return sub.size()-start;
            }else{
                return sub.size()-end;
            }
        }
    }
}
