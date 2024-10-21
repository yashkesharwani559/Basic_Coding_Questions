// program to find the element in fibonacci series  nth position

import java.util.Scanner;


public class FibonacciNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the nth position: ");
        int num = sc.nextInt();

        System.out.println("Element at "+num+"th position: "+fibonacciTerm1(num));
    }

    // fibonacci using recursion
    public static long fibonacciTerm(int num) {
        if(num == 1)
            return 0;
        else if(num == 2)
            return 1;

        else {
            return fibonacciTerm(num-1) + fibonacciTerm(num-2);
        }
    }

    // fibonacci using iteration (loops)
    public static long fibonacciTerm1(int num) {

        int prev = 0;
        int next = 1;

        if (num == 1)
            return prev;

        else if (num == 2)
            return next;

        long res = next;

        for (int i = 2; i < num; i++) {
            res = next + prev;
            prev = next;
            next = (int) res;
        }
        
        return res;
    }

}
