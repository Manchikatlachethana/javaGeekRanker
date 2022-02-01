
//Intersection point of two Linked Lists

package com.practice;

public class IntersectionPointLinkedList {
    static  Node head1, head2;

    static class Node{
        int data;
        Node next;

        Node(int d){
           data = d;
           next = null;
        }

    }
//length of list
    public int getCount(Node node){
        Node curr = node;
        int len = 0;
        while(curr != null){
            len++;
            curr = curr.next;
        }
    return len;
    }

//finding difference of two lists
    public int getNode(){
        int c1 = getCount(head1);
        int c2 = getCount(head2);
        int d;
        if(c1 > c2){
          d = c1- c2;
          return getIntersectionNode(d,head1,head2);
        }
        else{
            d = c2 - c1;
            return getIntersectionNode(d,head2,head1);
        }

    }
    //intersection node
    public int getIntersectionNode(int d, Node n1, Node n2){
    Node temp1 = n1;
    Node temp2 = n2;
    for(int i=0;i<d;i++){
        if(temp1 == null){
            return -1;
        }
        temp1 = temp1.next;
    }
    while(temp1 != null && temp2 != null){
        if(temp1.data == temp2.data){
            return temp1.data;
        }
        temp1 = temp1.next;
        temp2 = temp2.next;
    }
    return -1;
    }

    public static void main(String[] args) {
    IntersectionPointLinkedList ll = new IntersectionPointLinkedList();
    //first list
    ll.head1 = new Node(3);
    ll.head1.next = new Node(5);
    ll.head1.next.next = new Node(15);
    ll.head1.next.next.next = new Node(5);


    //second list
        ll.head2 = new Node(1);
        ll.head2.next = new Node(15);
        ll.head2.next.next = new Node(5);
        System.out.println(ll.getNode());
    }
}
