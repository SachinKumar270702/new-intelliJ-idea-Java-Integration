package arrays.arraysQuespw;

public class arrays {
    static void sumOfArray(int[] arr){
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
    static void maxInArray(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    static void elementInArray(int[] arr,int n){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
               ans=i;
            }
        }
        System.out.println("found "+n+" at index: "+ans);
    }

    static int occurrenceInArray(int[] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }return count;
    }
    static void lastOccurrence(int[] arr,int x){
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        System.out.println("Last Occurrence of "+x+" is at index :"+lastIndex);
    }
    static int greaterElement(int[] arr,int x){
        int gNum=0;
        for(int i=0;i<arr.length;i++){
            if(x<arr[i]){
                gNum++;
            }
        }return gNum;
    }
    static  boolean sortedArray(int[] arr){
        boolean check=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }return check;
    }
    public static void main(String[] args) {

        //lecture 1
       /* int[] arr={1,5,7,99,0,1};
        sumOfArray(arr);
        maxInArray(arr);
        elementInArray(arr,2);*/
        //lecture 2
        int[] arr2={0,1,2,4,5,6,2,1,4,6,2,1,4,2};
//        System.out.println( occurrenceInArray(arr2,2));
//        lastOccurrence(arr2,4);
        int[] arr3={1,2,3,4,5,6,7,8};
//        System.out.println(greaterElement(arr2,2));
        System.out.println(sortedArray(arr3));
    }
}
