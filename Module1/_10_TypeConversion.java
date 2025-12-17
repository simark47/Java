import java.util.*;

public class _10_TypeConversion {
        public static void main(String args[]) {
                // for input we need object of scanner class
                Scanner sc = new Scanner(System.in);
               
                float f = sc.nextInt();
                // int m= sc.nextFloat(); gives lossy conversion warning
                System.out.println(f);
                

        }
}
// type conversion happens when types are compatible 
// destination type must be greater than source
// b<s<i<l<f<d widening or implicit conversion