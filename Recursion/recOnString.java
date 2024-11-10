package Recursion;

import java.util.Scanner;

public class recOnString {
    static boolean isPalindrome(String s,int l,int r){
        if(l>=r) return true;
        return (s.charAt(l)==s.charAt(r) && isPalindrome(s,l+1,r-1));

    }
    static String reverseStr(String s,int i){
        String ans=new String();
        if(i==s.length()){
            return ans;
        }
        String smallAns=reverseStr(s,i+1);
        return smallAns+s.charAt(i);
    }
    static String removeOcc2(String s,char x){
        String ans=new String();
        if(s.length()==0){
            return ans;
        }
        String smallAns=removeOcc2(s.substring(1),x);
        char currChar=s.charAt(0);
        if(currChar!=x){
            return currChar+smallAns;
        }else {
            return smallAns;
        }

    }
    static String removeOcc(String s,char x,int idx){
        String ans=new String();
        //self work
        if(idx==s.length()){
            return ans;
        }
        //recursive work
        String smallAns=removeOcc(s,x,idx+1);

        char currChar=s.charAt(idx);
        //self work
        if(currChar!=x){
            return currChar+smallAns;
        }
        else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        //Defining String
//        String s="Sachin";
        //Taking string as input
        Scanner sc= new Scanner(System.in);
//        String s1=sc.next();
//        System.out.println(s1);
        //Taking String as output the whole line
//        String s2=sc.nextLine();
//        System.out.println(s2);
        //finding char at some specific position
//        char ch=s2.charAt(5);
//        System.out.println(ch);
//        for(int i=0;i<s.length();i++){
//            System.out.println(s2.charAt(i));
//        }
        //SubString method
//        System.out.println(s2.substring(2,8));
        String s=sc.nextLine();
//        String rev=reverseStr(s,0);
//        if(rev.equals(s)){
//            System.out.printf("%s is Palindrome",s);
//        }else{
//            System.out.printf("%s not a palindrome",s);
//        }
//        char x='a';
//        System.out.println(reverseStr(s,0));
//        System.out.println(removeOcc2(s,x));
//        System.out.println(removeOcc(s,x,0));
        System.out.println(isPalindrome(s,0,s.length()-1));

    }
}
