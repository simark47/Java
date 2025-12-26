class _07_PairsInAray {
    public static void pairsInAray(int a[]) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                System.out.print("(" + a[i] + " , " + a[j] + ")");
                count++;
            }
            System.out.println();
        }
        System.out.println(count);//(n*(n-1))/2
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 6, 2, 3 };
        pairsInAray(arr);

    }
}
// tc= n**2