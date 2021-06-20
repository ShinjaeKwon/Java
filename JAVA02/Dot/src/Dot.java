public class Dot {
    protected Point loc;
    protected int size;

    public Dot(){}
    public Dot(Point loc, int size) {
        this.loc = loc;
        this.size = size;
    }

    public Point getLoc() {
        return loc;
    }

    public void setLoc(Point loc) {
        this.loc = loc;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void move(int dx, int dy){
        //loc.x  += dx;
        loc.setX(loc.getX()+dx);
        loc.setY(loc.getY()+dy);

    }
}
