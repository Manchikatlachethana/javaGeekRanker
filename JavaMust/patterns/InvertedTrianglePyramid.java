package com.patterns;

public class InvertedTrianglePyramid {
    public static void main(String[] args) {
        iTPyramid(5);
    }
    public static void iTPyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<n;k++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
