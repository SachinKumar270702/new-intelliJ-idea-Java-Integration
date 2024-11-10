package basicsortingAlgo;


public class countSort {
    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static void basicCountSort(int[] arr){
        //find the largest element of the array
        int max=findMax(arr);
        int[] count=new int[max+1];
        for(int i=0;i< arr.length;i++){
            count[arr[i]]++;
        }
        //inserting elements in frequency arr.
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }
    static void display(int[] a){
        for(int val:a){
            System.out.print(val+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,4,5,2,2,5};
        basicCountSort(arr);
        display(arr);
    }
}
