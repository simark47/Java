public class _07_DecimalToBinary {
    public static int BinaryToDecimal(int n) {
        int dec=0;
        int pow=1;
        while(n>0){
            int ld=n%10;
            dec+=ld*pow;
            pow*=2;
            n/=10;
        }
       return dec;
    }

    public static int DecimalToBinary(int n) {

        int bina = 0;
        int pow = 1; // 1, 10, 100, ...

        while (n > 0) {
            int rem = n % 2;
            bina = rem * pow + bina;
            pow *= 10; // ✅ multiply
            n /= 2;
        }

        return bina;
    }

    public static void main(String[] args) {
        System.out.println(BinaryToDecimal(1111));
        System.out.println(DecimalToBinary(127));
    }

}
