package prev.src.loops;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        int evenSum=0,oddSum=0;
        int choice;
        do{
            number=sc.nextInt();
            if(number%2==0){
                evenSum+=number;
            }else{
                oddSum+=number;
            }
            System.out.println("Press 1 to continue and 0 to end");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
