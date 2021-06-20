public interface Movable {
    public void move(int dx, int dy);
    default void setZero(int dx, int dy){
        dx = 0; dy =0;
    }

}
