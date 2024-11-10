package TwoDArray;

import java.util.Scanner;

public class spiralMatrixPrint {
    static void printSpiral(int[][] matrix){
        int startRow =0,startCol=0,endRow=matrix.length-1,endCol=matrix[0].length;

        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startCol==endCol){
                    return;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startRow++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int n){
        int[][] matrix=new int[n][n];
        int topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1;
        int current =1;

        while(current < n*n){
            //top row-> leftCol to rightCol
            for(int j = leftCol; j<=rightCol && current <=n*n; j++){
               matrix[topRow][j]=current++;
            }
            topRow++;
            //rightCol->topRow to bottomRow
            for(int i = topRow; i<=bottomRow && current <=n*n; i++){
                matrix[i][rightCol]=current++;
            }
            rightCol--;
            //bottom row-> rightCol to rightCol
            for(int j = rightCol; j>=leftCol && current <=n*n; j--){
                matrix[bottomRow][j]=current++;
            }
            bottomRow--;
            //leftCol->bottomRow to topRow
            for(int i = bottomRow; i>=topRow && current <=n*n; i--){
                matrix[i][leftCol]=current++;
            }
            leftCol++;
        }
        return matrix;
    }

    public static void spiralPrint(int[][] matrix,int r,int c){
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalElements=0;

        while(totalElements<r*c){
            //top row-> leftCol to rightCol
            for(int j=leftCol;j<=rightCol && totalElements<r*c;j++){
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
            //rightCol->topRow to bottomRow
            for(int i=topRow;i<=bottomRow && totalElements<r*c;i++){
                System.out.print(matrix[i][rightCol]+" ");
                totalElements++;
            }
            rightCol--;
            //bottom row-> rightCol to rightCol
            for(int j=rightCol;j>=leftCol && totalElements<r*c;j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
            //leftCol->bottomRow to topRow
            for(int i=bottomRow;i>=topRow && totalElements<r*c;i--){
                System.out.print(matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the no. of rows:");
//        int n= sc.nextInt();
//        System.out.println("Enter the no. of columns:");
//        int m= sc.nextInt();
//        int[][] matrix=new int[n][m];
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                matrix[i][j]=sc.nextInt();
//            }
//        }
//        System.out.println("Input matrix");
//        printMatrix(matrix);
//
//        System.out.println("Spiral Matrix");
//        printSpiral(matrix);

//        System.out.println("Enter thr value of n:");
//        int n=sc.nextInt();
//
//        int[][] ans=generateSpiralMatrix(n);
//        printMatrix(ans);
    }
}
