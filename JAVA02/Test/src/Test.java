import java.util. Scanner;

public class Test {
    public static void main(String args[]){
       /* int r;
        Scanner sc  = new Scanner(System.in);
        System.out.print("반지름 : ");
        r = sc.nextInt();
        System.out.println("원의 둘레 = "+ 2*r*3.14);    //출력 메소드
        System.out.println("원의 면적 = "+ r*r*3.14);
        */
        Scanner sc = new Scanner(System.in);
        double inch;
        int cm;
        System.out.print("키를 입력하세요 : ");
        cm = sc.nextInt();
        inch = cm/2.64;
        System.out.println(inch +"인치");
        System.out.printf("%5f", inch);

    }
}
