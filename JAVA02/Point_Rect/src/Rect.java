public class Rect {
    private Point p1, p2;       //두개의 Point 객체로 좌표 상의 두 점을 나타냄

    //생성자 정의
    public Rect(){
        p1 = new Point();
        p2 = new Point();

    }       //기본 생성자

   public Rect(int a, int b, int c, int d){  //좌표 값을 변경하는 메소드
        p1.setX(a);
        p1.setY(b);
        p2.setX(c);
        p2.setY(d);
    }

    /*public Rect(int a, int b, int c, int d){        //생성자 중복 정의
        setPoints(a,b,c,d);
    }*/
    public Rect(Point p1, Point p2){
       this.p1 = p1;       //주소가 복사, r.p1에 있는 Point 객체 주소를 this.p1에 복사
        this.p2 = p2;
    }

    public Rect(Rect r){
        //복사 생성자(copy constructor)
      /*  p1 = r.p1;
        p2= r.p2;*/
        this.p1 = new Point();
        this.p2 = new Point();
        this.p1.setX(r.p1.getX());    //p1좌표의 x값을 복사사
        this.p1.setY(r.p1.getY());
        this.p2.setX(r.p2.getX());
        this.p2.setX(r.p2.getX());
    }

    public void setPoints(int x1, int y1, int x2, int y2){  //좌표 값을 변경하는 메소드

        p1.setX(x1);
        p1.setY(y1);
        p2.setX(x2);
        p2.setY(y2);

    }

    public int width() {
        int w;
        //w = p1.x;  // p1 객체의 속성에 직접 접근은 안됨. private으로 막아놓았기 떄문.
        w = Math.abs(p1.getX() - p2.getX());
        return w;
    }
    public int height() {
        int h;
        h = Math.abs(p1.getY() - p2.getY());
        return h;
    }


}
