package DSA_Sheet.ArraysQues;

import static DSA_Sheet.ArraysQues.Reverse.printArr;

public class maxSubArr {
    static int max(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;

        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
            }if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        /*question
        * Given an integer array nums, find the
subarray
 with the largest sum, and return its sum.



Example

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.*/

        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        printArr(nums);

        System.out.println(max(nums));



    }
}
