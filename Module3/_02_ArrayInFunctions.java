public class _02_ArrayInFunctions {
    public static void updateMarks(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };

        updateMarks(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // arrays are passed as a reference
        }
    }
}
