public class _03_LinearSearch {
    public static void linearSearch(int arr[], int key) {
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                idx = i;
            }

        }

        if (idx == -1) {
            System.out.println("key not found");
        } else {
            System.out.println("key found at " + idx);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 15, 4, 8, 5, 6, 8, 9, 2, 7 };
        int key = 5;
        linearSearch(arr, key);
        linearSearch(arr, 50);
    }
}
// Time complexity =n 