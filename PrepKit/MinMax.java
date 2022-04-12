
public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long max = arr.get(0);
    long min = arr.get(0);
    long sum = 0;
    for(int i:arr){
        sum = sum+i;
        max = Math.max(max,i);
        min = Math.min(min,i);
    }   
    System.out.println((sum-max)+" "+(sum-min));
}
