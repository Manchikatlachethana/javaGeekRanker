package io.patterns;

public class CombinedLeftInvertedPyramid {
    public static void main(String[] args) {
        lPyramid(5);
        invertedPyramid(5);
    }
    public static void lPyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void invertedPyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
