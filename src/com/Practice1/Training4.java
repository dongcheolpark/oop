import java.util.Scanner;

public class Training4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;
        System.out.print("정수 3개 입력>>");

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        int mid = a;
        if(a>b) {
            if(b>c) mid = b;
            else if(a>c) {
                mid = c;
            }
            else mid = a;
        }
        else {
            if(a>c) mid = a;
            else if(b>c) {
                mid = c;
            }
            else mid = b;
        }
        System.out.println("중간 값은 " + mid);
    }
}
