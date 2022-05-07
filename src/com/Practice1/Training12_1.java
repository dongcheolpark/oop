import java.util.Scanner;

public class Training12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산>>");
        float a,b;
        char op;
        a = scanner.nextFloat();
        op = scanner.next().charAt(0);
        b = scanner.nextFloat();
        float res = 0;
        if(op == '+') {
            res = a+b;
        }
        if(op == '-') {
            res = a-b;
        }
        if(op == '*') {
            res = a*b;
        }
        if(op == '/') {
            if(b == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                return;
            }
            res = a/b;
        }
        System.out.println(Float.toString(a) + op + Float.toString(b) + "의 계산결과는 " + res);
    }
}
