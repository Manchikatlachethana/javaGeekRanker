import java.io.*;
import java.util.*;

public class SolutionQheap {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            int type = sc.nextInt();
            switch(type){
                case 1:
                    pq.add(sc.nextInt());
                    break;
                    
                case 2:
                    int val = sc.nextInt();
                    pq.remove(val);
                    break;
                case 3:
                    val = pq.peek();
                    System.out.println(val);
                    break;
            }
        }
    }
}
