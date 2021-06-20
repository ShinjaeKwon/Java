import java.util.Scanner;

public class BoxManager {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=====[ 박스 관리 프로그램 ]=====");
        System.out.println("       1. 박스 생성");
        System.out.println("       2. 박스 상태 표시");
        System.out.println("       3. 물건 담기");
        System.out.println("       4. 물건 꺼내기");
        System.out.println("       5. 비우기");
        System.out.println("       6. 종료");
        System.out.println("=========================");
        Box box = null;  // 변수 선언
        while(true) {  // 무한반복
            System.out.print("메뉴선택 : ");
            int menu = in.nextInt();
            if(menu == 6) break;  // while 벗어나기
            switch(menu) {
                case 1: // 박스 객체생성
                    String label;
                    int w, b, h, wgt;
                    System.out.print("박스라벨 : "); label = in.next();
                    System.out.print("가로, 세로, 높이(cm) : ");
                    w = in.nextInt(); b = in.nextInt(); h = in.nextInt();
                    System.out.print("최대보관중량(kg) : "); wgt = in.nextInt();
                    //Box box = new Box();  // 알맹이가 없는 것. 생성되면 안됨.
                    box = new Box(label, w, b, h, wgt);  // 인자있는 생성자
                    System.out.println("** 새로운 박스가 생성되었습니다.");
                    break;
                case 2:
                    if(box != null) System.out.println(box); // 객체를 출력하면 실제로는 객체의 toString 메소드가 호출
                    break;
                case 3: int a;
                    System.out.print("담을 물건 무게(kg) : "); a = in.nextInt();
                    box.addItem(a);
                    break;
                case 4: int x;
                    System.out.print("빼낼 물건 무게(kg) : "); x = in.nextInt();
                    box.removeItem(x);
                case 5: box.empty();
                default:
                    System.out.println("잘못입력하였습니다.");
            }
        }
    }

}
