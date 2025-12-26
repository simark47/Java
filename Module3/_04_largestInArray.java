
public class _04_largestInArray {
    public static int largestInArray(int arr[]) {
        int lar = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }
        }
        return lar;
    }

    public static int smallestInArray(int arr[]) {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 8, 4, 5, 68, 2, 20, 50, 15 };
        System.out.println(largestInArray(arr));

        System.out.println(smallestInArray(arr));
    }
}

// time complexity =n
