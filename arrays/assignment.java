package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class assignment {
    static int chocoDist(int[] arr,int m) {
        if(arr.length==0||m==0){
            return 0;
        }
        Arrays.sort(arr);
        if(arr.length-1<m){
            return -1;
        }
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int nextWindow=i+m-1;
            if(nextWindow>=arr.length){
                break;
            }
            int diff=arr[nextWindow]-arr[i];
            minDiff=Math.min(minDiff,diff);
        }
        return minDiff;

    }
    public int search(int[] nums, int target) {
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
    static boolean duplicateNumber(int[] arr){
//            4-->Given an integer array nums,
//            return true if any value appears at least twice in the array,
//            and return false if every element is distinct.
//            Example 1:
//            Input: nums = [1,2,3,1]
//            Output: true
//            Example 2:
//            Input: nums = [1,2,3,4]
//            Output: false
//            Example 3:
//            Input: nums = [1,1,1,3,3,4,3,2,4,2]
//            Output: true
                int n=arr.length;

                for(int i=0;i<n;i++){
                    for(int j=i+1;j<n;j++){
                     if(arr[i]==arr[j]){
                         return true;
                     }
                    }
                }
                return false;
    }
    public static void main(String[] args) {

//dsa sheet-->>4,6,8,11,16
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array"+ Arrays.toString(arr));
//        System.out.println(duplicateNumber(arr));
        int m=sc.nextInt();
        int result=chocoDist(arr,m);
        if(result!=-1){
            System.out.println("min. difference: "+result);
        }else {
            System.out.println("invalid input");
        }
    }
}
