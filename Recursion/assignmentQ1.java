package Recursion;

import java.util.Scanner;

public class assignmentQ1 {
public static void rec(int n,int m,boolean flag){
    System.out.print(m+" ");
    if(flag==false && n==m) return;
    if(flag){
        if(m-5>0)
            rec(n,m-5,true);
        else
            rec(n,m-5,false);
    }
    else rec(n,m+5,false);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rec(n,n,true);
    }
}
