//LinkedList implemenatation :Inserting element at tail
/*
Sample Input
------------
4       T = 4 ---> number of nodes
2       
3
4
1       
Sample Output
------------
2 3 4 1
*/
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution15 {
 
    public static  Node insert(Node head,int data) {
        Node newNode=new Node(data);
        Node temp=head;
        if(head==null){
            head=newNode;
            return head;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    return head;    
    }
    

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
