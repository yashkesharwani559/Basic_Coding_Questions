// program for swapping of two numbers

import java.util.Scanner;
 
public class Swap {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = new int[2];

        System.out.print("Enter the first number: ");
        arr[0] = sc.nextInt();

        System.out.print("Enter the second number: ");
        arr[1] = sc.nextInt();

        System.out.println(arr[0] + " " + arr[1]);

        // swap1(arr);
        // swap2(arr);
        swap3(arr);

        System.out.println(arr[0] + " " + arr[1]);

    }

    // swap normally
    static void swap1(int[] arr) {
        int c = arr[0];
        arr[0] = arr[1];
        arr[1] = c;
    }

    // swap without using extra variable
    static void swap2(int[] arr) {
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];
    }

    // swap without airthmetic operator
    static void swap3(int[] arr){
        arr[0] = arr[0] ^ arr[1];
        arr[1] = arr[0] ^ arr[1];
        arr[0] = arr[0] ^ arr[1];
    }

}