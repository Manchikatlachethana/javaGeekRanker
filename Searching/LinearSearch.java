package com.practice;

public class LinearSearch {
    public static int search(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,9};
        int n = search(a,6);
        if(n == -1) {
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at "+n);
        }
    }
}
