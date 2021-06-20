public class Canvas {
    private Shape[] list;   //부모객체변수는 자식객체를 가리킬 수 있다.
    private int cnt;

    public Canvas(int size){
        list = new Shape[size];
        cnt = 0;
    }

    public void add(Shape s) {       //부모객체를 넣으면 자식들은 다 추가가 된다. 자식->부모 업캐스팅
        list[cnt++] = s;
    }
    public void draw() {
        for(int i=0; i<cnt; i++) list[i].draw();    //다형성 일어남 (어떤 오브젝트가 받는거에 따라서 결과가 달라짐)
    }
    public void move(int dx, int dy){
        for(int i=0; i<cnt; i++)
            if(list[i] instanceof  Rect || list[i] instanceof Line || list[i] instanceof Tri)
                ((Movable)list[i]).move(dx, dy);
    }
    public void size(){
        for(int i=0; i<cnt; i++) list[i].size();
    }
    public void fill(){
        for(int i=0; i<cnt; i++)
            if(list[i] instanceof Rect) ((Rect)list[i]).setColor("Red");
    }

    public void scaleUp(int s){
        for(int i=0; i<cnt; i++)
            if(list[i] instanceof  Rect || list[i] instanceof Circle) ((Scalable)list[i]).scaleUp(s);
    }
}
