/* 
Q2:
Examples
Input:
numOrders = 6
orderList =
[zld 93 12]
[fp kindle book]
[10a echo show]
[17g 12 25 6]
[ab1 kindle book]
[125 echo dot second generation]

Output:
[125 echo dot second generation]
[10a echo show]
[ab1 kindle book]
[fp kindle book]
[zld 93 12]
[17g 12 25 6]

Explanation:
There are four Prime orders (lines with words) in this order list. Because “echo” comes before “kindle”,
those lines should come first, with “dot” coming before “show”. Because two lines have the metadata “kindle book”,
their tie should be broken by the identifier, where “ab1” comes before “fp”.
Finally, the non-Prime numeric orders should come last, in the original order, they were in the input.

 */
package com.Important;

import java.util.*;

public class Prioritization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("order size");
        int num = sc.nextInt();

        List<ArrayList<String>> input  = new LinkedList<>();

        for(int i=0;i<num;i++){
            System.out.println("list size");
            int size = sc.nextInt();
            System.out.println("elements");
            ArrayList<String> al = new ArrayList<>();
            for (int j=0;j<size;j++){
                al.add(sc.next());
            }
            input.add(al);
        }

        System.out.println(input);
        System.out.println(primeNonPrime(num,input));
    }


    public static boolean isNumeric(String s){
        try{
            int num = Integer.parseInt(s);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }

    public static boolean checkSmaller(String s1, String s2){
        int value = s1.compareTo(s2);
        if(value<0){
            return true;
        }
        return false;
    }

    public static List<ArrayList<String>> primeNonPrime(int numOrders, List<ArrayList<String>> orderList){

        List<ArrayList<String>> primes  = new LinkedList<>();
        List<ArrayList<String>> nonprimes  = new LinkedList<>();
        for(int i=0;i<numOrders;i++){
            if((!isNumeric(orderList.get(i).get(1)))){
                primes.add(orderList.get(i));
            }else{
                nonprimes.add(orderList.get(i));
            }
        }

        for(int i=0;i<primes.size();i++){
            for(int j=i+1;j<primes.size();j++){
                int value = primes.get(i).get(1).compareTo(primes.get(j).get(1));
                //0 = equal, <0 lesser , >0 bigger
                if(value > 0){
                    Collections.swap(primes,i,j);
                }else if(value == 0){
                    boolean small = checkSmaller(primes.get(i).get(0),primes.get(i).get(1));
                    //if res == true s1<s2
                    if(small == true){
                        Collections.swap(primes,i,j);
                    }

                }
            }
        }
        for(int i=0;i<nonprimes.size();i++){
            primes.add(nonprimes.get(i));
        }
        return primes;
    }
}
