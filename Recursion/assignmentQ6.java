package Recursion;

public class assignmentQ6 {
    public static int toDecimal(int n){
        if(n==0) return 0;
        else
            return (n%2+10*toDecimal(n/2));
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println(toDecimal(n));
    }
}
