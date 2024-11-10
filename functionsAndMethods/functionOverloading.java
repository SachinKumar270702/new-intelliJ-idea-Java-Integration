package functionsAndMethods;

public class functionOverloading {
//    public static int sum(int a,int b){
//        return a+b;
//    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    static float sum(float a,float b,float c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(9.7f,4.87f,6.9f));
    }
}
