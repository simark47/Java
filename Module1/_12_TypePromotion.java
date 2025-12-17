import java.util.*;

public class _12_TypePromotion {
        public static void main(String args[]) {
                // byte short char are promoted to int while evaluating an expression
                // long float double to highest available
                Scanner sc = new Scanner(System.in);
                char a = 'a';
                char b = 'b';
                System.out.println(b - a); // 1

                // char c=b-a; gives error
                char c = (char) (b - a);
                System.out.println(c); // " "
                int d = 10;
                float e = 2.542f;
                long l = 20L;
                double f = d + c + e + l;
                System.out.println(f);

                byte bi = 5;
                // byte bj=bi*2; error
                byte bj = (byte) (bi * 2);
                System.out.println(bj);

        }
}
