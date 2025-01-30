package binarySearch;

public class squareRt {
    static int nThRoot(int n,int r){
        int st=0,end=n;
        while(st<=end){
            int mid=st+(end-st)/2;
            int midN=func(mid,n,r);
            if(midN==1){
                return mid;
            } else if (midN==0) {
                st=mid+1;
            }else{
                end=mid-1;
            }
        }return -1;
    }

    private static int func(int mid, int n, int r) {
        long ans=1;
        for(int i=1;i<=r;i++){
            ans*=mid;
            if(ans>n) return 2;
        }
        if(ans==n) return 1;
        return 0;
    }

    static int sqrt(int x){
        int st=0,ans=-1,end=x;
        while(st<=end){
            int mid=st+(end-st)/2;
            int val=mid*mid;
            if(val==x){
                return mid;
            } else if (val<x) {
                ans=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(nThRoot(125,3));

    }
}
