// program to find that the given year is the leap year or not

import java.util.Scanner;

public class LeapYear {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if (isLeapYear(year))
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
        
        
    }

    public static boolean isLeapYear(int year) {

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
        
        return false;
    }

}
