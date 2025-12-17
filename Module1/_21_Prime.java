
import java.util.Scanner;

public class _21_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("way-1");
        boolean flag = true;
        for (int i = 2; i < num; i++) {  // can also use i <=sqrt(num) for better optimisation
            if (num % i == 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }

        System.out.println("way-2");
        int factors = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors++;
            }
        }
        if (factors<=2) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }

    }
}
