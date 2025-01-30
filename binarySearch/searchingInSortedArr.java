package binarySearch;

public class searchingInSortedArr {
    static int search(int[] arr,int k){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==k) return mid;

            if(arr[st]<=arr[mid]){
                if(arr[st]<=k && k<=arr[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }else{
                if(arr[mid]<=k && k<=arr[end]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    static boolean search2(int[] arr,int k){
        int st=0,end=arr.length-1;
        while (st<end){
            int mid=st+(end-st)/2;
            if(arr[mid]==k){
                return true;
            }
            if(arr[st]==arr[mid] && arr[mid]==arr[end]){
                st++;
                end--;
                continue;
            }   if(arr[st]<=arr[mid]){
                if(arr[st]<=k && k<=arr[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }else{
                if(arr[mid]<=k && k<=arr[end]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return false;
    }

    static int search3(int[] arr){
        int st=0,end=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while (st<=end){
            int mid=st+(end-st)/2;
            if(arr[st]<=arr[end]){
                ans=Math.min(ans,arr[st]);
                break;
            }
            if(arr[st]<=arr[mid]){
                ans=Math.min(ans,arr[st]);
                st=mid+1;
            }else{
                ans=Math.min(ans,arr[mid]);
                end=mid-1;
            }
        }
        return ans;
    }
    static int numOfRotation(int[] arr){
        int st=0,end=arr.length-1;
        int ans=Integer.MAX_VALUE;
        int idx=-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if(arr[st]<=arr[end]){
                if(arr[st]<ans){
                    idx=st;
                    ans=arr[st];
                }
                break;
            }
            if(arr[st]<=arr[mid]){
                if(arr[st]<ans){
                    idx=st;
                    ans=arr[st];
                }
                st=mid+1;
            }else{
                end=mid-1;
                if(arr[mid]<ans){
                    idx=mid;
                    ans=arr[mid];
                }
            }
        }
        return idx;
    }
    static int uniqueEle(int[] arr){
        int n=arr.length;
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        int st=0,end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                return arr[mid];
            }
            //for left half
            if((mid%2==1 && arr[mid]==arr[mid-1])||(mid%2==0 && arr[mid]==arr[mid+1])){
                st=mid+1;
            }else{
                end=mid-1;
            }
        }return -1;
    }

    public static void main(String[] args) {
//        int[] arr ={7,8,1,2,4};
//        int[] arr={3,1,2,3,3,3,3};
//        System.out.println(search(arr,8));
//        System.out.println(search2(arr,1));
//        int[] arr={7,8,9,1,2,3,4,5,6};
//        int[] arr={3,4,5,1,2};
////        System.out.println(search3(arr));
////        System.out.println(numOfRotation(arr));

        int[] arr={1,1,2,3,3,4,4,5,5,6,6,7,7};
        System.out.println(uniqueEle(arr));


    }
}
