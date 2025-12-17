public class _5_Datatypes {
    public static void main(String args[]) {
        boolean b = true; // 1 byte
        char c = 'a'; // 1byte
        short s = 32767; // 2 bytes
        int m = 2147483647; // 4 bytes
        float price = 3.0482f; // 4 bytes half precision
        double price2 = 3.255481781;// 8 bytes double precision
        long l = 9219798798451L; // 8 bytes
        // MAXIMUM SIZE
        int maxInt = Integer.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(m);
        System.out.println(price);
        System.out.println(price2);
        System.out.println(l);
        System.out.println(maxInt);
        System.out.println(minFloat);

    }
}
