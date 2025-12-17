import java.util.*;

public class _11_TypeCasting {
        public static void main(String args[]) {
                // for input we need object of scanner class
                Scanner sc = new Scanner(System.in);
               
              
                int m= (int)sc.nextFloat(); //foribily converting the data type from uppper to lower
                // results in loss of data (Narrowing or explicit conversion)
                System.out.println(m);
                char s='a';
                int d=s;
                System.out.println(d); //unicode
                

        }
}