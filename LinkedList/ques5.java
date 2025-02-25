package LinkedList;

public class ques5 {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static void deleteMidNode(Node head){
        if(head.next==null){
            return;
        }
        Node fast=head,slow=head;
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
    }
    public static void display(Node head){
        if(head==null) {
            System.out.println();
            return;
        }
        System.out.print(head.val+" ");
        display(head.next);
    }
    public static void main(String[] args) {
        Node h1=new Node(1);
        h1.next=new Node(2);
        h1.next.next=new Node(3);
        h1.next.next.next=new Node(4);
        h1.next.next.next.next=new Node(5);
        h1.next.next.next.next.next=new Node(6);
        h1.next.next.next.next.next.next=new Node(7);
        display(h1);
        deleteMidNode(h1);
        display(h1);
    }
}
