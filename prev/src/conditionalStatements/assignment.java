package prev.src.conditionalStatements;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        int a=sc.nextInt();
//        String result=(a>=0)?"Positive":"Negative";
//        System.out.println(result);

//        double temp=103.5;
//        if(temp>100) System.out.println("You have Fever");
//        else System.out.println("You don't have fever");
//        int numb=sc.nextInt();
//        switch(numb){
//            case 1:
//                System.out.println("Monday");break;
//            case 2:
//                System.out.println("tuesday");break;
//            case 3:
//                System.out.println("wednesday");break;
//            case 4:
//                System.out.println("Thursday");break;
//            case 5:
//                System.out.println("friday");break;
//            case 6:
//                System.out.println("saturday");break;
//            case 7:
//                System.out.println("sunday");break;
//            default:
//                System.out.println("Error");
//        }
        int year=sc.nextInt();

        boolean x=(year%4)==0;
        boolean y=(year%100)!=0;
        boolean z=((year%100==0)&&(year%400==0));

        if(x && (y||z)){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
    }
}
