package arrays.arraysQuespw;

import java.util.Scanner;

public class runningSum {

    static int[] makePrefixSum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];//arr[i]=arr[i]+arr[i-1]
        }
        return arr;
    }

    static void runningSumOfArray(int[] arr,int left,int right){
        int n=arr.length;
        int runningSum=0;
        while(left<=right){
            runningSum+=arr[left];
            left++;
        }
        System.out.println(runningSum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();

        int[] arr=new int[n+1];
        System.out.println("Enter "+n+" elements");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
//        System.out.println("Enter the value of left and right index resp. :");
//        int left=sc.nextInt();
//        int right=sc.nextInt();
//        System.out.print("sum from "+left+"th to "+right+"th element is:");
//        runningSumOfArray(arr,left,right);
        System.out.println("Enter number of queries: ");
        int[] prefSum=makePrefixSum(arr);
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("enter Range");
            int left=sc.nextInt();
            int right=sc.nextInt();
            int ans=prefSum[right]-prefSum[left-1];
            System.out.println("Sum" +ans);
        }
    }
}
