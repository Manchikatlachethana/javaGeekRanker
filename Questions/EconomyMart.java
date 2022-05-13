/*
Q3:
Example

entries = [['INSERT', 'milk', '4'], ['INSERT', 'coffee', '3'], ['VIEW', '-', '-'], ['INSERT', 'pizza', '5'], ['INSERT', 'gum', '1'], ['VIEW', '-', '-']]

Let's consider the following entries in the database:
6
3
INSERT milk 4
INSERT coffee 3
VIEW - -
INSERT pizza 5
INSERT gum 1
VIEW - -
// LIST : gum,coffee,milk,pizza
O/P:['coffee', 'coffee'].

STDIN                 FUNCTION
-----                 --------
10                  → entries[][] size n = 10
3                   → entries[n][] columns = 3
INSERT fries 4      → rows of entries
INSERT soda 2
VIEW - -
VIEW - -
INSERT hamburger 5
VIEW - -
INSERT nuggets 4
INSERT cookie 1
VIEW - -
VIEW - -

Sample Output

soda
fries
hamburger
nuggets
hamburger

 */
package com.Important;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EconomyMart {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("size of list");
        int num = Integer.parseInt(br.readLine());
        String entries[][] = new String[num][3];
        for(int i=0;i<num;i++){
            System.out.println("elements");
            for(int j=0;j<3;j++){
                entries[i][j] = br.readLine();
            }
        }
        System.out.println(getItems(entries));
    }

    public static List<String> getItems(String entries[][]){
        ArrayList<String> res = new ArrayList<>();
        ArrayList<ArrayList<String>> db = new ArrayList<>();
        int viewcount=0;
        for(int i=0;i< entries.length;i++){
                    if(entries[i][0].equals("INSERT")){
                        ArrayList<String> insert = new ArrayList<>();
                        insert.add(entries[i][1]);
                        insert.add(entries[i][2]);
                        //System.out.println(insert);
                        db.add(insert);
                       // System.out.println(db);
                    }else{
                        if(db.size()>1){
                            sort(db);
                        }
                        //System.out.println(res);
                        res.add(db.get(viewcount).get(0));
                        viewcount++;
                    }

        }
        return res;
    }

    public static void sort(List<ArrayList<String>> db){
        for(int i=0;i<db.size();i++){
            for(int j=i+1;j<db.size();j++){
                if(Integer.parseInt(db.get(i).get(1)) > Integer.parseInt(db.get(j).get(1))){
                    Collections.swap(db,i,j);
                }else if(Integer.parseInt(db.get(i).get(1)) == Integer.parseInt(db.get(j).get(1))){
                    if(db.get(i).get(0).charAt(0) > db.get(j).get(0).charAt(0)){
                        Collections.swap(db,i,j);
                    }
                }
            }
        }
    }

}
