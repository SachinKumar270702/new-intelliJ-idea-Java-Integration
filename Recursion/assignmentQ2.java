package Recursion;

import java.util.Scanner;

public class assignmentQ2 {
    public static int rec(int n,int m){
        if(m==1)
            return sumRec(n);
        int sum=rec(n,m-1);
        return sumRec(sum);
    }
    public static int sumRec(int n){
        int ans=0;
        if(n==1){
            ans++;
            return ans;
        }
        ans+=n+sumRec(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(rec(n,m));
    }
}
