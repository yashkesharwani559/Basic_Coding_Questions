// program to find if a given number is a prime number or not
import java.util.Scanner;


public class PrimeNumber {
    static Scanner sc = new Scanner(System.in);
    

    public static void main(String[] args) {
        System.out.print("Enter the number: ");    
        int num = sc.nextInt();

        if(isPrime2(num))
            System.out.println(num   + " is a prime number.");
        else
            System.out.println(num+ " is not a prime number.");

    }

    public static boolean isPrime(int num){
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrime2(int num){
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num%i == 0)
                return false;
        }
        return true;
    }
}
