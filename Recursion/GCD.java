package Recursion;

import java.util.Scanner;

public class GCD {
    static int euclidAlgo(int x,int y){
        if(y==0){
            return x;
        }
        return euclidAlgo(y,x%y);
    }

    static int GcdLongDiv(int x,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

//        System.out.println(GcdLongDiv(x,y));
        System.out.println(euclidAlgo(x,y));
    }
}
