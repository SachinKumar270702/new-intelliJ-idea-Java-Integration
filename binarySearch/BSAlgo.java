package binarySearch;

import java.util.Scanner;

public class BSAlgo {
    static boolean recBinarySearch(int[] arr,int st,int end,int target){
        if(st>end) return false;
        int mid=st-(st-end)/2;
        if(target==arr[mid]){
            return true;
        }else if(target<arr[mid]){
            return recBinarySearch(arr,st,mid-1,target);
        }else{
            return recBinarySearch(arr,mid+1,end,target);
        }
    }
    static boolean BSearch(int[] arr,int target){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st-(st-end)/2;
            if(target==arr[mid]){
                return true;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,3,4,5,6,7,8,11,14,15};
        int target=0;
        while(target!=20){
            System.out.printf("%d exists in arr %b: \n",target,recBinarySearch(a,0,a.length-1,target));
            System.out.printf("%d exists in arr %b: \n",target,BSearch(a,target));
            System.out.println();
            target++;
        }

    }
}
