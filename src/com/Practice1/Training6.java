import java.util.Scanner;

public class Training6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오.>>");
        int value = scanner.nextInt();

        String res = "박수";
        if((value/10)%3 == 0) res+="짝";
        if((value%10)%3 == 0) res+="짝";
        System.out.println(res);
    }
}
