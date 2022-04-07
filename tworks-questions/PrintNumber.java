/*
given a string of numbers print number with out commas
 */
//"0,0,1,-1,4" =  -114
//"0,0,0"  =  0
//"-1,-1,8" =  118
import java.io.*;
public class PrintNumber{
	public static void main(String[] args){
		String s = "0,-10,10,0,0";
		String a[] = s.split(",");
		int count=0;
		for(int i=0;i<a.length;i++){			
			if(Integer.parseInt(a[i])<0){
				count++;
			}			
		}
		if(count %2 != 0){
				System.out.print("-");
			}
		int index = -1;
		int flag = 0;
		//zeros before a non zero ,index gives non index.
		for(int i=0;i<a.length;i++){
			if(Integer.parseInt(a[i]) != 0 && flag == 0){
				index=i;
				flag = 1;
				break;
			}
		}
		if(index==-1){
			System.out.println("0");
			return;
		}
		for(int j=index;j<a.length;j++){
			System.out.print(Math.abs(Integer.parseInt(a[j])));
		}
		System.out.println();	

	}
}

