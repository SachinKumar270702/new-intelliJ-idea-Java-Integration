package basicsortingAlgo;

import java.util.Arrays;

public class insertionsort {
    static void Insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={5 ,4 ,1 ,3 ,2};
        System.out.println("Original Array"+ Arrays.toString(arr));
        Insertionsort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}
