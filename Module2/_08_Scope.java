public class _08_Scope {

    public static void show() {
        int x = 10; // method scope
        System.out.println(x);
    }

    public static void main(String[] args) {
        show();
        // System.out.println(x); ❌ ERROR (x not visible here)
        // --------------------------
        int a = 5;

        if (a > 0) {
            int b = 20; // block scope
            System.out.println(b);
        }

        // System.out.println(b); ❌ ERROR (b not visible)

    }
}

// A block is anything inside { }
// Examples of blocks:

// if

// else

// for

// while

// { } alone

// A block-scoped variable exists only inside that block

// Once execution leaves the block → variable is destroyed