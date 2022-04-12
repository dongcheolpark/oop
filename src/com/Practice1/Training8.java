import java.util.Scanner;

public class Training8 {
    public static boolean inRect(int x,int y, int rectx1,int recty1,int rectx2,int recty2) {
        if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<= recty2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두 점을 입력하세요.>>");
        int x1,y1,x2,y2;
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        //사각형의 각 꼭지점이 두 점으로 이루어진 직사각형 안에 포함되는지 확인한다.
        boolean chk = false;
        chk |= inRect(x1,y1,100,100,200,200);
        chk |= inRect(x1,y2,100,100,200,200);
        chk |= inRect(x2,y1,100,100,200,200);
        chk |= inRect(x2,y2,100,100,200,200);
        chk |= inRect(100,100,x1,y1,x2,y2);
        chk |= inRect(100,200,x1,y1,x2,y2);
        chk |= inRect(200,100,x1,y1,x2,y2);
        chk |= inRect(200,200,x1,y1,x2,y2);
        System.out.println("이 직사각형은 (100,100) 과 (200,200) 직사각형에 포함" + (chk ? "됩니다.":"되지 않습니다."));
    }
}
