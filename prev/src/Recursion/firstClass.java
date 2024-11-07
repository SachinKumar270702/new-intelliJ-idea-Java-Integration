package prev.src.Recursion;
import java.util.Scanner;
public class firstClass {

    static int factorial(int n){
        if(n==0){
            return 1;
        }
       return n*factorial(n-1);
    }
    static  int fibonacci(int n){
        if(n==1 || n==0){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    static void printIncreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

    static void printDecreasing(int n){
        //base case
        if(n==1){
            System.out.println(1);
            return;
        }
        //self work
        System.out.println(n);
        //recursive work
        printDecreasing(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
//        printIncreasing(n);
//        printDecreasing(n);
//        System.out.println(factorial(n));
        for(int i=0;i<=n;i++){
            System.out.println(fibonacci(i));
        }

    }
}

