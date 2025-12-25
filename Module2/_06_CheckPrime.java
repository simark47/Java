public class _06_CheckPrime {
    public static boolean isPrime(int x) {

        if (x < 2) {
            return false;
        } else if (x == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;

                }
            }
            return true;
        }

    }

    public static void PrimesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        PrimesInRange(20);
    }
}
