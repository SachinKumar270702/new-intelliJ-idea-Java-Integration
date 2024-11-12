package basicsortingAlgo;



public class radixSort {
    static int findMax(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static void countSortAlgo(int[] arr,int place){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for(int i = 0; i < arr.length; i++){ // Make frequency array -> TC -> n
            count[(arr[i]/place)%10]++;
        }
        // Make prefix sum array of count array
        for(int i = 1; i < count.length; i++){ // TC -> max
            count[i] += count[i-1];
        }
        // Find the index of each element in the original array and put it in output  array
        for(int i = n-1; i >= 0; i--){ // TC -> n
            int idx = count[(arr[i]/place)%10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        // copy all elements of output to arr
        for(int i = 0; i < n; i++){ // TC -> n
            arr[i] = output[i];
        }
    }

    static void radixSortAlgo(int[] arr){
        int max= findMax(arr);
        for(int place=1;max/place>0;place*=10){
            countSortAlgo(arr,place);
        }
    }
    public static void main(String[] args) {
        int[] arr={43,453,626,895,0,3};
        radixSortAlgo(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
