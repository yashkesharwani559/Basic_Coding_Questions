// program to print string to title case
import java.util.Scanner;


public class TitleString {
    static Scanner sc = new Scanner(System.in);
     

    public static void main(String[] args) {
        System.out.print("Enter the string: ");    
        String string = sc.nextLine();

        toTitleCase(string);
    }

    public static void toTitleCase(String string){
        String[] arr = string.split(" ");

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i].charAt(0);
            if (c >= 97 && c <= 112) {
                c = (char) (c - 32);
                arr[i] = arr[i].replace(arr[i].charAt(0), c);
            }
        }

        String res = "";

        for(String s : arr){
            res += (s+" ");
        }

        System.out.println("Old: "+string + ", New: " + res);
    }
}
