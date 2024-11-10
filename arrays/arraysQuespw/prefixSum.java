package arrays.arraysQuespw;

import java.util.Arrays;
import java.util.Scanner;

public class prefixSum {

    static int[] makePrefixSum(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];//arr[i]=arr[i]+arr[i-1]
        }
        return arr;
    }

    static int[] prefixSum(int[] arr){
        int n=arr.length;
        int[] pref=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
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
//        int[] prefSum=prefixSum(arr);
        int[] prefSum=makePrefixSum(arr);
        System.out.println("prefix sum of array"+ Arrays.toString(prefSum));
    }
}
