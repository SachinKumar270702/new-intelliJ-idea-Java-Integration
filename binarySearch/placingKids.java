package binarySearch;

public class placingKids {
    static boolean isPossible(int[] a,int k,int dist){
        int kids=1,lastkid=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]-lastkid>=dist){
                kids++;
                lastkid=a[i];
                }
            }return kids>=k;
        }

    static int raceTrack(int[] arr,int k){
        if(k>arr.length) return -1;
        int st=0,end=(int)1e9;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(isPossible(arr,k,mid)){
                ans=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,8,9};
        int k=3;
        System.out.println(raceTrack(arr,k));
    }
}