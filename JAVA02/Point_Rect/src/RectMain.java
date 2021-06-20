public class RectMain {
    public static void main(String args[]){
        Rect r =new Rect();     //기본 생성자 호출을 통해 Rect 객체 생성

        r.setPoints(2,3,8,11);
        System.out.println(r.width()+" : "+r.height());

        Rect r2 =new Rect(-2,3,5,-2);
        System.out.println(r2.width()+" : "+r2.height());

        Rect r3 = new Rect(new Point(3,9), new Point(9,-1));
        System.out.println(r3.width()+" : "+r3.height());

        Rect r4 = new Rect(r);      //복사해서 만들어라. 얕은복사(shallow copy) / 깊은 복사(deep copy)
        System.out.println(r4.width()+" : "+r4.height());

        r.setPoints(-3,8,11,-3);    //r의 p1과 p2는 새로 메모리 할당해서 객체 생성
        System.out.println(r.width()+" : "+r.height());
        System.out.println(r4.width()+" : "+r4.height());
    }

}
