public abstract class Shape { //추상 클래스
    protected Point p;
    public Shape (Point p) {
        this.p = p;
    }

    public abstract void draw();    //추상 메소드
    public abstract void size();
  /*  public void move(int dx, int dy){
        p.setX(p.getX()+dx);
        p.setY(p.getY()+dy);
    }*/
}
