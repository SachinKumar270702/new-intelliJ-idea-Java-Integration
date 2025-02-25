package strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
//        StringBuilder gtr=new StringBuilder(str);
//        gtr.reverse();
//        String s=gtr+"";
//        if(str.equals(s)){
//            System.out.println("palindrome");
//        }else{
//            System.out.println("not palindrome");
//        }
        int i=0;
        int j=str.length()-1;
        boolean flag=true;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if(flag==true) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
}
