package revision;

import java.security.spec.RSAOtherPrimeInfo;

public class array {
    static public void printSubArray(int[] arr){
        int n=arr.length;
       for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
               for(int k=i;k<=j;k++){
                   System.out.print(arr[k]+" ");
               }
               System.out.println();
           }
           System.out.println();
       }

    }

    static public void maxSubArraySum(int[] arr){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum of thr Sub Arrays is:"+maxSum);
    }

    static public void maxSubArrSum(int[] arr){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int[] prefix=new int[arr.length];

        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                 int end=j;

                currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println(maxSum);
    }

    static public void pairsInArr(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    static public void reverseArr(int[] arr){
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static public int binarySearch(int[] arr,int key){
        int n=arr.length;
        int start=0,end=n-1;

        while(start<=end){
            int mid=(end+start)/2-start;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    static public int largestNumInArr(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
    //linear Search-->to return the next index of the target;
    static public void linearSearch(int[] arr,int target){
        int n=arr.length;
        int tarIn = 0;
        for(int i=0;i<n;i++){
            int tar=(arr[i]==target)?tarIn=i:-1;
        }
        System.out.println(tarIn);
    }

    //to return the every index of thr target
    static public void linearSearch2(int[] arr,int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                System.out.println(i);
            }
        }

    }
    //to return the first index of thr target
    static public int linearSearch3(int[] arr,int target){
        int n=arr.length;
        int tarIn = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }




    public static void main(String[] args) {
//        int [] arr={9,3,1,0,6,2,4,9,7,6};
        int [] arr={1,-2,6,-1,3};
        //linear Search
//        System.out.println(linearSearch(arr,8));
//            linearSearch(arr,2);
//        System.out.println();
//            linearSearch2(arr,2);
//        System.out.println();
//        System.out.print(linearSearch3(arr,2));

//        System.out.println(largestNumInArr(arr));
//        System.out.println(binarySearch(arr,6));
//        reverseArr(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//        pairsInArr(arr);
//        printSubArray(arr);
        maxSubArraySum(arr);
        maxSubArrSum(arr);

    }
}
