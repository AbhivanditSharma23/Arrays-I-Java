//Maximum Subarray Sum: Kandane Algo - Positive/negative cases taken

public class Max_Sub_Sum {

    public static int MaxSubArr(int arr[] , int n){
        int curr_sum = arr[0];
        int max_sum = arr[0];
        for(int i = 1; i < n; i++){
            curr_sum = Math.max(arr[i], curr_sum + arr[i]);
            max_sum  = Math.max(max_sum, curr_sum);
        }
        return max_sum; 
    }

    public static void main(String[] args) {
        int arr[] = {-1, -4, -3, -5, -2};
        int n = arr.length;
        System.out.println("Maximum SubArray Sum: " + MaxSubArr(arr, n));
    }
}
