package prev.src.loops;

import java.util.Scanner;

public class dowhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int counter=1;
//        do{
//            System.out.println(counter+"Hello World");
//            counter++;
//
//        }while(counter<=10);

        //break statement

//        do{
//            int n=sc.nextInt();
//            if(n%10==0) break;
//            System.out.println(n);
//        }while(true);
//        System.out.println("Out of loop");


        //continue Statement
//        for(int i=1;i<=5;i++){
//            if(i==3) continue;
//            System.out.println(i);
//        }
        //check whether a number is prime or not.
        int number=sc.nextInt() ;

        if(number==2){
            System.out.println("prime");
        }else{
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(number);i++){
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("prime");
            }else{
                System.out.println("composite");
            }
        }

    }

}
