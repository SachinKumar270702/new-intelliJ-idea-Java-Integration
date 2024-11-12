package DSA_Sheet.ArraysQues;

import static DSA_Sheet.ArraysQues.Reverse.printArr;

public class searchInReverseArr {
    static int search(int[] nums,int target){
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[left]<=nums[mid]){
                if(nums[left]<=target && target<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else{
                if(nums[mid]<target && target<=nums[right]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
        }return -1;
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        printArr(arr);
        System.out.println(search(arr,target));
    }
}
