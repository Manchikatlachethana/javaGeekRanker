package com.practice;

public class InsertionSort {
    int[] sort(int a[]){
        for(int i=1;i<a.length;i++){
           int key = a[i];
           int j = i-1;
           while(j>=0 && a[j]>key){
               a[j+1] = a[j];
               j--;
           }
           a[j+1]=key;
        }
        return a;
    }

    public static void main(String[] args) {
        InsertionSort i = new InsertionSort();
        int a[]={3,1,10,-2};
        int b[] = i.sort(a);
        for(int j=0;j< b.length;j++){
            System.out.print(b[j]+" ");
        }
        System.out.println();
    }
}
