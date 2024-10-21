// write a program to find the number of alphabets, digits and spaces
import java.util.Scanner;


public class CountString {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the string: ");
        String string = sc.nextLine();

        int[] arr = returnCount(string);

        System.out.println("Count:- ");
        System.out.println("Alphabets: "+arr[0] + ", Digits: " + arr[1] + ", Spaces: "+arr[2]);
    }

    public static int[] returnCount(String string) {
        
        int[] arr = new int[3];

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                arr[0]++;

            else if (c >= '0' && c <= '9')
                arr[1]++;
            else if (c == ' ')
                arr[2]++;
        }

        return arr;
    }
}
