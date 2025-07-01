public class array07 {

    public static int sol(int arr[], int n) {
        int ctr = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) { // start from i, not i+1
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    ctr++;
                }
                System.out.println();
            }
            System.out.println();
        }
        return ctr;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int n = arr.length;
        System.out.println("Total elements printed: " + sol(arr, n));
    }
}
