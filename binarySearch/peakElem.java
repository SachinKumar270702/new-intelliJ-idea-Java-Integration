package binarySearch;

import java.util.Arrays;

import static revision.dsaSheet.printArr;

public class peakElem {
//    static int peakEle(int[] arr){
//        int n=arr.length;
//        if(n==1) return arr[0];
//        if(arr[0]>arr[1]) return arr[0];
//        if(arr[n-1]>arr[n-2]) return arr[n-1];
//
//        int st=1,end=n-2;
//        while(st<=end){
//            int mid=st+(end-st)/2;
//            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
//                return arr[mid];
//            }else if(arr[mid]>arr[mid-1]){
//                st=mid+1;
//            }
//            else{
//                end=mid-1;
//            }
//        }return -1;
//    }
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
    static int maxProduct(int []arr, int n)
    {
        // if size is less than 3, no triplet exists
        if (n < 3)
            return -1;

        // Construct four auxiliary vectors
        // of size n and initialize them by -1
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        Arrays.fill(leftMin, -1);
        Arrays.fill(leftMax, -1);
        Arrays.fill(rightMax, -1);
        Arrays.fill(rightMin, -1);

        // will contain max product
        int max_product = Integer.MIN_VALUE;

        // to store maximum element on left of array
        int max_sum = arr[0];

        // to store minimum element on left of array
        int min_sum = arr[0];

        // leftMax[i] will contain max element
        // on left of arr[i] excluding arr[i].
        // leftMin[i] will contain min element
        // on left of arr[i] excluding arr[i].
        for (int i = 1; i < n; i++)
        {
            leftMax[i] = max_sum;
            if (arr[i] > max_sum)
                max_sum = arr[i];

            leftMin[i] = min_sum;
            if (arr[i] < min_sum)
                min_sum = arr[i];
        }

        // reset max_sum to store maximum element on
        // right of array
        max_sum = arr[n - 1];

        // reset min_sum to store minimum element on
        // right of array
        min_sum = arr[n - 1];

        // rightMax[i] will contain max element
        // on right of arr[i] excluding arr[i].
        // rightMin[i] will contain min element
        // on right of arr[i] excluding arr[i].
        for (int j = n - 2; j >= 0; j--)
        {
            rightMax[j] = max_sum;
            if (arr[j] > max_sum)
                max_sum = arr[j];

            rightMin[j] = min_sum;
            if (arr[j] < min_sum)
                min_sum = arr[j];
        }

        // For all array indexes i except first and
        // last, compute maximum of arr[i]*x*y where
        // x can be leftMax[i] or leftMin[i] and
        // y can be rightMax[i] or rightMin[i].
        for (int i = 1; i < n - 1; i++)
        {
            int max1 = Math.max(arr[i] * leftMax[i] * rightMax[i],
                    arr[i] * leftMin[i] * rightMin[i]);

            int max2 = Math.max(arr[i] * leftMax[i] * rightMin[i],
                    arr[i] * leftMin[i] * rightMax[i]);

            max_product = Math.max(max_product, Math.max(max1, max2));
        }

        return max_product;
    }
    static void swap(int[] arr,int x,int y){
       int temp=arr[x];
       arr[x]=arr[y];
       arr[y]=temp;
    }
    static void sortZeros(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]!=0){
                i++;
            }
            if(arr[i]==0 && arr[j]!=0){
                swap(arr,arr[i],arr[j]);
                i++;
                j--;
            }
        }
    }
    static void printArr(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int[] peakArr={110,2,3,4,5,9,3,2,1000,700};
//        System.out.println(peakElement(peakArr));
//        printArr(peakArr);

        int[] arr2={1,2,0,4,3,0,5,0};
        sortZeros(arr2);
        printArr(arr2);

    }
}
