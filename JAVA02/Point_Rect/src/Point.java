public class Point {
    private int x, y;

    public Point(){}

    public Point(int x, int y){
            this.x=x;       //this. : 객체 자신을 가리키는 참조
            this.y=y;
    }

    public void move(int a, int b){ //좌표 이동하기
        x += a;
        y += b;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }


}
