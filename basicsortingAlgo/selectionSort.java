package basicsortingAlgo;

import java.util.Arrays;

public class selectionSort {
    static void selectionSorting(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={5 ,4 ,1 ,3 ,2};
        System.out.println("Original Array"+Arrays.toString(arr));
        selectionSorting(arr);
        System.out.println("Sorted Array"+ Arrays.toString(arr));
    }
}
