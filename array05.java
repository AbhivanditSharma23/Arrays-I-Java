//Reversed The array

public class array05 {

    public static void rev(int arr[] , int n){
        int s = 0; 
        int e = n-1;
        while(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void print(int arr[] , int n){
        for(int i = 0 ; i< n ;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int n = arr.length;
        System.out.println("Original Array");
        print(arr, n);
        System.out.println();
        System.out.println("Reversed Array");
        rev(arr, n);
        print(arr, n);

    }
}
