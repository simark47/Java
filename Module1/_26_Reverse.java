
import java.util.Scanner;

public class _26_Reverse {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0;
        while(num>0){
            int temp=num%10;
            rev=rev*10+temp;
            num/=10;
        }
        System.out.println(rev);

    }

}
