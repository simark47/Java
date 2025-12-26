public class _08_PrintSubarrays {
    public static void printSubarrays(int arr[]) {
        int count = 0;
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        for (int k = 0; k < arr.length; k++) {

            for (int i = k; i < arr.length; i++) {
                int sum = 0;
                for (int j = k; j <= i; j++) {

                    System.out.print(arr[j]);
                    sum += arr[j];

                }
                System.out.println();

                count++;
                if (sum > max_sum) {
                    max_sum = sum;
                }
                if (sum < min_sum) {
                    min_sum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("count= " + count);// n*(n+1)/2
        System.out.println("max sum= " + max_sum);
        System.out.println("min sum= " + min_sum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        printSubarrays(arr);

    }
}
//tc =n**3