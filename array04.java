//Maximum Element In Array

public class array04 {
    public static int maxi(int arr[] , int n){
        if(n==0) return 0;
        int temp = Integer.MIN_VALUE;
        for(int i = 1; i<n ; i++){
            if(temp < arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[] = {10,34,234,4253,644,536};
        int n = arr.length;
        System.out.println("Maximum Element in array: "+ maxi(arr, n));
    }
}
