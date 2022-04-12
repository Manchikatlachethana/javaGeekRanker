public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int pos = 0;
    int neg = 0;
    int zero = 0;
    for(int i:arr){
        if(i>0){
            pos++;
        }else if(i<0){
            neg++;
        }else{
            zero++;
        }
    }
    System.out.println((float)pos/arr.size());
    System.out.println((float)neg/arr.size());
    System.out.println((float)zero/arr.size());
    
    }
