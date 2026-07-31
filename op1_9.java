
    import java.util.Scanner;

public class op1_9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // กำหนดค่าเริ่มต้นให้น้อยที่สุด
        int count = 0;               // นับจำนวนครั้งที่ปรากฏ

        while (true) {
            int num = scanner.nextInt();

            // หยุดรับข้อมูลเมื่อผู้ใช้ป้อน 0
            if (num == 0) {
                break;
            }

            // ถ้าเจอตัวเลขใหม่ที่มากกว่าค่า max เดิม
            if (num > max) {
                max = num;
                count = 1; // รีเซ็ตนับ 1 ใหม่สำหรับ max ตัวใหม่
            } 
            // ถ้าเจอตัวเลขที่เท่ากับค่า max เดิม
            else if (num == max) {
                count++;   // บวกเพิ่มจำนวนครั้ง
            }
        }

        // แสดงผลลัพธ์: ค่ามากที่สุด และ จำนวนครั้งที่พบ
        if (count > 0) {
            System.out.println(max + " " + count);
        }

        scanner.close();
    }
}


