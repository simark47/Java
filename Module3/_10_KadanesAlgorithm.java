public class _10_KadanesAlgorithm {

    public static int maxSubarraySum(int[] arr) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
         for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { -1, -2, -6, 1, 3 };
        System.out.println("Max Subarray Sum = " + maxSubarraySum(arr));
    }
}
