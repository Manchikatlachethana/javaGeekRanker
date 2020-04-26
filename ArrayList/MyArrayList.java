//program to find min and max in an arrayList.
//@ author chethana.m

import java.io.*;
import java.util.*;

class MyArrayList {
	public static void main (String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
		    List<Integer> a = new ArrayList<Integer>();
		  //  String c = br.readLine();
		  //  String [] first = c.split(" ");
		    String [] first = br.readLine().split(" ");
		    for(int i=0;i<first.length;i++){
		        a.add(Integer.parseInt(first[i]));
		    }
		    // question: find the minimum element in the list.
		    
		    int min = a.get(0);
		    for(int i=1;i<a.size();i++){
		        if(a.get(i)<min){
		            min = a.get(i);
		        }
		    }
		    
		    // another question: find the maximum element in the list.
		    int max = a.get(0);
		    for(int i=1;i<a.size();i++){
		        if(a.get(i)>max){
		            max = a.get(i);
		        }
		    }
		    System.out.println("min "+min+" max "+max);
		}
	}
}

/*
Sample Input:
2
4
1 2 3 4
5
4 3 2 1 0
Sample Output:
min 1 max 4
min 0 max 4
*/
