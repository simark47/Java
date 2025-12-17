public class _15_GreatestOfTwo {
        public static void main(String args[]) {

                double income = 500000;
                double tax;

                if (income <= 250000) {
                        tax = 0;
                } else if (income <= 500000) {
                        tax = income * 0.05;
                } else if (income <= 1000000) {
                        tax = income * 0.20;
                } else {
                        tax = income * 0.30;
                }

                System.out.println("Tax = " + tax);
                // Greatest of Two Numbers
                int a = 15;
                int b = 25;

                if (a > b) {
                        System.out.println("Greatest = " + a);
                } else {
                        System.out.println("Greatest = " + b);
                }
        }
}
