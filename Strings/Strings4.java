package git;

import java.util.*;

public class Strings4 {

	public static void main(String[] args) {

		String[] arr = { "hi", "hi", "hello", "bye", "hello", "hi" };
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			} else {
				int count = map.get(arr[i]);
				count++;
				map.put(arr[i], count);
			}

		}
		System.out.println("map keys: "+map.keySet());
		Set<String> set = map.keySet();
		int max = 0;
		for (String i : set) {
			System.out.print( "map values: "+map.get(i)+" ");
			int val = map.get(i);
			if (max < val) {
				max = val;
			}
		}
		System.out.println();
		System.out.println("maximum value:" + max);

	}

}
/* sample output
map keys: [hi, hello, bye]
map values: 3 map values: 2 map values: 1 
maximum value:3
*/
