import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args){
        int size;
        Scanner sc = new Scanner(System.in);

        System.out.print("최대 보관 회원 수 : ");
        size = sc.nextInt();
     MemberManager manager = new MemberManager(size);
        manager.add(new Member("Bob", "010-6355-9873", 20));
        manager.add(new Member("John", "010-2334-9873", 20));
        manager.add(new Member("Mike", "010-4567-9873", 15));
        manager.add(new Member("Sera", "010-1247-9873", 24));
        manager.showAll();



    }
}
