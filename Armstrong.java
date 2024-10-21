// program to find that a given number is an armstrong number

// 153 is an armstrong number because 1^3 + 5^3 + 3^3 = 153

import java.util.Scanner;

public class Armstrong {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (isArmstrong(num))
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");

    }

    public static boolean isArmstrong(int num) {

        int temp = num;

        int res = 0;

        while (temp > 0) {
            int t = temp % 10;
            res += Math.pow(t, 3);
            temp /= 10;
        }

        if(res == num)
            return true;
        
        return false;
    }

}
