import java.util.Scanner;

public class op1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่า n, a0 และ a1 จากผู้ใช้
        System.out.print("Please input n,  a0 and a1: ");
        int n = scanner.nextInt();
        long a0 = scanner.nextLong();
        long a1 = scanner.nextLong();

        // สร้าง Array สำหรับเก็บค่าตั้งแต่ a0 ถึง an
        // ใช้ long เพื่อรองรับตัวเลขขนาดใหญ่ที่เติบโตแบบก้าวกระโดด
        long[] a = new long[n + 1];

        // กำหนดค่าเริ่มต้น
        a[0] = a0;
        if (n >= 1) {
            a[1] = a1;
        }

        // คำนวณค่า ak ตั้งแต่ k = 2 ถึง n
        for (int k = 2; k <= n; k++) {
            a[k] = (long) k * k * a[k - 1] - a[k - 2] + (long) Math.pow(3, k);
        }

        // แสดงผลลัพธ์
        System.out.print("Output is: ");
        for (int i = 0; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}

