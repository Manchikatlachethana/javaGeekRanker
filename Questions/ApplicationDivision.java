/*
Q1:
Example 1:
Input:
deviceCapacity = 7
foregroundAppList = [[1,2],[2,4],[3,6]]
backgroundAppList = [[1,2]]

Output:
[[2,1]]

Explanation:
There are only three combinations, [1,1], [2,1], and [3,1], which use a total of 4, 6, and 8 MB memory, respectively. Since 6 is the largest use that does not exceed 7, [2,1] is the only optimal pair.

Example2:
Input:
deviceCapacity = 10
foregroundAppList = [[1, 3], [2, 5], [3, 7], [4, 10]]
backgroundAppList = [[1, 2], [2, 3], [3, 4], [4, 5]]

Output:
[[2, 4], [3, 2]]

 */
package com.Important;

import java.util.*;

public class ApplicationDivision {
    public static void main(String[] args) {
        int deviceCapacity = 7;
        ArrayList<ArrayList<Integer>>  foregroundAppList = new ArrayList<>();
        ArrayList<ArrayList<Integer>> backgroundAppList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("capacity");
        int c = sc.nextInt();
        System.out.println("foregroundAppList size ");
        int f1 = sc.nextInt();
        System.out.println("elements ");
        for(int i=0;i<f1;i++){
            ArrayList<Integer> f = new ArrayList<>();
            for(int j=0;j<2;j++) {
                int a = sc.nextInt();
                f.add(a);
            }
        foregroundAppList.add(f);
        }
        System.out.println(foregroundAppList);
        System.out.println("backgroundAppList size");
        int b1 = sc.nextInt();
        System.out.println("elements ");
        for(int i=0;i<b1;i++){
            ArrayList<Integer> b = new ArrayList<>();
            for(int j=0;j<2;j++) {
                int a = sc.nextInt();
                b.add(a);
            }
            backgroundAppList.add(b);
        }
        System.out.println(backgroundAppList);
        System.out.println("result "+maxUtilization(c,foregroundAppList,backgroundAppList));
    }

    public static ArrayList<ArrayList<Integer>>
    maxUtilization(int deviceCapacity, ArrayList<ArrayList<Integer>> foregroundAppList,ArrayList<ArrayList<Integer>> backgroundAppList){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<ArrayList, Integer> m = new HashMap<>();
        for(int i=0;i<foregroundAppList.size();i++){
            if(foregroundAppList.get(i).get(1) >= deviceCapacity){
                i++;
            }else{
                int max = 0, f=0,b=0;
                ArrayList<Integer> app = new ArrayList<>();
                for(int j=0;j<backgroundAppList.size();j++){
                    int value = foregroundAppList.get(i).get(1) + backgroundAppList.get(j).get(1);

                    if( value <= deviceCapacity){
                        max = Math.max(max,value);
                        f = (foregroundAppList.get(i).get(0));
                        b = (backgroundAppList.get(j).get(0));
                    }
                }
                if(max != 0 && f !=0 && b !=0){
                    app.add(f);
                    app.add(b);
                    m.put(app,max);
                }
            }
        }
        int max = 0;
        for(Map.Entry<ArrayList,Integer> hm : m.entrySet()){
           max = Math.max(max,hm.getValue());
        }
        for(Map.Entry<ArrayList,Integer> hm : m.entrySet()){
            if(hm.getValue() == max){
                res.add(hm.getKey());
            }
        }
        return res;
    }
}
