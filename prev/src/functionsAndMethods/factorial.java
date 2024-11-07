package prev.src.functionsAndMethods;

public class factorial {
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

    public static void main(String[] args) {
        int a=0;
        System.out.println(factorial(a));
    }
}
