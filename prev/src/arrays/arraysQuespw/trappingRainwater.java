package prev.src.arrays.arraysQuespw;

import java.util.Arrays;
import java.util.Scanner;

public class trappingRainwater {
    static int trappingWater(int[] height){
        int n=height.length;
        //calculate left max boundary-array
        int[] leftMax=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //calculate right max boundary-array
        int[] rightMax=new int[height.length];
        rightMax[n-1]=height[height.length-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trappedWater=0;
        //loop
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
        //waterLevel=min(leftMax bound,rightMax bound)
        //trapped water=waterLevel-height[i]
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
        System.out.println("Original array"+ Arrays.toString(arr));
        int waterTrapped=trappingWater(arr);
        System.out.println("Amount of Trapped Water is: "+waterTrapped);
    }
}
