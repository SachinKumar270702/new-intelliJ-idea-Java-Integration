package Recursion;

import java.util.ArrayList;

public class linearSearch {
    static void isSorted(int[] arr,int n,int idx){
        if(idx>=n){
            System.out.println("not sorted");
            return;
        }
        if(arr[idx]<arr[idx+1]){
            System.out.println("Sorted");
        }
        isSorted(arr,n,idx+1);
    }



    static ArrayList<Integer> allIndices(int[] a,int n,int target,int idx) {
        ArrayList<Integer> ans=new ArrayList<>();
        if (idx >= n) {
            return ans;//return empty arraylist
        }
        if (a[idx] == target) {
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = allIndices(a, n, target, idx + 1);
        ans.addAll(smallAns);
        return ans;
    }
    static void targetNumIdx(int[] arr,int n,int target,int idx){
        if(idx>=n){
            return;
        }
        if(arr[idx]==target){
            System.out.println(idx);
        }
        targetNumIdx(arr,n,target,idx+1);
    }
    static boolean targetNum(int[] arr,int n,int target,int idx){
        if(idx>=n){
            return false;
        }
        if(arr[idx]==target){
            return true;
        }
        return targetNum(arr,n,target,idx+1);
    }
    static int targetNum2(int[] arr,int n,int target,int idx){
        if(idx>=n){
            return -1;
        }
        if(arr[idx]==target){
            return idx ;
        }
        int number=targetNum2(arr,n,target,idx+1);
        return number;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,2,6,5,6,2,1,2,2};
        int target=2;
//        if(targetNum(arr, arr.length-1, target,0)){
//            System.out.println("Yes");
//        }else{
//            System.out.println("NO");
//        }
//        System.out.println(targetNum2(arr, arr.length-1,target,0 ));
//        targetNumIdx(arr, arr.length, target,0);

//        ArrayList<Integer> ans=allIndices(arr, arr.length, target,0);
//
//        for(Integer i:ans){
//            System.out.println(i);}
//            isSorted(arr,arr.length,0);

    }
}
