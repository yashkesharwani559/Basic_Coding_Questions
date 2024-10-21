// program to find greater among three numbers

import java.util.Scanner;

public class Greater {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        System.out.println("Greatest number from "+a + ", "+b+" and "+c + " is:  "+greaterAmongThree(a,b,c));

    }

    public static int greaterAmongThree(int a, int b, int c){
        return ((a>b)?(a>c?a:c):(b>c?b:c));
    }
}
