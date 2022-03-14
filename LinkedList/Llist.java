package com.practice;

import java.util.Stack;

public class Llist {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static void printList(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static Node AddFront(Node head,int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    return head;
    }

    static public void insertAfter(Node prev, int data){
        Node new_node  = new Node(data);
        new_node.next = prev.next;
        prev.next = new_node;
    }

    public static Node insertAfterWithhead(Node head, int data, int pos){
        if(pos<0) return head;
        Node new_node = new Node(data);
        int n=0;
        Node curr = head;
        while(curr != null && n<pos-1){
            curr = curr.next;
            n++;
        }
        new_node.next = curr.next;
        curr.next = new_node;

        return head;
    }

    public static Node insertAtTail(Node head, int data){
        Node new_node = new Node(data);
        new_node.next = null;
        if(head == null){
            head = new_node;
            return head;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = new_node;
        return head;
    }

    public static Node deleteNode(Node head,int data){
        Node curr = head;
        Node prev = null;
        if(curr != null && curr.data == data){
            curr.next = curr.next.next;
            return head;
        }
        while(curr != null && curr.data != data){
            prev = curr;
            curr = curr.next;
        }
        if(curr == null){
            return head;
        }
        prev.next = curr.next;
        return head;
    }

    public static Node deleteNodeAtPos(Node head, int position){
        if(head == null || position <0) return head;
        Node curr = head;
        if(position == 0){
            head = curr.next;
            return head;
        }
        int count = 0;
        while(curr != null && count<position-1){
            curr = curr.next;
            position++;
        }
        if(curr.next == null || curr.next.next == null){
            curr.next = null;
        }
        curr.next = curr.next.next;

        return head;
    }

    public static void printReverse(Node head){
        if(head == null) return;
        Node curr = head;
        Stack<Node> s = new Stack<>();
        while(curr != null){
            s.push(curr);
            curr = curr.next;
        }
        while(!s.isEmpty()){
            Node res = s.pop();
            System.out.println(res.data);
        }

    }

    public static Node reverseList(Node head){
        if(head == null) return head;
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }

    public static boolean compareTwoList(Node head1, Node head2){
        if(head1 == null && head2 == null) return true;
        else if(head1 == null || head2 == null) return false;
        else {
            Node t1 = head1;
            Node t2 = head2;
            while (t1 != null && t2 != null) {
                if (t1.data != t2.data) {
                    return false;
                } else {
                    t1 = t1.next;
                    t2 = t2.next;
                }
                if (t1 == null && t2 == null) return true;
            }
            return false;
        }
    }

    public static boolean searchList(Node head, int data){
        Node curr = head;
        while(curr != null){
            if(curr.data == data){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public static int nthNodeFromLast(Node head, int pos){
        if(head == null) return -1;
             int len = 0;
             Node curr = head;
             while(curr != null){
                 curr = curr.next;
                 len++;
             }
            if(pos>len) return -1;
             int count = 0;
             curr = head;
             while(count < len-pos+1){
                 curr = curr.next;
             }

             return curr.data;
    }

    public static Node nthNodefromLastTwoPointer(Node head, int pos){
        Node dummy = new Node(0);
        dummy.next = head;

        Node s = dummy;
        Node f = dummy;
        for(int i=0;i<pos;i++){
            f = f.next;
        }
        while(f.next != null){
            s = s.next;
            f = f.next;
        }
        s.next = s.next.next;
        return dummy.next;
    }

    public static int middleNode(Node head){
        Node sp = head;
        Node fp = head;
        while(fp != null && fp.next != null){
            fp = fp.next.next;
            sp = sp.next;
        }
        return sp.data;
    }



    public static void main(String[] args) {
    Llist l = new Llist();
    }
}
