/*
Q4:
Example

buildingCount = [1, 2, 1, 2, 2]
routerLocation = [3, 1]
routerRange = [1, 2]

There are 5 buildings with tenant counts shown in buildingCount.  Routers are located in buildings 3 and 1 with ranges 1 and 2 as shown in routerLocation and routerRange.

The first router is in building 3 and provides Internet to buildings in the range [2, 4].

The second router is in building 1 and provides Internet to buildings in the range [1, 3].

     		    Router   	   Tenant
Building        Count    	   Count 	Served
--------    	-----    	------ 		-----
1              	1      		1   		Yes
2               2     	 	2  		    Yes
3      		    2      		1  		    Yes
4     		    1      		2  		    No
5     		    0      		2  		    No
The table above, explained:

The number of routers providing Internet to building 1 is 1, which is equal to the number of people living here, so building 1 is served.
The number of routers providing Internet to building 2 is 2, which is equal to the number of people living here, so building 2 is served.
The number of routers providing Internet to building 3 is 2, which is greater than the number of people living here, so building 3 is served.
Building 4 only has coverage from 1 router, which is less than the number of people living there.  The building is unserved.
Building 5 has no router coverage, so building 5 is unserved.

The 3 served buildings are 1, 2, and 3. Return 3.

STDIN    FUNCTION
-----    --------
4    →   buildingCount[] size n = 4
2    →   buildingCount = [2, 1, 1, 3]
1
1
3
2    →   routerLocation[] size m = 2
1    →   routerLocation = [1, 2]
2
2    →   routerRange[] size m = 2
2    →   routerRange = [2, 0]
0

Sample Output
2
 */


package com.Important;

import java.util.*;

public class Routers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("n");
        int n = sc.nextInt();
        int buildingCount[] = new int[n+1];
        System.out.println("tenants");
        for(int i=1;i<n+1;i++){
            buildingCount[i] = sc.nextInt();
        }
        System.out.println("m");
        int m = sc.nextInt();
        int routerLocation[] = new int[m];
        System.out.println("locations");
        for(int i=0;i<m;i++){
            routerLocation[i] = sc.nextInt();
        }

        int routerRange[] = new int[m];
        System.out.println("Routerrange");
        for(int i=0;i<m;i++){
            routerRange[i] = sc.nextInt();
        }
        System.out.println(getServedBuildings(buildingCount,routerLocation,routerRange));
    }

    public static int getServedBuildings(int buildingCount[], int routerLocation[], int routerRange[]){
    int bserved = 0;
        ArrayList<ArrayList<Integer>> range = routerRange(routerLocation,routerRange);
        //System.out.println(range);
        HashMap<Integer,Integer> map = routersCount(buildingCount.length,range);
        //System.out.println(map);
        for(int i=1;i<buildingCount.length;i++){
            if(map.get(i) >= buildingCount[i]){
                bserved++;
            }
        }
        return bserved;
    }

    public static ArrayList<ArrayList<Integer>> routerRange(int routerLocation[], int routerRange[]){
        ArrayList<ArrayList<Integer>> range = new ArrayList<>();
        for(int i=0;i<routerLocation.length;i++){
            ArrayList<Integer> r = new ArrayList<>();
           int r1 = Math.abs(routerLocation[i]-routerRange[i]);
           int r2 = Math.abs(routerLocation[i]+routerRange[i]);
            r.add(r1);
            r.add(r2);
            range.add(r);
        }
        return range;
    }

    public static HashMap<Integer,Integer> routersCount(int buildingSize, ArrayList<ArrayList<Integer>> range){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=1;i<buildingSize;i++){
            hm.put(i,0);
        }
        for(int bnum=1;bnum<buildingSize;bnum++){
            for(int i=0;i<range.size();i++){
                int leftbound = range.get(i).get(0);
                int rightbound = range.get(i).get(1);
                if((leftbound == bnum || rightbound == bnum) && (bnum<buildingSize)){
                    hm.put(bnum,hm.get(bnum)+1);
                }else if((leftbound < bnum && rightbound > bnum) && (bnum<buildingSize)){
                    hm.put(bnum,hm.get(bnum)+1);
                }
            }
        }
       return hm;
    }

}



