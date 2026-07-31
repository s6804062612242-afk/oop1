 import java.util.Scanner;

public class op1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input number of columns and rows: ");
        int maxCol = scanner.nextInt();
        int maxRow = scanner.nextInt();
        System.out.printf("%4s", "");
        for (int col = 2; col <= maxCol; col++) {
            System.out.printf("%4d", col);
        }
        System.out.println();

        for (int row = 2; row <= maxRow; row++) {
            
            System.out.printf("%4d", row);

        
            for (int col = 2; col <= maxCol; col++) {
                int product = row * col;
                System.out.printf("%4d", product);
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
