package basicsortingAlgo;

public class sortingStrings {
    static void lexicographyOrder(String[] fruits){
        //with the help of selection sort.
        int n=fruits.length;
        for(int i=0;i<n;i++){
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(fruits[j].compareTo(fruits[minPos])<0){
                    minPos=j;
                }
            }
            //swap
            String temp=fruits[i];
            fruits[i]=fruits[minPos];
            fruits[minPos]=temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits={"kiwi","apple","papaya","mango"};
        lexicographyOrder(fruits);
        for(String val:fruits){
            System.out.print(val+" ");
        }
    }
}
