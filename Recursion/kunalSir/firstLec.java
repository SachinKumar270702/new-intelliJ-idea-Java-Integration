package Recursion.kunalSir;

public class firstLec {
    static void print(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }

    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    static int factorial(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    static int binarySearch(int[] arr, int k, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == k) {
            return mid;
        }
        if (k < arr[mid]) {
            return binarySearch(arr, k, start, mid - 1);
        }
        return binarySearch(arr, k, mid + 1, end);
    }
    static int sumOfDigit(int num){
        if(num==0){
            return 0;
        }
        return (num%10)+sumOfDigit(num/10);
    }
    public static void main(String[] args) {
        int[] arr={1,2,6,8,10,14,17};
//        System.out.println(binarySearch(arr,8,0,arr.length-1));
//        System.out.println(fibonacci(7));
//        System.out.println(factorial(4));
        System.out.println(sumOfDigit(123456));
    }
}
