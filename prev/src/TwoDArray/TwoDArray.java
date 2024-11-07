package prev.src.TwoDArray;

import java.util.Scanner;

public class TwoDArray {
    public static boolean search(int[][] matrix,int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    static int largestElement(int[][] matrix){
        int maxNum=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>maxNum){
                    maxNum=matrix[i][j];
                }
            }
        }
        return maxNum;
    }

    static int smallestElement(int[][] matrix){
        int minNum=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<minNum){
                    minNum=matrix[i][j];
                }
            }
        }return minNum;
    }

    public static void main(String[] args) {
        //intro
        int[][] matrix=new int[3][3];
        int n= matrix.length,m=matrix[0].length;

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//        int key=sc.nextInt();
//        System.out.println(search(matrix,key));
        System.out.println("Largest Element:"+largestElement(matrix));
        System.out.println("Smallest Element:"+smallestElement(matrix));
    }
}
