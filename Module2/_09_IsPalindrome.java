public class _09_IsPalindrome {
    public static boolean isPalindrome(int n) {
        int temp=n;
        int rev=0;
        while(temp>0){
            int ld=temp%10;
            rev=rev*10+ld;
            temp/=10;
        }
        if(n==rev){
            return true;
        }else{
            return false;
        }
    }
   public static void main(String[] args) {
    System.out.println(isPalindrome(121));
    System.out.println(isPalindrome(120));
   } 
}
