package basicsortingAlgo;

import static basicsortingAlgo.ques2.display;


public class question3 {
    static void Sort012(int[] arr){
        int count_0=0,count_1=0,count_2=0;
        for(int j:arr){
            if(j==0){
                count_0++;
            }else if(j==1){
                count_1++;
            }else{
                count_2++;
            }
        }
        int k=0;
        while(count_0>0){
            arr[k++]=0;
            count_0--;
        }
        while (count_1>0){
            arr[k++]=1;
            count_1--;
        }
        while(count_2>0){
            arr[k++]=2;
            count_2--;
        }
    }

    static void sort012(int[] arr){
        int lo=0,mid=0,hi=arr.length-1;
        while(mid<=hi){
            if(arr[mid]==0){
                swap(arr,mid,lo);
                mid++;
                lo++;
            } else if (arr[mid]==1) {
                mid++;
            }else{
                swap(arr,mid,hi);
                hi--;
            }
        }
    }
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static void main(String[] args) {
        int[] arr={0,1,1,0,0,2,2,0,1,2};
        sort012(arr);
        display(arr);

    }
}
