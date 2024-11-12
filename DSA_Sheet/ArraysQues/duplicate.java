package DSA_Sheet.ArraysQues;

import java.util.Arrays;

import static DSA_Sheet.ArraysQues.Reverse.printArr;

public class duplicate {
    static boolean containsDup(int[] arr){
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        /*question
        Given an integer array nums, return true if any value
        appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output:true
Explanation:
The element 1 occurs at the indices 0 and 3.
Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.
Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
         */
        int[] arr={1,1,1,3,3,4,3,2,4,2};
        printArr(arr);
        System.out.println(containsDup(arr));

    }
}
