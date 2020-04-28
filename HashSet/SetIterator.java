// code to print the given elements using set inerface which doesn't print duplicate elements.

import java.io.*;
import java.util.*;
class SetIterator {
	public static void main (String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String [] inputs = br.readLine().split(" ");
		int [] a = new int[n];
		for(int i=0;i<inputs.length;i++){
		    a[i] = Integer.parseInt(inputs[i]);
		}
		Set<Integer> set = new HashSet<Integer>();
	input:	// 1 2 3 1 2 3
	output:	// 1 2 3 
		for(int i=0;i<n;i++){
		    if(set.contains(a[i])){
		        // dont add in set.
		    }else{
		        set.add(a[i]);
		    }
		}
		// method 2: Iterator
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()){
		    System.out.print(iter.next()+" ");
		}
		System.out.println();
	}
}

/*
sample input:
6
4 5 6 1 2 3

sample output:
1 2 3 4 5 6
*/
