package DSA_Sheet.ArraysQues;

import static DSA_Sheet.ArraysQues.Reverse.printArr;

public class maxProdeuctSubArr {
    static int maxProduct(int[] nums) {
        int ans = nums[0];
        int dpMin = nums[0];
        int dpMax = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            final int num = nums[i];
            final int prevMin = dpMin;
            final int prevMax = dpMax;
            if (num < 0) {
                dpMin = Math.min(prevMax * num, num);
                dpMax = Math.max(prevMin * num, num);
            } else {
                dpMin = Math.min(prevMin * num, num);
                dpMax = Math.max(prevMax * num, num);
            }
            ans = Math.max(ans, dpMax);
        }
        return ans;
    }
    public static void main(String[] args) {
        /*Question
        * Given an integer array nums, find a
subarray
 that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.



Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.


Constraints:

1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any subarray of nums is guaranteed to fit in a 32-bit integer.*/

        int[] arr={2,3,-2,4};
        printArr(arr);
        System.out.println(maxProduct(arr));
    }
}
