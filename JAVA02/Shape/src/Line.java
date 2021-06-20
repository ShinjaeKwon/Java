public class Line extends Shape implements Movable{
    private Point p2;
    public Line(Point p1, Point p2){       //p1은 Shape 객체 생성을 위해 필요, p2는 Line 속성 p2의 대입
      super(p1);    //Shape(Point p) 호출
      this.p2 = p2;
        /*  super();    //디폴트 생성자(Shape())를 실행해서 비어있는 p 변수를 메모리 할당
        p = p1;
        this.p2 =p2;*/
    }

    @Override
    public void draw() {
       System.out.println("Line=> "+ p + " : " + p2);
    }

    @Override
    public void size() {
        length();
    }

    public void length(){
        int dx, dy;
        dx = p2.getX()- p.getX();
        dy = p2.getY()- p.getY();
        double l = Math.sqrt(dx * dx + dy * dy);     //루트 계산
        System.out.println("Line length : "+l);
    }

    @Override
    public void move(int dx, int dy) {
        p.setX(p.getX() + dx);
        p.setY(p.getY() + dy);
        p2.setX(p2.getX() + dx);
        p2.setY(p2.getY() + dy);
    }
}
