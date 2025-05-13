package practice.algo;

public class arrays {
    static void checkEven(int n){
        if((n & 1)==0){
            System.out.println("even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
checkEven(5);
    }
}
