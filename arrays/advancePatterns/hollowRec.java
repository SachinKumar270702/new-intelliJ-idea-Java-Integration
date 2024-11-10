package arrays.advancePatterns;

public class hollowRec {


        public static void hollowRectangle ( int Rows, int cols){
            //outer loop
            for (int i = 1; i <= Rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    //cell-(i,j)
                    if (i == 1 || i == Rows || j == 1 || j == cols) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
        }

    public static void main(String[] args) {

    }
    }




