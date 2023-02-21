public class Right_rotated {
    //
    static void RightRotate(int a[], int n, int k) {
        // If rotation is greater
        // than size of array
        k = k % n;
        for (int i = 0; i < n; i++) {
            // Printing rightmost
            // kth elements
            if (i < k) {
                System.out.print(a[n + i - k] + " ");
            } else {
                // Prints array after
                // 'k' elements
                System.out.print(a[i - k] + " ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int Array[] = {1, 2, 3, 4, 5};
        int N = Array.length;

        int K = 2;
        RightRotate(Array, N, K);
    }
}
