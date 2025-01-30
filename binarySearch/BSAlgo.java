package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

import static revision.dsaSheet.printArr;


public class BSAlgo {

    public static int squareRoot(int x)   {
        int st=0,end=x;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int val=mid*mid;
            if(val==x){
                return mid;
            } else if (val<x) {
                ans=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static int firstOccurrence(int[] arr,int target){
        int start=0,end=arr.length-1;
        int firstOcc=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                firstOcc=mid;
                end=mid-1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return firstOcc;
    }
    public static int lastOccurrence(int[] arr,int target){
        int start=0,end=arr.length-1;
        int lastOcc=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                lastOcc=mid;
                start=mid+1;
            }else if(target>arr[mid]){
                start=mid+1;;
            }else{
               end=mid-1;
            }
        }
        return lastOcc;
    }

    public static boolean recBinarySearch(int[] arr,int start,int end,int target){
        if(start>end) return false;
        int mid=start+(end-start)/2;
        if(target==arr[mid]) return true;
        else if (target<arr[mid]) {
            return recBinarySearch(arr,start,mid-1,target);
        }else{
            return recBinarySearch(arr,mid+1,end,target);
        }
    }
    public static boolean BSearch(int[] arr,int target){
        int start=0,end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                    return true;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,3,4,5,6,7,8,11,14,15};
        int[] a2={1,1,2,2,2,3,3,5,5,5,8,9,9};
        int target=3;
        System.out.println(Arrays.toString(a2));
//        while(target!=20){
//            System.out.printf("%d exists in arr %b: \n",target,recBinarySearch(a,0,a.length-1,target));
//            System.out.printf("%d exists in arr %b: \n",target,BSearch(a,target));
//            System.out.println();
//            target++;
//        }
//        System.out.println(firstoccurrence(a2,target));
//        System.out.println(squareRoot(69));
        System.out.println(lastOccurrence(a2,target));


    }
}
