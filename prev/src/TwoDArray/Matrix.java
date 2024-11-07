package prev.src.TwoDArray;

import java.util.Scanner;

public class Matrix {


    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void MultiplyTwoMatrix(int[][] matrix1,int r1,int c1,int[][] matrix2,int r2,int c2) {
    if(c1!=r2){
        System.out.println("Multiply Not possible:Invalid input...");
        return;
        }
    int[][] multiply=new int[r1][c2];
    for(int i=0;i<r1;i++) {
        for (int j = 0; j < c2; j++) {
            for (int k = 0; k < c1; k++) {
                multiply[i][j] +=matrix1[i][k]*matrix2[k][j];
            }
        }
    }
    printMatrix(multiply);
    }


        static void AddTwoMatrix(int[][] matrix1,int r1,int c1,int[][] matrix2,int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong input: Addition not possible..");
            return;
        }
        int[][] sum=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        printMatrix(sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows of matrix A:");
        int n1= sc.nextInt();
        System.out.println("Enter the no. of columns of Matrix A:");
        int m1= sc.nextInt();
        System.out.println("Enter the elements of Matrix A");
        int[][] matrixA=new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                matrixA[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the no. of rows of matrix B:");
        int n2= sc.nextInt();
        System.out.println("Enter the no. of columns  of matrix B:");
        int m2= sc.nextInt();
        System.out.println("Enter the elements of Matrix B");
        int[][] matrixB=new int[n2][m2];
        for(int i=0;i<n2;i++){
            for(int j=0;j<m2;j++){
                matrixB[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix A");
        printMatrix(matrixA);
        System.out.println("Matrix B");
        printMatrix(matrixB);
        System.out.println("Added Matrix");
        AddTwoMatrix(matrixA,n1,m1,matrixB,n2,m2);
        System.out.println("Multiplied Matrix");
        MultiplyTwoMatrix(matrixA,n1,m1,matrixB,n2,m2);
    }
}

