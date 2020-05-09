/*
take input String of any length and print the even index characters + space+odd index characters.
Example:
 Input:   Github
 Output:Gtu ihb
 this works for only even string length.
 */
import java.io.*;
import java.util.*;

public class Day4Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<t;i++){
            String s=sc.nextLine();
            int sl=s.length();
            char [] ebox=new char[sl/2];
            char [] obox=new char[sl/2];
            int eindex=0;
            int oindex=0;
            for(int j=0;j<sl;j++)
            {
                if(j%2==0){
                    ebox[eindex]=s.charAt(j);
                    eindex++;
                }
                else{
                    obox[oindex]=s.charAt(j);
                    oindex++;
                }
            }
            for(int q=0;q<ebox.length;q++)
            {
                System.out.print(ebox[q]);
    
            }
            System.out.print(" ");
            for(int q=0;q<ebox.length;q++)
            {
            System.out.print(obox[q]);
            }
            System.out.println();
        }
        
        
    }
}
