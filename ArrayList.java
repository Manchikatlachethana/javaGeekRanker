/*ArrayList  printing ascending or descending*/

import java.io.*;
import java.util.*;
class ArrayList{
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=10;
	    ArrayList<Integer> a=new ArrayList<Integer>();
	    for(int i=0;i<n;i++){
	        a.add(i);
	    }
        for(int j=0;j<a.size();j++){
            System.out.print(a.get(j)+" ");
        }
        System.out.println();
        String s=sc.nextLine();
        if(s.equals("asc")){
            // print ascending order
            for(int q=0;q<n;q++){
                System.out.print(a.get(q)+" ");
            }
            System.out.println();
        }
        else{
            for(int w=a.size()-1;w>=0;w--){
                System.out.print(a.get(w)+" ");
            }
            System.out.println();
        }
	}
}
