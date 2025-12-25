public class _05_FunctionOverloading {

    // number of params
    public static int sum(int a, int b) {
        return a + b;

    }

    public static int sum(int a, int b, int c) {
        return a + b + c;

    }

    // type of params
    public static float sum(float a, float b) {
        return a + b;

    }

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int c = 21;
        System.out.println(a + c);
        System.out.println(a + b + c);
        System.out.println(4.8f + 6.8f);
    }

}
// Multiple functions with same name and different parameters