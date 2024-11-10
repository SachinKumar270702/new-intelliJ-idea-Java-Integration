package TwoDArray;

import java.util.Scanner;

import static TwoDArray.spiralMatrixPrint.printMatrix;

public class diagonalSum {
    static int DaigonalSum(int[][] matrix){
        int sum=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }else  if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n= sc.nextInt();
        System.out.println("Enter the no. of columns:");
        int m= sc.nextInt();
        int[][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input matrix");
        printMatrix(matrix);

        int ans=DaigonalSum(matrix);
        System.out.println(ans);

    }
}
