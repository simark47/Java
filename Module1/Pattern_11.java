import java.util.Scanner;

public class Pattern_11 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
        System.out.println("---way 2");
        for (int i = 1; i <= n; i++) {
            int start;
            if (i % 2 == 0) {
                start = 0;
            } else {
                start = 1;
            }

            for (int j = 1; j <= i; j++) {
              
                System.out.print(start);
                start = 1 - start;   // switch between 0 and 1
            

            }
            System.out.println();
        }

    }
}
