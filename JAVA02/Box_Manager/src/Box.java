
public class Box {
    private String label;
    private int w, b, h, wgt, itemwgt;   // 가, 세, 높, 허용중량, 담긴물건중량합계
    public Box(String label, int w, int b, int h, int wgt) {
        super();  // 부모 객체 생성자 호출. 상속관계. 부모가 Object 클래스.
        this.label = label;
        this.w = w;
        this.b = b;
        this.h = h;
        this.wgt = wgt;
        itemwgt = 0;
    }

    @Override  // 부모에게 물려받은 메소드를 재정의 한것. 오버라이딩.

    public String toString() {
        if(itemwgt == 0)
            return label + "/" + w + "x" + b + "x" + h + "cm/" + wgt + "kg/" + "비어있음";
        else
            return label + "/" + w + "x" + b + "x" + h + "cm/" + wgt + "kg/" + itemwgt + "kg";
    }
    public void addItem(int a) {
        if((wgt - itemwgt) >= a) itemwgt += a;
        else System.out.println("여유공간이 부족합니다. 여유공간 : " + (wgt - itemwgt));
    }
    public void removeItem(int a) {
        if(itemwgt >= a) itemwgt -= a;
    }
    public void empty() {
        itemwgt = 0;
    }
}
