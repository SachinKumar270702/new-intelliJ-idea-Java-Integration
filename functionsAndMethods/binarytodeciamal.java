package functionsAndMethods;

public class binarytodeciamal {
    static void DtoB(int n){
        int pow=0,binNum=0,mynum=n;
        while(n>0){
            int remainder=n%2;
            binNum=binNum+(remainder*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binary of "+mynum+"="+binNum);
    }
    static void bToD(int binNum){
       int pow=0,decNum=0,myNum=binNum;

       while (binNum>0){
           int lastDigit=binNum%10;
           decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
           pow++;
           binNum=binNum/10;
       }
        System.out.println("decimal of "+myNum+"="+decNum);
    }
    public static void main(String[] args) {
//        bToD(11101);
        DtoB(5);
        bToD(111);
    }
}
