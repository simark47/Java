public class _04_BinomialCoeffcient {
    public static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoeffcient(int n, int r) {
        int num = factorial(n);
        int den = factorial(r) * factorial(n - r);
        return num / den;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println(binomialCoeffcient(n, r));
    }
}
// ncr= n!/(r!*(n-r)!)