package prev.src.TwoDArray;

import java.util.Scanner;

public class prefixSumInMatrix {
    static int findSumOptimised(int[][] matrix,int l1,int r1,int l2,int r2){
        int ans=0,sum=0,up=0,left=0,leftUp=0;

        findPrefixSumMatrix2(matrix);
        sum=matrix[l2][r2];
        if(r1>=1){
        left=matrix[l2][r1-1];}
        if(l1>=1){
        up=matrix[l1-1][r2];}
        if(l1>=1 && r1>=1){
        leftUp=matrix[l1-1][r1-1];}

        ans=sum-up-left+leftUp;
       return ans;
    }

    static void findPrefixSumMatrix2(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        //traverse horizontally to cal row wise prefix sum.
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
        //traverse vertically to cal column wise prefix sum.
        for(int j=0;j<c;j++){
            for(int i=1;i<r;i++){
                matrix[i][j]+=matrix[i-1][j];
            }
        }
    }
    static void findPrefixSumMatrix(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        //traverse horizontally to cal row wise prefix sum.
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
    }

    static int MatrixSum2(int[][] matrix,int l1,int r1,int l2,int r2){
        int sum=0;
        findPrefixSumMatrix(matrix);
        for(int i=l1;i<=l2;i++){
            if(r1>=1){
                sum+=matrix[i][r2]-matrix[i][r1-1];
            }else{
                sum+=matrix[i][r2];
            }
        }
        return sum;
    }

    static int matrixSum(int[][] matrix,int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows of matrix:");
        int n1= sc.nextInt();
        System.out.println("Enter the no. of columns of Matrix:");
        int m1= sc.nextInt();
        System.out.println("Enter the elements of Matrix");
        int[][] matrix=new int[n1][m1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter rectangle boundaries l1 r1 l2 r2" );
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        int l2= sc.nextInt();
        int r2= sc.nextInt();

        System.out.println("Rectangle Sum "+matrixSum(matrix,l1,r1,l2,r2));
        System.out.println("Rectangle Sum "+MatrixSum2(matrix,l1,r1,l2,r2));
        System.out.println("Rectangle Sum "+findSumOptimised(matrix,l1,r1,l2,r2));
    }
}
