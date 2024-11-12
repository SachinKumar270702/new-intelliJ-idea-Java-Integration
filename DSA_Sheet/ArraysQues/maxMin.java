package DSA_Sheet.ArraysQues;

public class maxMin {
    static int minValue(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    static int maxValue(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        /*Question:
        Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

        Examples:

        Input: arr[] = {3, 5, 4, 1, 9}
        Output: Minimum element is: 1
        Maximum element is: 9


        Input: arr[] = {22, 14, 8, 17, 35, 3}
        Output:  Minimum element is: 3
        Maximum element is: 35*/
        int arr[]={1,5,5,8,0,3,6,8,-1,4,-7,-9,-3,78,3546,962};
        System.out.println("Minimum value in the arr");
        System.out.println(minValue(arr));
        System.out.println("Maximum value in the arr");
        System.out.println(maxValue(arr));

    }
}
