import java.util.*;

public class _01_IntroToFunctions {
    public static void printHelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }
    public static int calculateSum(int a, int b) {//parameters
        return a+b;
        
    }
    public static void main(String[] args) {
        printHelloWorld(); //function call
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculateSum(a, b);//arguments
        System.out.println("sum : "+sum);    
        sc.close();   
    }
}
// FUNCTIONS are reusable part of code
// returnType name(type param1, type param2){
// body
// return statement
// }

// in cpp , we could write the functions outside classes as well but those which are written inside class are called methods.
// these will be user defined 
// there are also inbuilt methods like sc.nextInt() or math library =sqrt()or max() etc
