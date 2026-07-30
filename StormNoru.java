import java.util.Scanner;

public class StormNoru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. รับข้อมูลพายุในบรรทัดแรก: xc, yc, r, v
        double xc = scanner.nextDouble();
        double yc = scanner.nextDouble();
        double r = scanner.nextDouble();
        double v = scanner.nextDouble();

        // 2. รับจำนวนบ้าน n
        int n = scanner.nextInt();

        // 3. รับพิกัดบ้าน n หลัง
        double[][] houses = new double[n][2];
        for (int i = 0; i < n; i++) {
            houses[i][0] = scanner.nextDouble(); // x
            houses[i][1] = scanner.nextDouble(); // y
        }

        // อาร์เรย์สำหรับบันทึกว่าบ้านหลังไหนถูกกระทบไปแล้วบ้าง
        boolean[] affected = new boolean[n];
        int totalAffectedCount = 0;

        // 4. วนลูปจำลองสถานการณ์ในแต่ละชั่วโมง
        // ลูปจะทำงานตราบใดที่ความเร็ว v >= 1.0
        while (v >= 1.0) {
            
            // เช็คบ้านแต่ละหลัง ณ ชั่วโมงปัจจุบัน
            for (int i = 0; i < n; i++) {
                // ถ้าบ้านหลังนี้ยังไม่เคยโดนพายุ
                if (!affected[i]) {
                    double hx = houses[i][0];
                    double hy = houses[i][1];

                    // คำนวณระยะห่างระหว่างบ้านกับจุดศูนย์กลางพายุ
                    double distance = Math.sqrt(Math.pow(hx - xc, 2) + Math.pow(hy - yc, 2));

                    // ถ้าบ้านอยู่ในรัศมีพายุ
                    if (distance <= r) {
                        affected[i] = true; // ทำเครื่องหมายว่าโดนผลกระทบแล้ว (เพื่อไม่ให้คิดซ้ำ)
                        totalAffectedCount++;
                    }
                }
            }

            // คำนวณการเปลี่ยนแปลงสำหรับชั่วโมงถัดไป
            xc = xc - v; // พายุเคลื่อนที่ไปทางทิศตะวันตก (ค่า x ลดลง)
            r = r * 0.8; // รัศมีลดลง 0.2 เท่า (เหลือ 80%)
            v = v * 0.8; // ความเร็วลดลง 0.2 เท่า (เหลือ 80%)
        }

        // 5. แสดงผลรวมจำนวนบ้านที่ได้รับผลกระทบทั้งหมด
        System.out.println(totalAffectedCount);

        scanner.close();
    }
}

