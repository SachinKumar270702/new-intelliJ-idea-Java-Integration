package LinkedList;

import java.util.List;

public class ques4 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    public static int size(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static ListNode rightMiddleNode(ListNode head){
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static ListNode leftMiddleNode(ListNode head){
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void display(ListNode head){
        if(head==null){
            System.out.println();
            return;
        }
        System.out.print(head.val+" ");
        display(head.next);
    }

    public static void main(String[] args) {
        ListNode h1=new ListNode(1);
        h1.next=new ListNode(3);
        h1.next.next=new ListNode(5);
        h1.next.next.next=new ListNode(6);
        h1.next.next.next.next=new ListNode(2);
        h1.next.next.next.next.next=new ListNode(9);
        display(h1);
        ListNode mid=rightMiddleNode(h1);
        if(size(h1)%2==0){
            System.out.println("Right Middle of the list is: "+mid.val);
            ListNode mid2=leftMiddleNode(h1);
            System.out.println("Left Middle of the list is: "+mid2.val);
        }
        else{
            System.out.println("Middle of the list is: "+mid.val);
        }


    }
}
