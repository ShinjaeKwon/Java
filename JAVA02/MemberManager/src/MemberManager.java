import java.util.ArrayList;

public class MemberManager {
    private ArrayList<Member> mlist2= new ArrayList<>();        //가변길이 배열 생성자가 필요 없음 /Collection class
    private Member[] mlist;         //데이터 객체 배열
    private int cnt, size;          //배열에 저장된 데이터 객체 개수, 최대 저장 개수(배열의 길이)
    //생성자
    public MemberManager(int s){
        mlist = new Member[s];
        cnt = 0;
        size = s;
    }
    public void add(Member m){
        mlist[cnt++] = m;
        mlist2.add(m);
    }

    public void showAll(){
       // for(Member m : mlist) if(m != null) System.out.println(m);
        for(int i = 0 ; i<cnt; i++) System.out.println(mlist[i]);
    }
}
