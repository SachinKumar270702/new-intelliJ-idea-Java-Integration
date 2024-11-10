package Recursion;

public class recursionOnArr {
    static void printArr(int [] arr,int idx){
        if(idx==arr.length){
            return;
        }
        System.out.print(arr[idx]+" ");

        printArr(arr,idx+1);
    }

    static int maxValueOfArr(int [] arr,int idx){

        if(idx==arr.length-1){
            return arr[idx];
        }
        int smallAns=maxValueOfArr(arr,idx+1);

        return Math.max(arr[idx],smallAns);
    }
    static int sumArr(int[] arr,int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        int sum=sumArr(arr,idx+1);
        return sum+arr[idx];

    }


    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
//        printArr(arr,0);
//        System.out.println(maxValueOfArr(arr,0));
        System.out.println(sumArr(arr,0));
    }
}
