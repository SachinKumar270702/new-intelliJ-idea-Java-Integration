package prev.src.arrays.arraysQuespw;

import java.util.Arrays;
import java.util.Scanner;

public class frequencyArray {
    static void reverseArray(int[] arr){
        int i=0,j=arr.length-1;
        while (i<j){
            SwapArrayelement(arr,i,j);
            i++;
            j--;
        }
    }

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void SwapArrayelement(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int[] makeFreqArray(int[] arr){
        int[] freq=new int[100005];
        for(int i=0;i< arr.length;i++){
            freq[arr[i]]++;
        }return freq;
    }

    static int[] squaringArray(int[] arr){
        int n=arr.length;
        int left=0,right=n-1;
        int[] ans=new int[n];
        int k=0;

       while(left<=right){
           if(Math.abs(arr[left])>Math.abs(arr[right])) {
               ans[k++] = arr[left] * arr[left];
               left++;
           }else{
               ans[k++]=arr[right]*arr[right];
               right--;
           }
           }
        reverseArray(ans);
       return ans;
       }



    static int[] optimisedSort0n1(int[] arr){
        int left=0,right= arr.length-1;
        while (left<right){
            if(arr[left]==1&&arr[right]==0){
                SwapArrayelement(arr,left,right);
            }
            if(arr[left]==0){
                left++;
            }if(arr[right]==1){
                right--;
            }

        }return arr;
    }

    static int[] sort0n1(int[] arr){
        int n=arr.length;
        int zeroes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;
            }else {
                arr[i]=1;
            }
        }
        return arr;
    }

    static int[] sortEvenAndOdd(int[] arr){
        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                SwapArrayelement(arr,left,right);
            }
            if(arr[left]%2==0){
                left++;
            }if(arr[right]%2!=0){
                right--;
            }
        }return arr;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array"+Arrays.toString(arr));
        /*1 ...frequency array
        int[] freq=makeFreqArray(arr);

        System.out.print("Enter no of queries:");
        int q=sc.nextInt();
        while (q>0){
            System.out.println("Enter number to be searched: ");
            int x=sc.nextInt();
            if(freq[x]>0)
            {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            q--;
        }*/
//        int[] ans=sort1and0(arr);
//        int[] ans=optimisedSort0n1(arr);
        int[] ans=squaringArray(arr);

        System.out.println("Sorted array: "+Arrays.toString(ans));


    }
}
