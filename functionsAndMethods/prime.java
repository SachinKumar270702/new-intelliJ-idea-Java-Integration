package functionsAndMethods;

public class prime {
    static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    static boolean isPrimeOptimized(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }
    static void primeInRange(int n){
        int totalPrime=0;
        for(int i=2;i<=n;i++){
            if(isPrimeOptimized(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
//        System.out.println(isPrime(8));
//        System.out.println(isPrimeOptimized(5));
        primeInRange(10000);
    }
}
