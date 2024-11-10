package Recursion;

import java.util.Scanner;

public class secondClass {
    static int seriesSum(int n){
        if(n==1 || n==0){
            return n;
        }
        return seriesSum(n-1)+n;
    }

    static int alternateSignSum(int n){
        if(n==0) return 0;
        if(n%2==0){
            return seriesSum(n-1)-n;
        }else{
            return seriesSum(n-1)+n;
        }
    }

    static int multiple(int n,int k){
        if(k==1){
            return n;
        }
        return multiple(n,k-1)+n;
    }

    static void multiple2(int n,int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        multiple2(n,k-1);
        System.out.println(n*k);
    }

      static int sum(int n){
          if(n>=0 && n<=9){
              return n;
          }
          return sum(n/10)+n%10;
      }

      static int power(int p,int q){
          if(q==0){
              return 1;
          }
          return power(p,q-1)*p;
      }

    static int power2(int p,int q){
        if(q==0){
            return 1;
        }
        if(q%2==0){
            return power2(p,q/2)*power2(p,q/2);
        }
            return p*power2(p,q/2)*power2(p,q/2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println(sum(12348));
//        System.out.println(power2(245,3));
//        System.out.print("Enter the value of num:");
//        int n=sc.nextInt();
//        System.out.print("Enter the value of K:");
//        int k=sc.nextInt();
//        for(int i=1;i<=k;i++){
//            System.out.println(multiple(n,i));
//        }
//        multiple2(n,k);
//        System.out.println(seriesSum(4));
        System.out.println(alternateSignSum(6));
    }
}
