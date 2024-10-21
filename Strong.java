// program to find that a given number is a strong(KrishnaMrthy number) number or not 
// a strong number is a number here sum of the factorial of digits is equal to the number
// 145 --> 1! + 4! + 5! = 145

import java.util.Scanner;


public class Strong {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the given number: ");
        int num = sc.nextInt();

        if  (isStrong(num))
            System.out.println(num  + " is a strong number.");
        else
            System.out.println(num  + " is not a strong number.");

    }
    
    public static boolean isStrong(int num) {

        int temp = num;
        int res = 0;

        while (temp > 0) {
            int t = temp % 10;
            res += factorial(t);
            temp /= 10;
        }
        
        if(res == num)
            return true;

        return false;
        
    }

    public static long factorial(int num) {
        if (num <= 1)
            return 1;

        long res = 1;

        for (int i = 1; i <= num; i++) {
            res *= i;
        }

        return res;
    }

}
