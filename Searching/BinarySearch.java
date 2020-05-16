package Git;

import java.util.*;

public class BinarySearch {

    public  void  binarySearch(int arr[],int low,int high,int key)
    {
        if(low>high)
        {
            System.out.println("Element not found!!! ");
            return;
        }
        int mid=(low+high)/2;
        int position=0;
        if(arr[mid]==key)
        {
                position=mid+1;
            System.out.println("Element found at " +position+ " position in the array ");
            return;
        }
        else if(key>arr[mid])
        {
             binarySearch(arr,mid+1,high,key);
        }
        else{
           binarySearch(arr,low,mid-1,key);
        }

    }

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        BinarySearch bs=new BinarySearch();
        System.out.println("Enter array size");
        int size=sc.nextInt();
        if(size<=0){
            System.out.println("invalid size(size should be >0) ");
        }
        System.out.println("Enter correct array size");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter element to search: ");
        int key=sc.nextInt();
        int low=0;
        int high=arr.length-1;
        bs.binarySearch(arr,low,high,key);


    }
}

/sample output:

Enter array size
0
invalid size(size should be >0) 
Enter correct array size
3
Enter array elements: 
1 2 3
Enter element to search: 
2
Element found at 2 position in the array

*/
