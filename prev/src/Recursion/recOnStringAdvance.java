package prev.src.Recursion;

import java.util.ArrayList;

public class recOnStringAdvance {

    static void subSetSum(int[] arr,int sum,int idx,int n){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
        //curr idx+sum
       subSetSum(arr,sum+arr[idx],idx+1,n);
       //curr ans
        subSetSum(arr,sum,idx+1,n);
    }

    static void printSSQ(String s,String currAns){
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr=s.charAt(0);
        String remStr=s.substring(1);

        //curr char --> chooses to be a part of currAns
        printSSQ(remStr,currAns+curr);

        //curr char --> not chooses to be a part of currAns
        printSSQ(remStr,currAns);
    }

    static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans=new ArrayList<>();
        //base case
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curr=s.charAt(0);
        //recursive work
        ArrayList<String> smallAns=getSSQ(s.substring(1));
        for(String ss:smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }
    public static void main(String[] args) {
//        ArrayList<String> ans=getSSQ("abc");
//        System.out.println(ans);

//        printSSQ("abc","");

        int[] arr={2,4,5};
        subSetSum(arr,0,0,arr.length);

    }
}
