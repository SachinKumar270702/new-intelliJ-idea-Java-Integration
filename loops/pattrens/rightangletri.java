package loops.pattrens;

public class rightangletri {
    public static void main(String[] args) {
        //star pattern
        int n=4;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//inverted star pattern
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=(n-i+1);j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //half-pyramid (numbers)
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        print character pattern
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }


    }
}
