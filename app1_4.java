import java.util.Scanner;

public class app1_4{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // แสดงข้อความแจ้งเตือนผู้ใช้ให้กรอกข้อมูล
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        
        // รับค่ายอดคงเหลือ (balance) และอัตราดอกเบี้ยรายปี (annualInterestRate)
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        // คำนวณดอกเบี้ยสำหรับเดือนถัดไปตามสูตร
        double interest = balance * (annualInterestRate / 1200);

        // แสดงผลลัพธ์
        System.out.println("The interest is " + interest);

        input.close();
    }
}
