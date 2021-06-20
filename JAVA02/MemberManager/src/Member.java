public class Member {
    private String name, tel;
    private int pt;
    //생성자
    public Member(String name, String tel, int pt) {
        this.name = name;
        this.tel = tel;
        this.pt = pt;
    }

    @Override   //object 부모 클래스에서 상속받은 toString() 메소드를 재정의
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", pt=" + pt +
                '}';
    }
//Setter & Getter : 멤버변수(속성)에 대한 접근 통로(인터페이스)

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public int getPt() {
        return pt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setPt(int pt) {
        this.pt = pt;
    }


}
