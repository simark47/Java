
import java.util.Scanner;

public class _25_BreakAndContinue {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = 20;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                continue;

            }
            if (i == 15) {
                break;
            }
            System.out.println(i);
        }

    }

}
