package LinkedListImplementation;

public class SinglyLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static Node head;
    static Node tail;
    static int size=0;
    //add at beginning
    public  void addAtBeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
        return;
    }
    public  void addAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        size++;
        return;
    }

    public void deleteAtBeginning(){
        if(head==null){
            System.out.println("nothing to delete");
            return;
        }
        head=head.next;
        size--;
        System.out.println("first node deleted");
        return;

    }
    public void deleteAtPosition(int position){
        Node temp=head;
        if(position>size-1){
            System.out.println("Invalid position");
            return;
        }
        if(head==null){
            System.out.println("Nothing to delete");
            return;
        }
        if(position==1){
            deleteAtBeginning();
        }
        int i=0;
        while(i<position-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        size--;

    }

    public void display(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList ll=new SinglyLinkedList();
        ll.addAtBeginning(3);
        ll.addAtBeginning(2);
        ll.addAtBeginning(1);
        ll.addAtEnd(4);
        ll.display();

        System.out.println("Size is : "+size);
        ll.deleteAtPosition(3);
        ll.deleteAtPosition(4);
        System.out.println("===========================");
        ll.display();

        System.out.println("Size is : "+size);
    }
}
