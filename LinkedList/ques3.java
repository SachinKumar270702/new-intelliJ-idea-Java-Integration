package LinkedList;

public class ques3 {
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
    public static Node intersectingNodes(Node head1,Node head2){
        int l1=size(head1);
        int l2=size(head2);
        int steps=l1-l2;
        for(int i=1;i<=steps;i++){
            head1=head1.next;
        }
        while (head1!=head2){
            head1=head1.next;
            head2=head2.next;
        }
        return head1;
    }
    public static Node intersectingNode(Node head1,Node head2){
        //without using the size() function.
        Node temp1=head1,temp2=head2;
        int length1=0,length2=0;
        while(temp1!=null){
            length1++;
            temp1=temp1.next;
        }
        while (temp2!=null){
            length2++;
            temp2=temp2.next;
        }
        temp1=head1;
        temp2=head2;
        if(length1>length2){
            int steps=length1-length2;
            for(int i=1;i<=steps;i++){
                temp1=temp1.next;
            }
        }else{
            int steps=length2-length1;
            for(int i=1;i<=steps;i++){
                temp2=temp2.next;
            }
        }
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;

    }
    static public void display(Node head){
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
        h1.next.next.next=new Node(90);
        h1.next.next.next.next=new Node(9);
        h1.next.next.next.next.next=new Node(18);

        Node h2=new Node(5);
        h2.next=new Node(10);
        h2.next.next=new Node(11);
        h2.next.next.next=new Node(15);
        h2.next.next.next=h1.next.next.next;
        display(h1);
        display(h2);
        Node intersectingNode=intersectingNodes(h1,h2);
        Node intersectingNode1=intersectingNode(h1,h2);
        System.out.println(intersectingNode1.data);
        System.out.println(intersectingNode.data);
    }
}
