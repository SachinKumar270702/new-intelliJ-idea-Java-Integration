package binarySearch;

public class chocolateProblem {
    static boolean isDivisionPossible(int[] arr,int n,int max){
        int numOfStudent=1,choc=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                return false;
            }
            if (choc + arr[i] <= max) {
                choc += arr[i];
            } else {
                numOfStudent++;
                choc = arr[i];
            }
        }return numOfStudent<=n;
    }
    static int distributeChocolate(int[] arr,int n){
        if(arr.length<n) return -1;
        int ans=0,st=1,end=(int)1e9;

        while(st<=end){
            int mid=st+(end-st)/2;
            if(isDivisionPossible(arr,n,mid)){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }return ans;
    }
    public static void main(String[] args) {
        int[] arr={5,3,1,4,2};
        int n=3;
        System.out.println(distributeChocolate(arr,n));
    }
}
