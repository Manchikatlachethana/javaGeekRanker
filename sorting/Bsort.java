import java.io.*;

class Bsort {
    public static void main (String[] args) {
		int a[] = {3,2,1};
		int n = a.length;
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        if(a[i]>a[j]){
		            int temp = a[i];
		            a[i] = a[j];
		            a[j] = temp;
		        }
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print(a[i]+" ");
		}

	}
}







// import java.io.*;

// class Bsort {
//     public static void main (String[] args) {
// 		int a[] = {3,2,1};
// 		int n = a.length;
// 		for(int i=0;i<n;i++){
// 		    for(int j=0;j<n-i-1;j++){
// 		        if(a[j]>a[j+1]){
// 		            int temp = a[j];
// 		            a[j] = a[j+1];
// 		            a[j+1] = temp;
// 		        }
// 		    }
// 		}
// 		for(int i=0;i<n;i++){
// 		    System.out.print(a[i]+" ");
// 		}
// 	}
// }
