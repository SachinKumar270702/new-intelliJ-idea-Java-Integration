package prev.src.functionsAndMethods;

import java.util.Scanner;

public class binomialCoefficient {
    static int factorial(int a) {
        if(a==0){
            return 1;
        }else{
            int fact=1;
            for(int i=a;i>=1;i--){
                fact*=i;
            }return fact;
        }
    }
    static int binoCo(int n,int r){
        int nCr=(factorial(n)/(factorial(r)*factorial(n-r)));
        return nCr;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n and r to calculate binomial coefficient");
        System.out.print("n: ");int n=sc.nextInt();
        System.out.print("r: ");int r=sc.nextInt();
        int binocof=binoCo(n,r);
        System.out.println(n+"C"+r+"="+binocof);
    }
}

