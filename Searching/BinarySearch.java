package com.practice;

public class BinarySearch {
    //Time Complexity: O(logN)
    //Auxiliary Space: O(1)
    public int iterBinarySearch(int arr[],int x){
        int left=0,right = arr.length-1;
        while(left <= right){
            int mid = left+(right-1)/2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] > x){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }

    //Time Complexity: O(N*log N)
    //Auxiliary Space: O(1)
    public int recBinarySearch(int arr[],int left, int right, int x){
        if(right >= 1){
            int mid = left +(right-1)/2;
            if(arr[mid] == x) return mid;
            if(arr[mid] < x){
                return recBinarySearch(arr,mid+1,right,x);
            }else{
                return recBinarySearch(arr,left, mid-1,x);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1,5,6,7,8,9};
        BinarySearch b = new BinarySearch();
        int iter = b.iterBinarySearch(a,6);
        if(iter == -1){
            System.out.println("Not found!");
        }else{
            System.out.println("Found at index "+iter);
        }

        int rec = b.recBinarySearch(a,0,a.length-1,3);
        if(rec == -1){
            System.out.println("Not found!");
        }else{
            System.out.println("Found at index "+rec);
        }


    }
}
