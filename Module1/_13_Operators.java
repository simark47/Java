public class _13_Operators {

    public static void main(String[] args) {

        int a = 10, b = 3;

        // Arithmetic Operators
        System.out.println(a + b);   // addition
        System.out.println(a - b);   // subtraction
        System.out.println(a * b);   // multiplication
        System.out.println(a / b);   // integer division
        System.out.println(a % b);   // modulus

        // Relational Operators
        System.out.println(a > b);   // greater than
        System.out.println(a < b);   // less than
        System.out.println(a >= b);  // greater than or equal to
        System.out.println(a <= b);  // less than or equal to
        System.out.println(a == b);  // equal to
        System.out.println(a != b);  // not equal to

        // Logical Operators
        boolean x = true, y = false;
        System.out.println(x && y);  // logical AND
        System.out.println(x || y);  // logical OR
        System.out.println(!x);      // logical NOT

        // Assignment Operators
        int c = 5;
        c += 2;
        System.out.println(c);
        c -= 1;
        System.out.println(c);
        c *= 2;
        System.out.println(c);
        c /= 2;
        System.out.println(c);

        // Unary Operators
        int d = 5;
        System.out.println(++d);     // pre-increment
        System.out.println(d++);     // post-increment
        System.out.println(--d);     // pre-decrement
        System.out.println(d--);     // post-decrement

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println(max);
        System.out.println();
        // Bitwise Operators
        int p = 5, q = 3; //0101 0011
        System.out.println(p & q);   // AND
        System.out.println(p | q);   // OR
        System.out.println(p ^ q);   // XOR same bit =0 opposite 1
        System.out.println(~p);      // NOT -(x+1)
        System.out.println(p << 1);  // left shift *2
        System.out.println(p >> 1);  // right shift /2
    }
}
