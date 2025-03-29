import java.util.*;

public class Day3_LC9_Palindrome {
    public static boolean isPalindrome(int x) {

        if( x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while( x > 0) {
           int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10; 
        }

        return original == reverse;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(isPalindrome(x));

        sc.close();
    }
}

// rzz9zix6fu9mrbv
