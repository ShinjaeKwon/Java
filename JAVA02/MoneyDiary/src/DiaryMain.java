import java.util.Scanner;

public class DiaryMain {
    private static Scanner sc=  new Scanner(System.in);
    private static int menu;
    private static void showMenu(){
        System.out.println("***** Money Diary *****");
        System.out.println("**    1. Add Note    **");
        System.out.println("**    2. Show Notes  **");
        System.out.println("**    0. Exit        **");
        System.out.print("Enter >> ");
        menu= sc.nextInt();

    }

    public static void main(String[] args){
        MoneyDiary diary;

        System.out.print("Diary Size : ");
        int size = sc.nextInt();
        diary = new MoneyDiary(size);
        while(true){
            showMenu();
            if(menu == 0) break;
            switch(menu){
                case 1:
                    diary.addNote();
                    break;
                case 2:
                    diary.showNotes();
                    break;
                case 3:
                    break;
                default:

            }
        }
    }
}
