public class array06 {

    public static void Sol(int arr[] , int n, int target){
        int i , j;
        boolean isfound = false;
        for(i = 0 ; i< n ;i++){
            for(j=i+1; j<n ; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("{ " + arr[i] + "," + arr[j] +" }");
                    isfound = true;    
                }
            }
        }
        if(!isfound){
            System.out.println("No Such Element Exisis");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 5};
        int n = arr.length;
        int target = 6;
        Sol(arr, n, target);

    }
}
