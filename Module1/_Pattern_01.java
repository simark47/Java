import java.util.Scanner;
// square pattern
// * * *  
// * * * 
// * * * 
public class _Pattern_01 {
    public static void main(String args[]) {

  Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
