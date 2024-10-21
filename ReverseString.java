// program to reverse a string
import java.util.Scanner;


public class ReverseString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        String string = sc.nextLine();

        reverseString(string);
    }
    
    public static void reverseString(String string) {
        StringBuilder res = new StringBuilder();

        for (int i = string.length() - 1; i > -1; i--) {
            res.append(string.charAt(i));
        }

        System.out.println("'"+ string + "' given string and its reverse string is '"+ res.toString() + "'");
    }

}
