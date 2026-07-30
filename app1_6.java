 import java.util.Scanner;

public class app1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่าจำนวนคอลัมน์และแถวสูงสุดจากผู้ใช้
        System.out.print("Please input number of columns and rows: ");
        int maxCol = scanner.nextInt();
        int maxRow = scanner.nextInt();

        // 1. แสดงหัวข้อคอลัมน์ (เริ่มจาก 2 ถึง maxCol)
        System.out.printf("%4s", ""); // เว้นว่างมุมซ้ายบนไว้สำหรับส่วนของแถว
        for (int col = 2; col <= maxCol; col++) {
            System.out.printf("%4d", col);
        }
        System.out.println();

        // 2. แสดงข้อมูลในแต่ละแถว
        for (int row = 2; row <= maxRow; row++) {
            // แสดงเลขหัวข้อแถว
            System.out.printf("%4d", row);

            // คำนวณและแสดงผลคูณของแต่ละช่องในแถวนั้น
            for (int col = 2; col <= maxCol; col++) {
                int product = row * col;
                System.out.printf("%4d", product);
            }
            System.out.println(); // ขึ้นบรรทัดใหม่เมื่อจบแถว
        }

        scanner.close();
    }
}
