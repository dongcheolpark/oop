import java.util.Scanner;

public class Training10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1,y1,r1,x2,y2,r2;
        System.out.print("첫 번째 원의 중심과 반지름 입력>>");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        r1 = scanner.nextInt();
        System.out.print("두 번째 원의 중심과 반지름 입력>>");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        r2 = scanner.nextInt();
        double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println("두 원은 서로 겹" + (distance < r1+r2?"친다.":"치지 않는다."));
    }
}
