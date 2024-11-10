package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    static void kadanes(int[] arr){
        int maxSum=Integer.MIN_VALUE,currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum<0){
                currentSum=0;
            }
            maxSum=Math.max(currentSum,maxSum);
        }
    }
    static void maxSubArrayPrefixsum(int[] arr){
        int maxSum=Integer.MIN_VALUE,currentSum=0;
        int prefix[]=new int[arr.length];
        //calculate prefix arr
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currentSum=0;
                currentSum= start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("Max Sum "+maxSum);
    }
    static void maxSubArraySum(int[] arr){
        int maxSum=Integer.MIN_VALUE,currentSum=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currentSum=0;
                for(int k=start;k<=end;k++){
                    currentSum+=arr[k];
                }
                System.out.print(currentSum+",");
                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("Max Sum "+maxSum);
    }
    static void subArray(int[] arr){
        int totalPair=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                totalPair++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subArrays are :"+totalPair);
    }
    static void pairInArray(int[] arr){
        int n=arr.length;
        int tp=0;
        for(int i=0;i<n;i++){
           int  current=arr[i];
            for(int j=i+1;j<n;j++){
                System.out.print("["+current+","+arr[j]+"] , ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pair "+tp);
    }
    static void swapInArray(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseArray(int[] arr){
        int i=0,j=arr.length-1;
        while (i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
    static int linearSearch(int[] arr,int key){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    static int largestNumber(int[] arr){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }return ans;
    }
    static int smallestNumber(int[] arr){
        int ans=Integer.MAX_VALUE;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }return ans;
    }
    static int binarySearch(int[] arr,int key){
        int start=0,end= arr.length-1;
        while(start<=end){
            int mid=(end+start)/2;

            if(arr[mid]==key){
                return mid;
            }
            if (arr[mid]<key) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array"+ Arrays.toString(arr));
//        int[] arr = {2,3,4,6,8,9,12,14};
//        int target=1;
//        System.out.println(linearSearch(arr,target));
//        int[] arr={2,4,6,8,10,12,14};
//        reverseArray(arr);
//        System.out.println(arr);
//        System.out.println(binarySearch(arr,6));

//        pairInArray(arr);
//        subArray(arr);
//        maxSubArraySum(arr);
        maxSubArrayPrefixsum(arr);



    }
}
