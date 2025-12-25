public class _02_CallByValue {
    public static void addOne(int a) {
        a+=1;
        System.out.println(a);
    }

    public static void main(String[] args) {

        int a = 20;
        addOne(a);
        System.out.println(a);
    }
}
// java always is call by value unlike c++(call by reference)
// a copy of value will be passed