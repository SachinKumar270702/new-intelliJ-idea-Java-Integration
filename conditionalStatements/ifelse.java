package conditionalStatements;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int age=16;
//        if(age>=18){
//            System.out.println("Adult");
//        }
//        if(age>13 && age<18){
//            System.out.println("Teenager");
//        }
//        else{
//            System.out.println("not Adult");
//        }
        //print the largest of 2 numbers.
//        int a=1,b=3;
//        if(a>b){
//            System.out.println(a);
//        }else{
//            System.out.println(b);
//        }
//        int a=sc.nextInt();
//        if(a%2==0){
//            System.out.println("even");
//        }else{
//            System.out.println("Odd");
//        }

        //ELSE-IF
//        System.out.println("Enter income:");
//        int income=sc.nextInt();
//        int tax;
//        if(income<500000){
//            tax=0;
//        }else if(income>500000 && income<1000000){
//            tax=(int)(income*0.2);
//        }else{
//            tax=(int)(income*0.3);
//        }
//        System.out.println("Your tax is: "+ tax);
        //ternary operator-->> variable=condition?statement1:statement2;
//        int larger=(5>3)?5:3;
//        System.out.println(larger);
//        String type=(5%2==0)?"even":"odd";
//        System.out.println(type);

        //check if a student is pass or fail;
        int marks= sc.nextInt();
        String result=(marks>=33)?"Pass":"Fail";
        System.out.println(result);
    }
}
