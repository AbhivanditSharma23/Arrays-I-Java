public class BuyAndSell {
    public static int ans(int arr[]){
        int maxProfit = 0;
        int mini = arr[0];
        int n = arr.length;
        for(int i =0 ; i< n ; i++){
            int cost = arr[i] - mini;
            maxProfit = Math.max(maxProfit , cost);
            mini = Math.min(mini , arr[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        System.out.println(ans(arr));
    }    
}
