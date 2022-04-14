public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int lDiagonal = 0;
    int rDiagonal = 0;
    for(int i=0;i<arr.size();i++){
        lDiagonal = lDiagonal+arr.get(i).get(i);
    }
    
    for(int i=0;i<arr.size();i++){
        rDiagonal = rDiagonal+arr.get(i).get(arr.size()-(i+1));
    }
    return Math.abs(lDiagonal-rDiagonal);
    }
