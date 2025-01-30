package binarySearch;

import java.util.Arrays;

import static binarySearch.boundingIdx.findHgBoundIdx;
import static binarySearch.boundingIdx.findLwBoundIdx;

public class occurrence {

    static int firstOcc(int[] arr,int x){
        int st=0,end=arr.length-1;
        int fO=-1;
        while(st<end){
            int mid=st+(end-st)/2;
            if(x==arr[mid]){
                fO=mid;
                end=mid-1;
            } else if (arr[mid]<x) {
                st=mid+1;
            } else{
                end=mid-1;
            }
        }
        return fO;
    }
    static int lastOcc(int[] arr,int k){
        int s=0,e=arr.length-1;
        int lO=-1;
        while (s<=e){
            int m=s+(e-s)/2;
            if(k==arr[m]){
                lO=m;
                s=m+1;
            } else if (arr[m]<k) {
                s=m+1;
            }else{
                e=m-1;
            }
        }return lO;
    }
    static int[] Occ(int[] a,int x){
        int lb=findLwBoundIdx(a,x);
        if(lb==a.length||a[lb]!=x) return new int[]{-1,-1};
        return new int[]{lb, findHgBoundIdx(a, x) - 1};
    }
    static int countOcc(int[] arr,int k){
        return lastOcc(arr,k)-firstOcc(arr,k)+1;
    }
    public static void main(String[] args) {
        int[] arr={0,1,1,2,2,2,5,5,5,5,5,5,7,7,7,9,9,9};
        System.out.println(arr.length);
        int k=7;
//        System.out.println(Arrays.toString(Occ(arr,k)));
        System.out.println(firstOcc(arr,k));
        System.out.println(lastOcc(arr,k));
        System.out.println(countOcc(arr,k));
    }
}
