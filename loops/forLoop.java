package loops;

public class forLoop {
    public static void main(String[] args) {
        //syntax-->for(initialisation;condition;updation)
//        for(int i=0;i<=10;i++){
//            System.out.println(i);
//        }
//        for(int line=1;line<=4;line++){
//            System.out.println("* * * *");
//        }
        //print reverse of number;
//        int n=270702;
//        while(n>0){
//            int lastDigit=n%10;
//            System.out.print(lastDigit);
//            n/=10;
//        }
//        System.out.println();
        //reverse the no.
        int n=362544;
        int reverse=0;
        while(n>0){
            int lD=n%10;
            reverse=(reverse*10)+lD;
            n/=10;
        }
        System.out.println(reverse);
    }
}
