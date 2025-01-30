package binarySearch;

public class boundingIdx {

    static int findHgBoundIdx(int[] arr,int x){
        int ans=0;
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>x){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }return ans;
    }

    static int findLwBoundIdx(int[] arr,int x){
        int ans=arr.length;
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>=x){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ans;
    }

    static int insertingVal(int[] arr,int x){
        int st=0,end=arr.length-1;
        int ans=-1;
        while(st<=end){
            int  mid=st+(end-st)/2;
            if(arr[mid]>=x){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }

        }return ans;
    }

    static int  floorVal(int[] arr,int x){
        int ans=-1;
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]<=x){
                ans=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }return ans;
    }
    static int  ceilVal(int[] arr,int x){
        int ans=-1;
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]>=x){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }return ans;
    }
    public static void main(String[] args) {
//        int[] arr={1,2,3,3,5,8,8,8,8,8,8,8,8,10,10,11};
//        int[] arr={1,2,4,7,10,13,15,90};
        int[] arr={10,20,30,40,50};
        int x=25;
//        System.out.println(findLwBoundIdx(arr,x));
//        System.out.println(findHgBoundIdx(arr,x));
//        System.out.println(insertingVal(arr,x));
        System.out.println(floorVal(arr,x));
        System.out.println(ceilVal(arr,x));

    }
}
