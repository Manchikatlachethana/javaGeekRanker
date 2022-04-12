
public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int max = arr.get(0);
    int min = arr.get(0);
    int sum = 0;
    for(int i:arr){
        sum = sum+i;
        if(i<min){
            min = i;
        }
        if(i>max){
            max = i;
        }
    }
    
    System.out.println((sum-max)+" "+(sum-min));

}
