// program to find the reverse of a number
import java.util.Scanner;

public class ReverseNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number: ");        
        int num = sc.nextInt();

        System.out.println("Reverse of "+num + " is:  "+reverse(num));

    }

    public static int reverse(int num){
        int res = 0;
        while (num > 0) {
            int t = num % 10;
            res = t + (res*10);
            num /= 10;
        }
        
        return res;
    }
}
