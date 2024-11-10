package practice;

public class twoDArray {
    static int repectingNum(int[][] matrix,int num){
        int repVal=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]%num==0){
                    repVal++;
                }
            }
        }return repVal;
    }


    public static void printMatrix(int[][] matrix){
        System.out.println("The matrix is: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int rowSum(int[][] matrix,int row){
        int sum=0;
        for(int j=0;j<matrix[0].length;j++){
            sum+=matrix[row][j];
        }
        return sum;
    }
    public static void main(String[] args) {
//        int [][] matrix={{4,7,8},{8,8,7}};
//        int[][] matrix2={{1,4,9},{11,4,3},{2,2,3}};
//        int row=0;
//        int num=8;
////        System.out.println(repectingNum(matrix,num));
//        System.out.println(rowSum(matrix2,row));
        int row=2,col=3;
        int[][] matrix={{4,7,8},{8,8,7}};
        printMatrix(matrix);

        int[][] transpose=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        printMatrix(transpose);


    }
}
