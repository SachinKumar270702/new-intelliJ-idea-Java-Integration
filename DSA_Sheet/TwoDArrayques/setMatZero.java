package DSA_Sheet.TwoDArrayques;



public class setMatZero {
    static void printMatrix(int[][] matrix){
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               System.out.print(matrix[i][j]+",");
           }
           System.out.println();
       }
        System.out.println();
    }
    static void setMatrixZero(int[][] matrix){
        int m=matrix.length;
        int n=matrix[0].length;

        boolean[] r=new boolean[m];
        boolean[] c=new boolean[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    r[i]=true;
                    c[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(r[i]||c[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        /*ques
        * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.
Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
Constraints:
m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1*/
        int[][] mat={{0,2,3,0},{3,4,5,2},{1,2,1,5}};

        setMatrixZero(mat);
        printMatrix(mat);

    }
}
