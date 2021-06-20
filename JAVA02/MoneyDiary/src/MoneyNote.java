import java.time.LocalDate;

public class MoneyNote {
    private String mdate;        //수입지출 일자
    private String note;            //수입지출내역
    private char inout;             //I  - 수입, O - 지출
    private int money;

    public MoneyNote(String mdate, String note, char inout, int money) {
        this.mdate = mdate;
        this.note = note;
        this.inout = inout;
        this.money = money;
    }

    @Override
    public String toString() {
        return  mdate + " : " + note + " : " +
                ((inout == 'I')?"수입" : "지출") +  " : " + money;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public char getInout() {
        return inout;
    }

    public void setInout(char inout) {
        this.inout = inout;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
