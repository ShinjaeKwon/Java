public class Rect extends Shape implements Movable, Scalable, Comparable{
    private int w, h;

    public Rect(Point p, int w, int h){
        super(p);
        this.w = w;
        this.h =h;
    }

    @Override
    public void draw() {
        System.out.println("Rect=> "+ p + " : "+w+" : "+h);
    }
    @Override
    public void size(){
        System.out.println("Rect size : "+(w*h));
    }
    public void setColor(String color){

    }

    @Override
    public void move(int dx, int dy) {
        p.setX(p.getX() + dx);
        p.setY(p.getY() + dy);
    }


    @Override
    public void scaleUp(int s) {
        if(s==0) s = BASE;
        w *= s;
        h *= s;
    }

    @Override
    public int compareTo(Object o) {
        Rect r  = (Rect)o;
        int size = w * h;
        if(size == (r.w * r.h)) return 0;
        else if(size > (r.w * r.h)) return 1;
        else return -1;
    }
}
