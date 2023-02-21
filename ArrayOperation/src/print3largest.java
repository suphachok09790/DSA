public class print3largest {
    public static void print3largest(int arr[], int arr_size) {
        int first, second, third, i;

        third = second = first = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }

        }
        System.out.print("Three largest elements are " + first + " " + second + " " + third);
    }

    public static void main(String[] args) {
        int arr[] = {12, 13, 14, 1, 4, 2};
        int n = arr.length;

        print3largest(arr, n);
    }
}
