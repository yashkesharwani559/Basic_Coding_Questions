// program to check that number is a palindrome number or not
import java.util.Scanner;



public class NumberPalindrome {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(isPalindromeNumber(num))
            System.out.println(num+ " is a palindrome number.");
        else
            System.out.println(num+ " is not a palindrome number.");

    }

    public static boolean isPalindromeNumber(int num) {
        int temp = num;
        int res = 0;

        while  (temp > 0 ) {
            int t = temp % 10;
            res = t + (res * 10);
            temp /= 10;
        }
        
        if(res == num)
            return true;

        return false;
    }

}
