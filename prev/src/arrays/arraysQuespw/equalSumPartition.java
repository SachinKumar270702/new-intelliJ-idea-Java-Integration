package prev.src.arrays.arraysQuespw;

import java.util.Arrays;
import java.util.Scanner;

public class equalSumPartition {
    static int findArraySum(int[] arr){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum +=arr[i];
        }return totalSum;
    }

    static boolean equalSumPartition(int[] arr) {
        int totalSum=findArraySum(arr);
        int prefSum=0;
        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            prefSum += j;
            int suffixSum = totalSum - prefSum;
            if (suffixSum == prefSum) {
                return true;
            }
        }
        return false;
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
        boolean check=equalSumPartition(arr);
        if(check){
            System.out.println("There exists two sub arrays that have equal sum");
        }else{
            System.out.println("no sub array exists that have equal sum.");
        }
    }
}
