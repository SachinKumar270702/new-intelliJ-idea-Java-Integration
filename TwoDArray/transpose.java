package TwoDArray;

import java.util.Scanner;


public class transpose {


    static void reverseArray(int[] arr){
        int i=0,j= arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][] matrix,int r){
        inPlaceTranspose(matrix,r,r);
        for(int i=0;i<r;i++){
            reverseArray(matrix[i]);
        }
    }
    static int[][] transpose(int[][] matrix,int r,int c){
        int[][] ans=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
    static void inPlaceTranspose(int[][] matrix,int r,int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                //swap
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }

    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
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
        System.out.println("Input Matrix:");
        printMatrix(matrixA);
        System.out.println("Transpose of the matrix is:");

        /*
       int[][] ans=transpose(matrixA,n1,m1);
        printMatrix(ans);

        inPlaceTranspose(matrixA,n1,m1);
        printMatrix(matrixA);

        rotate(matrixA,n1);
        printMatrix(matrixA);
        */




    }
}
