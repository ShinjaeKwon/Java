import java.util.Scanner;

public class VocaMain {
    public static void main(String[] args) {
        VocaTest test = new VocaTest("voca1800.txt");
        Scanner sc = new Scanner(System.in);
        while(true){
            int menu;
            System.out.println("*******Vocaburary Test Program********");
            System.out.println("메뉴를 선택하세요");
            System.out.println("1) 1800 영어 단어집 생성");
            System.out.println("2) 1800 영어 단어 전체를 정렬하여 출력");
            System.out.println("3) 특정 영어 단어 검색 ");
            System.out.println("4) 영어 단어 추가");
            System.out.println("5) 영어 단어 삭제");
            System.out.println("6) 영어 암기 퀴즈 생성");
            System.out.println("7) 퀴즈 결과 확인");
            System.out.println("0) 프로그램 종료");
            System.out.println();
            System.out.print("메뉴 >> ");
            menu = sc.nextInt();
            if(menu == 1) test.load();
            else if(menu == 2) test.sort();
            else if(menu == 3) test.find();
            else if(menu == 4) test.add();
            else if(menu == 5) test.remove();
            else if(menu == 6) test.quiz();
            else if(menu == 7) test.quizResult();
            else if(menu == 0){
                System.out.println("영어 단어 프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("메뉴 선택이 잘못됬습니다. 다시 입력해 주세요.");
            }
        }
    }
}
