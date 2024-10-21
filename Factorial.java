// program to find the factorial of a number

import java.util.Scanner;

public class Factorial {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " is:  " + factorial(num));
        System.out.println("Factorial of " + num + " is:  " + factorial1(num));

    }

    // factorial using iteration(loops)
    public static long factorial(int num){
        if(num <= 0)
            return 0;
        
        long res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        
        return res;
    }

    
    // factorial using recursion
    public static long factorial1(int num) {
        if(num <= 0)
            return 0;
        else if(num == 1)
            return 1;
        else
        return num * factorial(num-1);
    }

}
