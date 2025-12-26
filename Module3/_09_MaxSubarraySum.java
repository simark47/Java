public class _09_MaxSubarraySum {
    public static void maxSubarraySum(int arr[]) {
        int prefixArray[] = new int[arr.length];
        prefixArray[0] = arr[0];
        for (int k = 1; k < arr.length; k++) {
            prefixArray[k] = prefixArray[k - 1] + arr[k];
        }
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        for (int k = 0; k < arr.length; k++) {

            for (int i = k; i < arr.length; i++) {
                int sum = 0;
                if (k == 0)
                    sum = prefixArray[i];
                else
                    sum = prefixArray[i] - prefixArray[k - 1];

                if (sum > max_sum) {
                    max_sum = sum;
                }
                if (sum < min_sum) {
                    min_sum = sum;
                }
            }
            

        }
        System.out.println("max sum= " + max_sum);
        System.out.println("min sum= " + min_sum);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 6, 2, 3 };
        maxSubarraySum(arr);

    }
}
// tc =n**2