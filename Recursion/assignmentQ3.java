package Recursion;

import java.util.Scanner;

public class assignmentQ3 {
//    public static boolean Armstrong(int n){
//
//    }
    public static int pow(int p,int q){
        if(q==0) return 1;
        if(q%2==0){
            return pow(p,q/2)*pow(p,q/2);
        }else{
            return p*pow(p,q/2)*pow(p,q/2);
        }
    }
    static public int rec(int n,int dig){
        if(n==0) return 0;
        return pow(n%10,dig)+rec(n/10,dig);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n=sc.nextInt();
        int digits=0;
        int temp=n;
        while(temp>0){
            digits++;
            temp/=10;
        }
        if(n==rec(n,digits))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
