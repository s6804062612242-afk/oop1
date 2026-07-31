import java.util.Scanner;
public class op1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cal obj1 = new cal();
        obj1.X = sc.nextInt();
        obj1.N = sc.nextInt();
        System.out.println(obj1.cal(obj1.X,obj1.N));
    }
}
class cal{
    int X;
    int N;
    public double cal(int x,int n){
        double temp =0;
        for(int i=0;i<=n;i++){
            temp += Math.pow(x, i);
        }
        return temp;
    }
}
