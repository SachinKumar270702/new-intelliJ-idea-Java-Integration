package prev.src.basicsortingAlgo;

import java.util.Arrays;

public class zerosSorting {

    static void sortingZeros(int[] arr){
        //Given an integer array arr,move all 0's to the end of it while maintaining the relative order of the non-zero element.
        //note that you must do this in- place without making a copy of array.
        //eg. input-->[0,5,0,3,4,2]   output-->[5,3,4,2,0,0]
        //approach-through bubble sort.
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    //swap arr[j],arr[j+1]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,1,10,5,0,4};
        System.out.println("Original Array: " + Arrays.toString(arr));
        sortingZeros(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));

    }
}
