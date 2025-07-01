//Linear Search

public class array02 {

public static int LSearch(int arr[] , int n , int key){
    int i ;
    for(i = 0 ; i< n ;i++){
        if(arr[i] == key){
            // System.out.println("element found at idx: "+ i);
            return i;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int ans = LSearch(arr, 6 ,50);
        if(ans != -1){
            System.out.println("Element found at: "+ ans);
        }
        else{
            System.out.println("Element Not Found");
        }
    }
}
