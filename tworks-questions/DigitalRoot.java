// find digital root of given string which consists of sets seperated with ;;; and print count of the digital roots with odd value.
/*"999,999,999;;;4,5;;;6,7"
999, 999, 999
9+9+9 9+9+9 9+9+9	4 5   6 7
27 27 27			4+5		6+7
9 9 9				9		13
9+9+9						1+3
18 							4
1+8
9
odd				odd         even
count = 2
 */

import java.io.*;


public class Numbers{

	public static void main(String[] args){
		String s = "999,999,999;;;4,5;;;6,7";
		String a[] = s.split(";;;");			//a[0] =" 1,2,3"  b[3] b[0]= 1, b[1] =2, b[2] =3

		//1,2,3  4,5   6,7
		int count = 0;
		for(int i=0;i<a.length;i++){ // 0-2
			String b[] = a[i].split(",");
			int sum = 0;
			for(int j=0;j<b.length;j++){
				//System.out.print(b[j]+" ");
				sum = sum+Integer.parseInt(b[j]);
			} 
			int recSum = rec(sum);
			System.out.println("--"+recSum);
			if(recSum %2 != 0 && recSum <= 9){
				count++;
			}
		}
		System.out.println(count);	
	}

	public static int rec(int num){		
		int sum = 0;
		if(num <= 9){
			return num;
		}	
		if(num > 9){
			while(num > 0){
				sum = sum+num%10;
				num = num/10;
			}
		}
		return rec(sum);
	}

	public static int iter(int num){
		int sum = 0;
		if(num <= 9) return num;
		ifS(num > 9){
			while(num > 0){
				sum = sum+num%10;
				num = num/10;
			}
			if(sum > 9){
				num = sum;
		}			
		}
		
		if(sum <= 9) return sum;			
		return sum;
	}
}