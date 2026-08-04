package day3;

import java.util.Scanner;

class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
public class InsertNodeAtTail {
    
    public static Node head;
    
    
    public static void insertAtTail(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            System.out.println(data);
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        System.out.println(data);
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int num=sc.nextInt();
            insertAtTail(num);
            n--;
        }
        
    }
}
