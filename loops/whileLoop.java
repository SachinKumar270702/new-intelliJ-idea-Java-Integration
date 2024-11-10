package loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int counter=0;
//        while(counter<100){
//            System.out.println("hello world");
//            counter++;
//        }
//        System.out.println("printed HW 100x");
//print numbers from 1 to n;
//        int num=1;
//        int n=100;
//        while(num<=n){
//            System.out.print(num+" ");
//            num++;
//        }
//        System.out.println();
        //print sum of first natural number;
        int sum=0;
        int counter=1;
        int n=sc.nextInt();
        while(counter<=n){
            sum+=counter;
            counter++;
        }
        System.out.println(sum);

    }
}
