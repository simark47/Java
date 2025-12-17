
public class _24_WhileAndDoWhile {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        int count = 0;
        while (count <= 10) {
            System.out.println(count);
            count++;

        }

        int count2 = 11;
        do {
            System.out.println("Hi " + count);
            count++;

        } while (count < 10);

        // do while executes atleast once

    }

}