import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MoneyDiary {
    private MoneyNote[] notes;      //수입지출데이터 셋
    private int cnt, balance;       //수입지출데이터 수, 잔액

    public MoneyDiary(int size){
     notes = new MoneyNote[size];
     cnt = balance = 0;
    }

    public void addNote(){
        Scanner sc =new Scanner(System.in);
        String mdate;
        String note;
        char inout;
        int money;
        System.out.print("날짜 : " ); //mdate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("yyyy.mm.dd"));
        mdate = sc.next();
        sc.nextLine();  //위 입력에서 남은 엔터 기호를 제거,
        System.out.print("내용 : " ); note = sc.nextLine();
        System.out.print("수입(I)/지출(O) : " ); inout = sc.next().charAt(0);
        System.out.print("금액 : " ); money =sc.nextInt();
        notes[cnt++] = new MoneyNote(mdate,note,inout,money);
        balance += (inout =='I')? money : money*(-1);
    }
    public void addNote(String mdate, String note, char inout, int money){
        notes[cnt++] = new MoneyNote(mdate,note,inout,money);
        balance += (inout =='I')? money : money*(-1);
    }
    public void addNote(MoneyNote note){
        notes[cnt++] = note;
        balance += (note.getInout() =='I')? note.getMoney() : note.getMoney()*(-1);
    }
    public void showNotes(){
        for(int i= 0 ; i<cnt; i++) System.out.println(notes[i]);
        System.out.println("잔액 = " + balance);
    }
    public void showNotes(String start, String end){

    }
}
