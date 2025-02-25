package LinkedList;

public class ques1 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int size(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static int KthEleEnd(int idx,Node head){
        if(idx>size(head) || idx<size(head)){
            System.out.println("Invalid input");
            return -1;
        }
        Node fast=head;
        Node slow=head;
        for(int i=1;i<=idx;i++) fast = fast.next;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }
    public static void display(Node head){
        if(head==null){
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void main(String[] args) {

        Node h1=new Node(1);
        h1.next=new Node(2);
        h1.next.next=new Node(3);
        h1.next.next.next=new Node(4);
        h1.next.next.next.next=new Node(5);
        h1.next.next.next.next.next=new Node(6);
        display(h1);
        System.out.println(KthEleEnd(10,h1));

    }
}
