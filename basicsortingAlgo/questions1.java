package basicsortingAlgo;



public class questions1 {
    static void sortArr(int[] nums){

        int n=nums.length;
        int x=-1,y=-1;
        if(n<=1){
            return;
        }
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                if(x==-1){
                    x=i-1;
                    y=1;
                }else{
                    y=i;
                }
            }
        }
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }

    public static void main(String[] args) {
        int[] arr={10,5,6,7,8,9,1};
        sortArr(arr);
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for(int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
