package strings;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String str="Sachin";
//        System.out.println(str);
//        String str=sc.next();
//        String str2=sc.nextLine();
//        System.out.println(str2);

//        String s="Sachin";
//        System.out.println(s.length());
//        System.out.println(s.charAt(4));

        String str="physics";
//        System.out.println(str.contains("jd"));
//        System.out.println(str.startsWith("Sac"));

//        for(int j=2;j<4;j++){
//            System.out.println(str.substring(j));
//        }


        String s="abcd";
        for(int i=0;i<=s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }
        }








    }
}
