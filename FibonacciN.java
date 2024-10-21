// program to print the n elements of the fibonacci series

import java.util.Scanner;


public class FibonacciN {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the nth position: ");
        int num = sc.nextInt();

        printFibonacciSeries1(num);

    }

    // series using recursion
    public static void printFibonacciSeries(int num){
        for(int i=1; i<= num; i++){
            System.out.print(fibonacciTerm(i) + ", ");
        }
    }
    // fibonacci using recursion
    public static long fibonacciTerm(int num) {
        if (num == 1)
            return 0;
        else if (num == 2)
            return 1;

        else {
            return fibonacciTerm(num - 1) + fibonacciTerm(num - 2);
        }
    }

    // series using iteration
    public static void printFibonacciSeries1(int num) {
        
        int prev = 0;
        int next = 1;

        if (num == 1)
            System.out.print("0, ");

        else if (num == 2)
            System.out.print("1, ");

        long res = next;

        System.out.print("0, 1, ");

        for (int i = 2; i < num; i++) {
            res = next + prev;
            prev = next;
            next = (int) res;
            System.out.print(res + ", ");
        }
        
    }
}
