public class Tri extends Shape implements Movable{
    private Point p2, p3;

    public Tri(Point p1, Point p2, Point p3){
        super(p1);
        this.p2 =p2;
        this.p3 =p3;
    }
    @Override
    public void draw() {
        System.out.println("Tri=> "+p+" : "+p2+" : "+p3);
    }

    @Override
    public void size() {

    }

    //Overloading
    private void move(Point p, int dx, int dy){
        p.setX(p.getX() + dx);
        p.setY(p.getY() + dy);
    }
    @Override
    public void move(int dx, int dy) {
        move(p, dx, dy);
        move(p2, dx, dy);
        move(p3, dx, dy);
    }

    @Override
    public void setZero(int dx, int dy){

    }


}
