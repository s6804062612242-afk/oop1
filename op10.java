import java.util.Scanner;

public class op10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับข้อมูลพายุในบรรทัดแรก: xc, yc, r, v
        double xc = scanner.nextDouble();
        double yc = scanner.nextDouble();
        double r = scanner.nextDouble();
        double v = scanner.nextDouble();

        int n = scanner.nextInt();

        //  รับพิกัดบ้าน n หลัง
        double[][] houses = new double[n][2];
        for (int i = 0; i < n; i++) {
            houses[i][0] = scanner.nextDouble(); 
            houses[i][1] = scanner.nextDouble(); 
        }

        
        boolean[] affected = new boolean[n];
        int totalAffectedCount = 0;

        //  วนลูปจำลองสถานการณ์ในแต่ละชั่วโมง
    
        while (v >= 1.0) {
            
            // เช็คบ้านแต่ละหลัง 
            for (int i = 0; i < n; i++) {
                // ถ้าบ้านหลังนี้ยังไม่เคยโดนพายุ
                if (!affected[i]) {
                    double hx = houses[i][0];
                    double hy = houses[i][1];

                    // คำนวณระยะห่างระหว่างบ้านกับจุดศูนย์กลางพายุ
                    double distance = Math.sqrt(Math.pow(hx - xc, 2) + Math.pow(hy - yc, 2));

                    // ถ้าบ้านอยู่ในรัศมีพายุ
                    if (distance <= r) {
                        affected[i] = true; 
                        totalAffectedCount++;
                    }
                }
            }
            xc = xc - v; 
            r = r * 0.8; 
            v = v * 0.8; 
        }

        // แสดงผลรวมจำนวนบ้านที่ได้รับผลกระทบทั้งหมด
        System.out.println(totalAffectedCount);

        scanner.close();
    }
}

