package conditionalStatements;

import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        int numb=2;
//        switch (numb){
//            case 1:
//                System.out.println("mango");break;
//            case 2:
//                System.out.println("banana");break;
//            case 3:
//                System.out.println("Apple");break;
//            default:
//                System.out.println("study");
//        }
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char operator=sc.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(a+b);break;
            case '-':
                System.out.println(a-b);break;
            case '*':
                System.out.println(a*b);break;
            case '/':
                System.out.println(a/b);break;
            case '%':
                System.out.println(a%b);break;
            default:
                System.out.println("Error");

        }
    }
}
