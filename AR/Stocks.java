import java.io.*;
import java.util.*;
public class Stocks {
    static Set<Integer> s = new HashSet<>();
    public static void main (String[] args) {
    int n=11,m=5;
    s.add(n);
    System.out.println(wierdStock(n,m));
    }

    public static int wierdStock(int n,int m){
        System.out.println("n - "+n+",m - "+m);

        if(n>m)
        {
            return n-m;
        }
        else if(n==m) return 0;
        else{
            return Math.min(helper(n*2,m,1),helper(n-1,m,1));
        }
    }

    public static int helper(int n,int m,int days){
        System.out.println("helper : n - "+n+",m - "+m);
        if(n<=0){
            return Integer.MAX_VALUE;
        }
        if(n==m) return days;
        if(n>m){
            return days+n-m;
        }
        if(!s.contains(n)){
           s.add(n);
           return Math.min(helper(n*2,m,days+1),helper(n-1,m,days+1));
        }
        return Integer.MAX_VALUE;
    }
}
