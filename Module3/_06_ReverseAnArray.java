class _06_ReverseAnArray {
    public static void reverseAnArray(int a[]) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 6, 2, 3 };
        reverseAnArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.err.println(arr[i]);
        }
    }
}
