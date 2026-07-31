import java.util.Scanner;

public class op1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Please input n,  a0 and a1: ");
        int n = scanner.nextInt();
        long a0 = scanner.nextLong();
        long a1 = scanner.nextLong();
        long[] a = new long[n + 1];

        
        a[0] = a0;
        if (n >= 1) {
            a[1] = a1;
        }
        for (int k = 2; k <= n; k++) {
            a[k] = (long) k * k * a[k - 1] - a[k - 2] + (long) Math.pow(3, k);
        }
        System.out.print("Output is: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}

