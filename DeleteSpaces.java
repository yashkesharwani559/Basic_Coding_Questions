// program to delete extra spaces from the string
import java.util.Scanner;


public class DeleteSpaces {
    static Scanner sc = new Scanner(System.in); 

     
    public static void main(String[] args){
        System.out.print("Enter the String: ");
        String string = sc.nextLine();

        System.out.println("Old: "+string + ", New: "+removeExtraSpaces(string));

    }

    public static String removeExtraSpaces(String string) {
        int startingIndex = 0, endingIndex = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                startingIndex = i;
                break;
            }
        }

        for  (int i = string.length( )  - 1 ;  i > -1;  i--) {
            if  (string.charAt(i) != ' ' ) {
                endingIndex = i;
                break;
            }
        }

        return string.substring(startingIndex, endingIndex + 1);
    }

}
