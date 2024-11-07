package prev.src.Recursion;

public class frogJump {

    static void combination(String dig,String[] kp,String res){
        if(dig.length()==0){
            System.out.println(res+" ");
            return;
        }
        int currNum=dig.charAt(0)-'0';
        String currChoices=kp[currNum];

        for(int i=0;i<currChoices.length();i++){
            combination(dig.substring(1),kp,res+currChoices.charAt(i));
        }
    }
    static int best(int[] h,int n,int idx){
        if(idx==n-1) return 0;

        int op1=Math.abs(h[idx]-h[idx+1])+best(h,n,idx+1);
        if(idx==n-2) return op1;
        int op2=Math.abs(h[idx]-h[idx+2])+best(h,n,idx+2);

        return Math.min(op1,op2);
    }
    public static void main(String[] args) {
//        int[] height={10,30,40,20};
//        System.out.println(best(height, height.length, 0));

        String dig="7658";

        String[] kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(dig,kp,"");
    }
}
