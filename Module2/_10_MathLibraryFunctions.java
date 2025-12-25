public class _10_MathLibraryFunctions {
    public static void main(String[] args) {

        System.out.println(Math.abs(-10));
        System.out.println(Math.sqrt(16)); // returns double
        System.out.println(Math.pow(3, 2)); // returns double
        System.out.println(Math.max(5, 9));
        System.out.println(Math.min(5, 9));
        System.out.println(Math.random());// value between 0.0 and 1.0
        int r = (int)(Math.random() * 10) + 1; // 1 to 10
        System.out.println(r);
        System.out.println(Math.PI);
        System.out.println(Math.round(4.6));
        System.err.println(Math.floor(4.9));// return double
        System.out.println(Math.ceil(4.1));// return double

    }
}
