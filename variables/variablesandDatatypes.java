package variables;

import java.util.Scanner;

public class variablesandDatatypes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int A=sc.nextInt();
//        int B=sc.nextInt();
//        int C=sc.nextInt();
//        int average=(A+B+C)/3;
//        System.out.println(average);

//        int side=sc.nextInt();
//        int area=side*side;
//        System.out.println(area);

        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=pen+pencil+eraser;
        System.out.println("total: "+total);
        float tax= ((total*18)/100);
        System.out.println("total tax: "+tax);
        float bill=tax+total;
        System.out.println("bill: "+bill);




    }

}
