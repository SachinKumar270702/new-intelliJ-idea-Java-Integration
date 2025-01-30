package binarySearch;

import java.util.Arrays;

public class bSearchAlgoQues {
    static public int[] searchMatrix(int[][] a,int target){
        int n=a.length,m=a[0].length;
        int st=0,end=n*m-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int midEle=a[mid/m][mid%m];
            if(midEle==target) return new int[]{mid / m, mid % m};
            if(target<midEle){
                end=mid-1;
            }else {
                st=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] searchInMatrix(int[][] arr,int target) {
        int n = arr.length, m = arr[0].length;
        int i = 0, j = m - 1;
        while (i < n && j >= 0) {
            if (arr[i][j] == target) return new int[]{i, j};

            if (target < arr[i][j]) {
                j--;
            } else {
                i++;
            }
        }return new int[]{-1,-1};
    }
    public static int peakEle(int[] arr){
        int st=0,end=arr.length;
        int ans = -1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]<arr[mid+1]){
                ans=mid+1;
                st=mid+1;
            }else {
                end=mid-1;
            }
       } return ans;
    }
    static public int peakElement(int[] arr){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if((mid==0 || arr[mid]>arr[mid-1]) && (mid== arr.length-1||arr[mid]>arr[mid+1])){
                return mid;
            }if(arr[mid]<arr[mid+1]){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }return -1;
    }

    public static void main(String[] args) {
        int[][] arr={{2,4,6,8},
                    {5,6,7,20},
                    {7,11,13,25},
                    {12,14,17,30}};

        int[] arr2={0,4,5,8,4,9,1,0};
        int[] arr3={1,2,1,3,5,6,4};

//        System.out.println(Arrays.toString(searchMatrix(arr,10)));
//        System.out.println(Arrays.toString(searchInMatrix(arr,11)));
//        System.out.println(peakEle(arr2));
        System.out.println(peakElement(arr3));

    }
}
