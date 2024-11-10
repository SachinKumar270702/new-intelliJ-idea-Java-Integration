package basicsortingAlgo;


import java.util.Arrays;

public class bubbleSort {
    static void bubbleSortAlgo2(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean flag=false;
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   flag=true;
                }
            }
            if(!flag){
                return;
            }
        }
    }

    static void bubbleSortAlgo(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
//        int[] arr={5,4,1,3,2};
        int[] arr={1,2,3,4,5};
        System.out.println("Original Array: "+Arrays.toString(arr));
        bubbleSortAlgo2(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));

    }
}
