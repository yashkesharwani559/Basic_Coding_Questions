public class Pattern2 {
    public static void main(String[] args) {
        int n = 6;
        
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                if (i <= n / 2) {
                    for (int j = 0; j < ((n / 2) - i); j++) {
                        System.out.print("  ");
                    }
                    for (int k = 0; k < 2 * i + 1; k++) {
                        System.out.print("* ");
                    }
                } else {
                    for (int j = 0; j < i - (n / 2); j++) {
                        System.out.print("  ");
                    }
                    for (int k = 0; k < 2 * (n - i) - 1; k++) {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
        else{
            for (int i = 0; i < n; i++) {
                if (i < (n / 2)-1) {
                    for (int j = 0; j < ((n / 2) - i); j++) {
                        System.out.print("  ");
                    }
                    for (int k = 0; k < 2 * i + 1; k++) {
                        System.out.print("* ");
                    }
                } else if(n/2 == i || i == n/2-1) {
                    for (int j = 0; j < i - (n / 2)+1; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 0; k < 2 * (n - i) - 1; k++) {
                        System.out.print("* ");
                    }
                } else {
                    for (int j = 0; j < i - (n / 2); j++) {
                        System.out.print("  ");
                    }
                    for (int k = 0; k < 2 * (n - i) - 1; k++) {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
