// write a program to find the number of alphabets, digits and spaces
import java.util.Scanner;


public class CountAlphabets {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        String string = sc.nextLine();

        int count = returnCount(string);

        System.out.println("Count:- ");
        System.out.println("Alphabets: "+ count);
    }

    public static int returnCount(String string) {
        
        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                count++;

        }

        return count;
    }
}
