/*Queue interface implementation by using some operations like add(),size(),peek(),remove()..... */

import java.io.*;
import java.util.*;

class QueueDemo {
	public static void main (String[] args) {
		System.out.println("Implentation of Queue interface");
		Queue<Integer>q=new LinkedList<Integer>();
		for(int i=0;i<5;i++){
		    q.add(i);
		}
		System.out.println("Elements in queue: "+q);
		System.out.println("size of queue:"+q.size());
		System.out.println("head element: "+q.peek());
		System.out.println("Deletion operation!!! ");
		System.out.println("deleted element: "+q.remove());
		System.out.println("Remaining elements: "+q);
		System.out.println("head element: "+q.peek());
		System.out.println("size of queue: "+q.size());
		q.add(5);
		System.out.println("Adding 5 in queue: "+q);
    System.out.println("size of queue: "+q.size());
	}
}

/* sample output
Implentation of Queue interface
Elements in queue: [0, 1, 2, 3, 4]
size of queue:5
head element: 0
Deletion operation!!! 
deleted element: 0
Remaining elements: [1, 2, 3, 4]
head element: 1
size of queue: 4
Adding 5 in queue: [1, 2, 3, 4, 5]
size of queue: 5
*/
