
// code to display the given elements in ascending order using Mergesort technique..

package sorting;

import java.io.*;

public class MergeSort {

	public static void main(String[] args) {
		
		int []a={5,2,6,1,8,9,3,4};
		int n=a.length;
		mergeSort(a,0,n-1);
		for(int i=0;i<n;i++) 
		System.out.print(a[i]+" ");
	}
	public static void mergeSort(int []elements,int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			mergeSort(elements,low,mid);
			mergeSort(elements,mid+1,high);
			merge(elements,low,mid,high);
		}
	}
	private static void merge(int []sub,int low,int mid,int high) {	
		int n=high-low+1;
		int []b=new int[n];
		int i=low,j=mid+1;
		int k=0;
		while(i<=mid||j<=high)
		{
			if(i>mid)
				b[k++]=sub[j++];
			else if(j>high)
				b[k++]=sub[i++];
			else if(sub[i]<sub[j])
			b[k++]=sub[i++];
			else
				b[k++]=sub[j++];
		}
		for(j=0;j<n;j++)
			sub[low+j]=b[j];
			
		}
	}

/* sample output:
  1 2 3 4 5 6
 */


