package arrays.arraysQuespw;

import java.util.Arrays;
import java.util.Scanner;

public class advanceQues {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static int targetSum(int[] arr,int x){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==x){
                    ans++;
                }
            }
        }return ans;
    }
    public static int tripletSumInArray(int[] arr,int target){
        int ans=0,n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }return ans;
    }
    //array manipulation-->> Only positive elements in array.
    public static void uniqueElement(int[] arr){
        int uniqueElement=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=arr[j]=-1;
                    }
                }
            }
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        System.out.println(ans);
    }
    static int findMax(int[] arr){
        int max=Integer.MIN_VALUE,n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }return max;
    }
    static void findSecondMax(int[] arr){
        int max=findMax(arr);
        for(int i=0;i<arr.length;i++){
                if(arr[i]==max){
                    arr[i]=Integer.MIN_VALUE;
            }
        }
        int max2=findMax(arr),ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max2){
                ans=arr[i];
            }
        }System.out.println(ans);
    }
    static int firstValue(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }return -1;
    }
    //higherOrderQuestions
    static void swap(int a,int b){
        System.out.println(" before swaping \na: "+a+"\nb :"+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swaping \na:"+a+"\nb: "+b);
    }
    static void swap2(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
    static int[] reverseArray(int[] arr){
        int n=arr.length,j=0;
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
        }return ans;
    }
    static void swapInArray(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] ans = new int[n];
        int j=0;
        for (int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }return ans;
    }
    static void rotateInPlace(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int[] arr={4,6,3,5,8,2};
//        System.out.println(targetSum(arr,7));
//        int[] arr={1,4,5,6,3};
//        System.out.println(tripletSumInArray(arr,12));
//        int[] arr={1,2,3,4,5,6,7,6,4,7,2,1,3};
//        uniqueElement(arr);
//        int[] arr={9,8,9,6,9,5,8};
//        int[] arr={0,-2,0,-3,0,-4};
//        findSecondMax(arr);
//        int[] arr={1,5,3,4,7,3,4};
//        System.out.println(firstValue(arr));
//        swap2(2,8);
//        int[] arr={1,2,3,4,5};
//        int[] ans=reverseArray(arr);
//        System.out.println(Arrays.toString(ans));
//        int[] arr={1,2,3,4,5};
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
        //dsa sheet-->>4,6,8,11,16

        System.out.println("Enter no of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elments");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k= sc.nextInt();
        System.out.println("original array:"+Arrays.toString(arr));
//        int[] ans=rotate(arr,k);
//        System.out.println("Array after rotating "+k+"th times: "+Arrays.toString(ans));
        rotateInPlace(arr,k);
        System.out.print("Array after rotating "+k+"th times (in Place): "+Arrays.toString(arr));



    }
}
