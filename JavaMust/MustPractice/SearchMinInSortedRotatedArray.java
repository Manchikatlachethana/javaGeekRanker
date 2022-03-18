public class SearchMinInSortedRotatedArray {
    public static void main(String[] args) {
        int a[] = {16,19,21,25,3,5,8,10};
        System.out.println(minSearch(a,0,a.length-1));
    }
    public static int minSearch(int a[],int low, int high){
        int mid;
        while(low<high){
           mid = low+((high-low)/2);
           if(a[mid]>a[high]) {
               low = mid + 1;
           }else{
               high = mid;
           }

        }
        return a[low];
    }
}
