import java.util.*;

public class _09_Input {
        public static void main(String args[]) {
                // for input we need object of scanner class
                Scanner sc = new Scanner(System.in);
                String s = sc.next(); // one word
                sc.nextLine();        // consume leftover newline buffer

                String t = sc.nextLine();
                int z = sc.nextInt();
                float f = sc.nextFloat();
                double d = sc.nextDouble();
                boolean b = sc.nextBoolean();
                short sh = sc.nextShort();
                byte by = sc.nextByte();
                long l = sc.nextLong();

                System.out.println(s);
                System.out.println(t);
                System.out.println(z);
                System.out.println(f);
                System.out.println(d);
                System.out.println(b);
                System.out.println(sh);
                System.out.println(by);
                System.out.println(l);

        }
}
