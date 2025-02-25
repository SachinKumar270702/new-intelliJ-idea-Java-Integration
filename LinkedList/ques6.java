package LinkedList;

public class ques6 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static boolean isCycle(Node head){
       Node fast=head,slow=head;
       while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast){
               return true;
           }
       }
       return false;
    }
    public static void display(Node head){
        if(head==null) {
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void main(String[] args) {
        // Create a linked list with cycle
        Node h1 = new Node(1);
        h1.next = new Node(2);
        h1.next.next = new Node(3);
        h1.next.next.next = new Node(4);
        h1.next.next.next.next = new Node(5);
        h1.next.next.next.next.next = h1.next; // Creating cycle by pointing last node to second node

        // Create a linked list without cycle
        Node h2 = new Node(1);
        h2.next = new Node(2);
        h2.next.next = new Node(3);
        h2.next.next.next = new Node(4);

        // Test cycle detection
        System.out.println("List with cycle: " + isCycle(h1));
        System.out.println("List without cycle: " + isCycle(h2));
    }
}
