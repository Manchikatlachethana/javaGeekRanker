public class MergeSortNew{

	public void mergesort(int a[],int low,int high){
		if(low<high){
			int mid = low+(high-low)/2;
			mergesort(a,low,mid);
			mergesort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	public void merge(int a[], int low, int mid, int high){
		int n1 = mid-low+1;
		int n2 = high-mid;
		int left[] = new int[n1];
		int right[] = new int[n2];
		for(int i=0;i<n1;i++){
			left[i] = a[i+low];
		}
		for(int j=0;j<n2;j++){
			right[j] = a[j+mid+1];
		}
		int i=0, j=0, k=low;
		while(i<n1 && j<n2){
			if(left[i]<right[j]){
				a[k] = left[i];
				i++;
			}else{
				a[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			a[k] = left[i];
			i++;
			k++;
		}
		while(j<n2){
			a[k] = right[j];
			j++;
			k++;
		}
	}
	public static void main(String[]args){
		MergeSortNew m = new MergeSortNew();
		int a[] = {10,2,8,11,5};
		m.mergesort(a,0,a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}
}
