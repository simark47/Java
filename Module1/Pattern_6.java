import java.util.Scanner;

// 1234
// 123
// 12
// 1

public class Pattern_6 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+14; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
