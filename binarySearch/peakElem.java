package binarySearch;

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

    public static void main(String[] args) {
        int[] peakArr={110,2,3,4,5,9,3,2,1000,700};
        System.out.println(peakElement(peakArr));
    }
}
