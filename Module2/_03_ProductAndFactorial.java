public class _03_ProductAndFactorial {
    public static int product(int a, int b) {
        return a*b;
    }
    public static int factorial(int x) {
        int fact=1;
        for(int i=1;i<=x;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        
        int x=20;
        int y=3;
        int prod=product(x, y);
        System.out.println("Product: "+ prod);
        System.out.println(factorial(5));
    }
}
