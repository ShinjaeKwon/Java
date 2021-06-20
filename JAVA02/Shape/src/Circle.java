public class Circle extends Shape implements Scalable{
    private int r;

    public Circle(Point p, int r){
        super(p);
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Circle=> "+ p+ " : "+r);
    }
    public void size(){
        double area;
        area = r* r *3.1415;
        System.out.println("Circle size : "+ area);
    }

    @Override
    public void scaleUp(int s) {
        if(s == 0) s =BASE;
        r *= s;
    }
}
