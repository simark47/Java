
import java.util.Scanner;
// Palindromic pattern

public class _Pattern_17 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");

            }

            int j = i;
            while (j >1) {
                System.out.print(j);
                j--;
            }
            while (j <= i) {
                System.out.print(j);
                j++;

            }

            // for loops will be i to 1 and 2 to i
            System.out.println();
        }

    }
}
