package revision;

public class dsaSheet {
    static public void rightRotateByOne(int[] arr){
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        printArr(arr);
    }
    static public void leftRotateByk(int[] arr,int k ){
        int n= arr.length;
        if(k>n+1){
            k%=n;
        }
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for (int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        for (int i=n-k;i<n;i++){
            arr[i]=temp[i-(n-k)];
        }
        printArr(arr);
    }
    static public void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static public void rightrotatebyK(int[] arr,int k){
        int n= arr.length;
        reverse(arr,0,(n-k)-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        printArr(arr);
    }
    static public void leftrotatebyK(int[] arr,int k){
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
        printArr(arr);
    }
    static public void leftRotateByOne(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        printArr(arr);
    }
    static public boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    static public int secondMinEle(int[] arr){
        int smallest=arr[0];
        int sSmallest=Integer.MAX_VALUE;
        for(int i=1;i< arr.length;i++){
            if(arr[i]<smallest){
                sSmallest=smallest;
                smallest=arr[i];
            } else if (arr[i]!=smallest && arr[i]<sSmallest) {
                sSmallest=arr[i];
            }
        }
        return sSmallest;
    }
    static public int secondMaxEle(int[] arr){
       int largest=arr[0];
       int sLargest=Integer.MIN_VALUE;
       for(int i=1;i<arr.length;i++){
           if(arr[i]>largest){
               sLargest=largest;
               largest=arr[i];
           } else if (arr[i] < largest && arr[i] > sLargest) {
               sLargest=arr[i];
           }
       }
       return sLargest;
    }
    static public int[] getSecondOrderEle(int[] arr){
        int[] Num={secondMaxEle(arr),secondMinEle(arr)};
        return Num;
    }
    static public void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static public int removeDuplicateEle(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static int linearSearch(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }

    public static int[] moveZerosToEnd(int[] nums) {
            if (nums == null || nums.length <= 1) {
                return nums; // Nothing to do for null or single-element arrays
            }
            int n = nums.length;
            int nonZeroIndex = 0; // Tracks the position to insert the next non-zero element

            // Iterate through the array
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    // If the current element is non-zero, move it to the front
                    // and update the nonZeroIndex
                    nums[nonZeroIndex] = nums[i];
                    nonZeroIndex++;
                }
            }
            // Fill the remaining positions with zeros
            for (int i = nonZeroIndex; i < n; i++) {
                nums[i] = 0;
            }
            return nums;
        }









    public static void main(String[] args) {

        int[] arr={1,0,2,3,2,0,0,4,5,1};
//        System.out.println(Arrays.toString(getSecondOrderEle(arr)));
//        System.out.println(isSorted(arr));
//        System.out.println(removeDuplicateEle(arr));
//        leftRotateByOne(arr);
//        leftRotateByk(arr,3);
//        leftrotatebyK(arr,3);
//        rightRotateByOne(arr);
//        rightrotatebyK(arr,3);
//        System.out.println(Arrays.toString(moveZerosToEnd(arr)));
        System.out.println(linearSearch(arr,5));

    }
}
